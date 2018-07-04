package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Stack;

public class BasicProtoFileGenerator implements IProtoFileGenerator {
	private static String TAB = "\t";
	private static final String MESSAGE = "message";
	private static final String ENUM = "enum";
	private static final String SPACE = " ";
	private static String OPEN_BRACE = "{";
	private static String CLOSE_BRACE = "}";
	private static String NEW_LINE = "\n";
	private static String EQUAL = "=";
	private static String SEMI_COLON = ";";

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
	public String generate(Class tclass) {
		Stack<Class> classes = new Stack<>();
		classes.add(tclass);
		StringBuilder builder = new StringBuilder("syntax = \"proto3\";\n");
		String packageName = tclass.getPackage().getName();
		builder.append("option java_package = ").append("\"").append(packageName).append("\"\n");

		getProtobufEquivalent(tclass, builder, (HashMap<Class<?>, String>) classStringMap.clone(), 0);
		return builder.toString();
	}

	private void getProtobufEquivalent(Class tclass, StringBuilder sb, HashMap<Class<?>, String> typeMap, int tabIndent) {

		sb.append(getTabs(tabIndent)).append(tclass.isEnum() ? ENUM : MESSAGE).append(SPACE).append(tclass.getSimpleName()).append(OPEN_BRACE).append(NEW_LINE);
		typeMap.put(tclass, tclass.getSimpleName());
		tabIndent++;
		if (tclass.isEnum()) {
			Object[] enumConstants = tclass.getEnumConstants();
			for (int i = 0; i < enumConstants.length; i++) {
				sb.append(getTabs(tabIndent)).append(enumConstants[i]).append(EQUAL).append(i + 1).append(SEMI_COLON).append(NEW_LINE);
			}
		} else {
			Field[] fields = tclass.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				if (typeMap.containsKey(fields[i].getType())) {
					sb.append(getTabs(tabIndent)).append(typeMap.get(fields[i].getType())).append(SPACE).append(fields[i].getName()).append(EQUAL).append(i + 1).append(SEMI_COLON).append(NEW_LINE);
				} else {
					getProtobufEquivalent(fields[i].getType(), sb, typeMap, tabIndent);
					sb.append(getTabs(tabIndent)).append(typeMap.get(fields[i].getType())).append(SPACE).append(fields[i].getName()).append(EQUAL).append(i + 1).append(SEMI_COLON).append(NEW_LINE);
				}
			}
		}
		tabIndent--;
		sb.append(getTabs(tabIndent)).append(CLOSE_BRACE).append(NEW_LINE);
	}

	private StringBuilder getTabs(int tabIndent) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tabIndent; i++) {
			sb.append(TAB);
		}

		return sb;
	}
}
