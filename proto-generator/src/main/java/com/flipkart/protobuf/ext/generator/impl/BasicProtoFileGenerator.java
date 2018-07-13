package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.ITypeScanner;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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
		Queue<StringBuilder> messages = new ArrayBlockingQueue<StringBuilder>(10000);
		getProtobufEquivalent(tclass, messages, typeScanner.getTypeMap(tclass), 0);
		for (StringBuilder stringBuilder : messages) {
			builder.append(stringBuilder);
		}
		return builder.toString();
	}

	private String getPrefix(Class tClass) {
		if (tClass.isEnum()) {
			return ENUM;
		}
		return MESSAGE;
	}

	private void getProtobufEquivalent(Class tclass, Queue<StringBuilder> queue, HashMap<String, String> typeMap, int tabIndent) {
		StringBuilder sb = new StringBuilder();
		startMessage(getPrefix(tclass), tclass.getSimpleName(), sb, tabIndent);
		typeMap.put(tclass.getCanonicalName(), tclass.getSimpleName());
		tabIndent++;
		if (tclass.isEnum()) {
			sb.append(handleEnum(tclass, tabIndent));
		} else {
			sb.append(handleClass(tclass, queue, typeMap, tabIndent, 1));
		}
		tabIndent--;
		endBrace(sb, tabIndent);
		queue.add(sb);
	}

	private void startMessage(String prefix, String name, StringBuilder sb, int tabIndent) {
		sb.append(getTabs(tabIndent)).append(prefix).append(SPACE).append(name).append(SPACE).append(OPEN_BRACE).append(NEW_LINE);
	}

	private void endBrace(StringBuilder sb, int tabIndent) {
		sb.append(getTabs(tabIndent)).append(CLOSE_BRACE).append(NEW_LINE);
	}

	private StringBuilder handleClass(Class tclass, Queue<StringBuilder> queue, HashMap<String, String> typeMap, int tabIndent, int fieldNumber) {
		StringBuilder sb = new StringBuilder();
		Field[] fields = tclass.getDeclaredFields();
		int currentFieldNumber = fieldNumber;
		for (Field field : fields) {
			fieldGenerator(sb, queue, typeMap, tabIndent, field.getGenericType(), field.getName(), currentFieldNumber);
			currentFieldNumber++;
		}

		if (!tclass.getTypeName().equals("java.lang.Object") && tclass.getSuperclass().getTypeName().equals("java.lang.Object")) {
			StringBuilder stringBuilder = handleClass(tclass.getSuperclass(), queue, typeMap, tabIndent, currentFieldNumber);
			sb.append(stringBuilder);
		}
		return sb;
	}

	private StringBuilder handleEnum(Class tclass, int tabIndent) {
		StringBuilder sb = new StringBuilder();

		Object[] enumConstants = tclass.getEnumConstants();
		for (int i = 0; i < enumConstants.length; i++) {
			sb.append(getTabs(tabIndent)).append(enumConstants[i]).append(EQUAL).append(i).append(SEMI_COLON).append(NEW_LINE);
		}
		return sb;
	}

	private void fieldGenerator(StringBuilder sb, Queue<StringBuilder> queue, HashMap<String, String> typeMap, int tabIndent, Type genericType, String label, int fieldNumber) {
		Class tClass;
		if (genericType instanceof ParameterizedTypeImpl) {
			tClass = ((ParameterizedTypeImpl) genericType).getRawType();
		} else {
			tClass = (Class) genericType;
		}
		Class innerFieldtype = null;
		String entryName = null;
		boolean repeated = isRepeatedFieldType(tClass);
		if (repeated) {
			if (tClass.isArray()) {
				innerFieldtype = tClass.getComponentType();
			} else if (Collection.class.isAssignableFrom(tClass)) {
				if (genericType instanceof ParameterizedType) {
					ParameterizedType tt = (ParameterizedType) genericType;
					innerFieldtype = (Class) tt.getActualTypeArguments()[0];
				}
			} else if (Map.class.isAssignableFrom(tClass)) {
				entryName = label + MAP_TYPE_SUFFIX;
				if (genericType instanceof ParameterizedType) {
					ParameterizedType tt = (ParameterizedType) genericType;
					buildEntryType(entryName, queue, tt, typeMap, 0);
				}
			}
		}
		Class effectiveType = getEffectiveType(tClass, innerFieldtype);
		String typeMapKey = (entryName != null ? entryName : effectiveType.getCanonicalName());
		if (!typeMap.containsKey(typeMapKey)) {
			getProtobufEquivalent(effectiveType, queue, typeMap, 0);
		}

		addFieldLine(sb, typeMap.get(typeMapKey), tabIndent, label, fieldNumber, repeated, effectiveType);
	}

	private void addFieldLine(StringBuilder sb, String typeName, int tabIndent, String label, int fieldNumber, boolean repeated, Class effectiveType) {
		sb.append(getTabs(tabIndent)).append(repeated ? REPEATED + SPACE : "").append(typeName).append(SPACE).append(label).append(EQUAL).append(fieldNumber).append(SEMI_COLON).append(NEW_LINE);
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


	private void buildEntryType(String name, Queue<StringBuilder> queue, ParameterizedType tt, HashMap<String, String> typeMap, int tabIndent) {
		StringBuilder builder = new StringBuilder();
		typeMap.put(name, name);
		startMessage(MESSAGE, name, builder, tabIndent);

		tabIndent++;

		fieldGenerator(builder, queue, typeMap, tabIndent, tt.getActualTypeArguments()[0], KEY, 1);
		fieldGenerator(builder, queue, typeMap, tabIndent, tt.getActualTypeArguments()[1], VALUE, 2);

		tabIndent--;

		endBrace(builder, tabIndent);
		queue.add(builder);
	}


	private StringBuilder getTabs(int tabIndent) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tabIndent; i++) {
			sb.append(TAB);
		}

		return sb;
	}
}
