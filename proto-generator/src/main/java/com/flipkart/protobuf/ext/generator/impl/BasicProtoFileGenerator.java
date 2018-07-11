package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.ITypeScanner;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class BasicProtoFileGenerator implements IProtoFileGenerator {
	private static String TAB = "\t";
	private static final String MESSAGE = "message";
	private static final String ENUM = "enum";
	private static final String REPEATED = "repeated";
	private static final String SPACE = " ";
	private static String OPEN_BRACE = "{";
	private static String CLOSE_BRACE = "}";
	private static String NEW_LINE = "\n";
	private static String EQUAL = "=";
	private static String SEMI_COLON = ";";
	private static String MAP_TYPE_SUFFIX = "Entry";
	private static String KEY = "key";
	private static String VALUE = "value";

	private ITypeScanner typeScanner;

	public BasicProtoFileGenerator(ITypeScanner typeScanner) {
		this.typeScanner = typeScanner;
	}

	@Override
	public String generate(Class tclass) {
		StringBuilder builder = new StringBuilder("syntax = \"proto3\";").append(NEW_LINE);
		String packageName = tclass.getPackage().getName();
		builder.append("option java_package = ").append("\"").append(packageName).append("\";").append(NEW_LINE);
		builder.append("option java_multiple_files = true;").append(NEW_LINE);

		getProtobufEquivalent(tclass, builder, typeScanner.getTypeMap(tclass), 0);
		return builder.toString();
	}

	private String getPrefix(Class tClass) {
		if (tClass.isEnum()) {
			return ENUM;
		}
		return MESSAGE;
	}

	private void getProtobufEquivalent(Class tclass, StringBuilder sb, HashMap<Class<?>, String> typeMap, int tabIndent) {
		startMessage(tclass, sb, tabIndent);
		typeMap.put(tclass, tclass.getSimpleName());
		tabIndent++;
		if (tclass.isEnum()) {
			handleEnum(tclass, sb, tabIndent);
		} else {
			handleClass(tclass, sb, typeMap, tabIndent, 1);
		}
		tabIndent--;
		endBrace(sb, tabIndent);
	}

	private void startMessage(Class tclass, StringBuilder sb, int tabIndent) {
		sb.append(getTabs(tabIndent)).append(getPrefix(tclass)).append(SPACE).append(tclass.getSimpleName()).append(OPEN_BRACE).append(NEW_LINE);
	}

	private void endBrace(StringBuilder sb, int tabIndent) {
		sb.append(getTabs(tabIndent)).append(CLOSE_BRACE).append(NEW_LINE);
	}

	private void handleClass(Class tclass, StringBuilder sb, HashMap<Class<?>, String> typeMap, int tabIndent, int fieldNumber) {
		Field[] fields = tclass.getDeclaredFields();
		int currentFieldNumber = fieldNumber;
		for (Field field : fields) {
			fieldGenerator(sb, typeMap, tabIndent, field, currentFieldNumber);
			currentFieldNumber++;
		}

		if (!tclass.getSuperclass().getTypeName().equals("java.lang.Object")) {
			handleClass(tclass.getSuperclass(), sb, typeMap, tabIndent, currentFieldNumber);
		}
	}

	private void handleEnum(Class tclass, StringBuilder sb, int tabIndent) {
		Object[] enumConstants = tclass.getEnumConstants();
		for (int i = 0; i < enumConstants.length; i++) {
			sb.append(getTabs(tabIndent)).append(enumConstants[i]).append(EQUAL).append(i).append(SEMI_COLON).append(NEW_LINE);
		}
	}

	private void fieldGenerator(StringBuilder sb, HashMap<Class<?>, String> typeMap, int tabIndent, Field field, int fieldNumber) {
		Class fieldType = field.getType();
		Class innerFieldtype = null;
		boolean repeated = isRepeatedFieldType(fieldType);
		if (repeated) {
			if (fieldType.isArray()) {
				innerFieldtype = fieldType.getComponentType();
			} else if (Collection.class.isAssignableFrom(fieldType)) {
				Type t = field.getGenericType();
				if (t instanceof ParameterizedType) {
					ParameterizedType tt = (ParameterizedType) t;
					innerFieldtype = (Class) tt.getActualTypeArguments()[0];
				}
			} else if (Map.class.isAssignableFrom(fieldType)) {
				String entryName = field.getName() + MAP_TYPE_SUFFIX;

				Type t = field.getGenericType();

				if (t instanceof ParameterizedType) {
					ParameterizedType tt = (ParameterizedType) t;
					Class innerType1 = (Class) tt.getActualTypeArguments()[0];
					Class innerType2 = (Class) tt.getActualTypeArguments()[1];
					buildEntryType(entryName, sb, innerType1, innerType2, typeMap, tabIndent);
				}
			}
		}
		Class effectiveType = getEffectiveType(fieldType, innerFieldtype);
		if (typeMap.containsKey(effectiveType)) {
			addFieldLine(sb, typeMap, tabIndent, field, fieldNumber, repeated, effectiveType);
			if (Map.class.isAssignableFrom(effectiveType)) {
				typeMap.remove(effectiveType);
				//hack: Removing Map.class from typeMap as every time it will be new one
			}
		} else {
			getProtobufEquivalent(effectiveType, sb, typeMap, tabIndent);
			addFieldLine(sb, typeMap, tabIndent, field, fieldNumber, repeated, effectiveType);
		}
	}

	private void addFieldLine(StringBuilder sb, HashMap<Class<?>, String> typeMap, int tabIndent, Field field, int fieldNumber, boolean repeated, Class effectiveType) {
		sb.append(getTabs(tabIndent)).append(repeated ? REPEATED : "").append(SPACE).append(typeMap.get(effectiveType)).append(SPACE).append(field.getName()).append(EQUAL).append(fieldNumber).append(SEMI_COLON).append(NEW_LINE);
	}

	private Class getEffectiveType(Class fieldType, Class innterFieldType) {
		if (innterFieldType == null) {
			return fieldType;
		}
		return innterFieldType;
	}

	private boolean isRepeatedFieldType(Class tClass) {
		if (tClass.isArray() || Collection.class.isAssignableFrom(tClass) || Map.class.isAssignableFrom(tClass)) {
			return true;
		}
		return false;
	}

	private void buildEntryType(String name, StringBuilder builder, Class inntertype1, Class innerType2, HashMap<Class<?>, String> typeMap, int tabIndent) {
		typeMap.put(Map.class, name);

		builder.append(getTabs(tabIndent)).append(MESSAGE).append(SPACE).append(name).append(OPEN_BRACE).append(NEW_LINE);

		tabIndent++;

		if (!typeMap.containsKey(inntertype1)) {
			getProtobufEquivalent(innerType2, builder, typeMap, tabIndent);
		}
		builder.append(getTabs(tabIndent)).append(SPACE).append(typeMap.get(inntertype1)).append(SPACE).append(KEY).append(EQUAL).append(1).append(SEMI_COLON).append(NEW_LINE);

		if (!typeMap.containsKey(innerType2)) {
			getProtobufEquivalent(innerType2, builder, typeMap, tabIndent);
		}
		builder.append(getTabs(tabIndent)).append(SPACE).append(typeMap.get(innerType2)).append(SPACE).append(VALUE).append(EQUAL).append(2).append(SEMI_COLON).append(NEW_LINE);

		tabIndent--;

		endBrace(builder, tabIndent);
	}

	private StringBuilder getTabs(int tabIndent) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tabIndent; i++) {
			sb.append(TAB);
		}

		return sb;
	}
}
