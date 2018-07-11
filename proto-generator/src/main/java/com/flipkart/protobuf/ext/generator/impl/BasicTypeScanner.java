package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.ITypeScanner;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;

public class BasicTypeScanner implements ITypeScanner {
	public HashMap<Class<?>, String> classStringMap = new HashMap<Class<?>, String>() {{
		put(double.class, "double");
		put(float.class, "float");
		put(int.class, "int32");
		put(long.class, "int64");
		put(boolean.class, "bool");
		put(Double.class, "double");
		put(Float.class, "float");
		put(Integer.class, "int32");
		put(Long.class, "int64");
		put(Boolean.class, "bool");
		put(String.class, "string");
	}};


	@Override
	public HashMap<Class<?>, String> getDefaults() {
		return classStringMap;
	}

	@Override
	public HashMap<Class<?>, String> getTypeMap(Class tClass) {
		HashMap<Class<?>, String> typeMap = (HashMap<Class<?>, String>) classStringMap.clone();
		//recursiveTypeScan(tClass, typeMap);
		return typeMap;
	}

	private void recursiveTypeScan(Class tClass, HashMap<Class<?>, String> typeMap) {
		if (!typeMap.containsKey(tClass)) {
			typeMap.put(tClass, tClass.getSimpleName());

			if(tClass.isEnum()){

			}else {
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

				if(tClass.getSuperclass() != Object.class){
					recursiveTypeScan(tClass.getSuperclass(), typeMap);
				}
			}
		}
	}

}
