package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.ITypeScanner;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;

public class BasicTypeScanner implements ITypeScanner {
	public HashMap<String, String> classStringMap = new HashMap<String, String>() {{
		put(double.class.getCanonicalName(), "double");
		put(float.class.getCanonicalName(), "float");
		put(int.class.getCanonicalName(), "int32");
		put(long.class.getCanonicalName(), "int64");
		put(boolean.class.getCanonicalName(), "bool");
		put(Double.class.getCanonicalName(), "double");
		put(Float.class.getCanonicalName(), "float");
		put(Integer.class.getCanonicalName(), "int32");
		put(Long.class.getCanonicalName(), "int64");
		put(Boolean.class.getCanonicalName(), "bool");
		put(String.class.getCanonicalName(), "string");
	}};


	@Override
	public HashMap<String, String> getDefaults() {
		return classStringMap;
	}

	@Override
	public HashMap<String, String> getTypeMap(Class tClass) {
		HashMap<String, String> typeMap = (HashMap<String, String>) classStringMap.clone();
		//recursiveTypeScan(tClass, typeMap);
		return typeMap;
	}

	private void recursiveTypeScan(Class tClass, HashMap<Class<?>, String> typeMap) {
		if (!typeMap.containsKey(tClass)) {
			typeMap.put(tClass, tClass.getSimpleName());

			if (tClass.isEnum()) {

			} else {
				Field[] fields = tClass.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					Class<?> fieldType = fields[i].getType();

					if (!typeMap.containsKey(fieldType)) {
						if (fields[i].getGenericType() instanceof ParameterizedType) {
							fieldType = (Class) ((ParameterizedType) fields[i].getGenericType()).getActualTypeArguments()[0];
						}
						recursiveTypeScan(fieldType, typeMap);
					}
				}

				if (tClass.getSuperclass() != Object.class) {
					recursiveTypeScan(tClass.getSuperclass(), typeMap);
				}
			}
		}
	}

}
