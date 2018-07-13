package com.flipkart.protobuf.ext.generator;

import java.util.HashMap;

public interface ITypeScanner {
	HashMap<String, String> getDefaults();
	HashMap<String, String> getTypeMap(Class tClass);
}
