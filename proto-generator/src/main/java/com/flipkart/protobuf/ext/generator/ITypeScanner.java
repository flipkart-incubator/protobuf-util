package com.flipkart.protobuf.ext.generator;

import java.util.HashMap;

public interface ITypeScanner {
	HashMap<Class<?>, String> getDefaults();
	HashMap<Class<?>, String> getTypeMap(Class tClass);
}
