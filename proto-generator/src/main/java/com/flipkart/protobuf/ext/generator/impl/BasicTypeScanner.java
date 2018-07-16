package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.ITypeScanner;

import java.util.*;

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
		put("org.joda.time.DateTime", "google.protobuf.Timestamp");
	}};

	public HashMap<String, String> overrideMap = new HashMap<String, String>() {{
		put("org.joda.time.DateTime", "google.protobuf.timestamp");
	}};

	public Set<String> importNotRequired = new HashSet<String>() {{
		add(Map.class.getCanonicalName());
	}};


	@Override
	public HashMap<String, String> getDefaults() {
		return classStringMap;
	}

	@Override
	public HashMap<String, String> getTypeMap(Class tClass) {
		HashMap<String, String> typeMap = (HashMap<String, String>) classStringMap.clone();
		return typeMap;
	}

	@Override
	public Set<String> getNewTypes(Set<String> importList) {
		Set<String> newTypeList = new HashSet<>();
		for (String importEntry : importList) {
			if (isImportRequired(importEntry)) {
				newTypeList.add(importEntry);
			} else if (overrideMap.containsKey(importEntry)) {
				newTypeList.add(overrideMap.get(importEntry));
			}
		}
		return newTypeList;
	}

	private boolean isImportRequired(String typeName) {
		if (classStringMap.containsKey(typeName) || importNotRequired.contains(typeName)) {
			return false;
		}
		return true;
	}
}
