package com.flipkart.protobuf.ext.generator.utils;

public class ClassUtils {
	private static final char PACKAGE_SEPARATOR = '.';
	private static final char PATH_SEPARATOR = '/';

	public static String convertClassNameToResourcePath(String className) {
		return className.replace(PACKAGE_SEPARATOR, PATH_SEPARATOR);
	}
}
