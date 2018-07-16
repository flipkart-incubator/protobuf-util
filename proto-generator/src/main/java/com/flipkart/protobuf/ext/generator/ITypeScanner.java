package com.flipkart.protobuf.ext.generator;

import java.util.HashMap;
import java.util.Set;

public interface ITypeScanner {
	HashMap<String, String> getDefaults();
	HashMap<String, String> getTypeMap(Class tClass);

	Set<String> getNewTypes(Set<String> importList);
}
