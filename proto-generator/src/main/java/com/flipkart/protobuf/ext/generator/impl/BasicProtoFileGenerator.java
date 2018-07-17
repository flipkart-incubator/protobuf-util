package com.flipkart.protobuf.ext.generator.impl;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.ITypeScanner;
import com.flipkart.protobuf.ext.generator.utils.ClassUtils;
import javafx.util.Pair;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
	public Queue<Pair<String, StringBuilder>> generate(Class tclass) {
		Queue<Pair<String, StringBuilder>> messages = new ArrayBlockingQueue<Pair<String, StringBuilder>>(10000);
		getProtobufEquivalent(tclass, messages, typeScanner.getTypeMap(tclass), 0);
		return messages;
	}

	@Override
	public String getMessages(Queue<Pair<String, StringBuilder>> messages) {
		StringBuilder builder = new StringBuilder();
		for (Pair<String, StringBuilder> pair : messages) {
			builder.append(pair.getValue());
		}
		return builder.toString();
	}

	@Override
	public boolean build(String basePath, Queue<Pair<String, StringBuilder>> messages) throws IOException {
		Path path = Paths.get(basePath);
		Files.createDirectories(path);


		for (Pair<String, StringBuilder> pair : messages) {
			File file = new File(path.toFile().getCanonicalPath() + "/" + getDirectoryPath(pair.getKey()) + ".proto");
			Files.createDirectories(file.getParentFile().toPath());
			Files.write(file.toPath(), pair.getValue().toString().getBytes());
		}
		return false;
	}

	private String getDirectoryPath(String className) {
		return ClassUtils.convertClassNameToResourcePath(className);
	}

	private String getPrefix(Class tClass) {
		if (tClass.isEnum()) {
			return ENUM;
		}
		return MESSAGE;
	}

	private void getProtobufEquivalent(Class tclass, Queue<Pair<String, StringBuilder>> queue, HashMap<String, String> typeMap, int tabIndent) {
		StringBuilder builder = new StringBuilder("syntax = \"proto3\";").append(NEW_LINE);
		String packageName = tclass.getPackage().getName();
		builder.append("option java_package = ").append("\"").append(packageName).append("\";").append(NEW_LINE);
		builder.append("option java_multiple_files = true;").append(NEW_LINE);
		builder.append("package ").append(packageName).append(SEMI_COLON).append(NEW_LINE);

		StringBuilder sb = new StringBuilder();
		startMessage(getPrefix(tclass), tclass.getSimpleName(), sb, tabIndent);
		typeMap.put(getPackageName(tclass), getPackageName(tclass));
		tabIndent++;
		Set<String> importList = new HashSet<>();
		if (tclass.isEnum()) {
			sb.append(handleEnum(tclass, tabIndent));
		} else {
			sb.append(handleClass(tclass, queue, importList, typeMap, tabIndent, 1));
		}

		tabIndent--;
		endBrace(sb, tabIndent);
		Set<String> newTypes = typeScanner.getNewTypes(importList);
		for (String entry : newTypes) {
			builder.append("import \"").append(ClassUtils.convertClassNameToResourcePath(entry)).append(".proto\"").append(SEMI_COLON).append(NEW_LINE);
		}
		builder.append(sb);
		queue.add(new Pair<String, StringBuilder>(getPackageName(tclass), builder));
	}

	private void startMessage(String prefix, String name, StringBuilder sb, int tabIndent) {
		sb.append(getTabs(tabIndent)).append(prefix).append(SPACE).append(name).append(SPACE).append(OPEN_BRACE).append(NEW_LINE);
	}

	private void endBrace(StringBuilder sb, int tabIndent) {
		sb.append(getTabs(tabIndent)).append(CLOSE_BRACE).append(NEW_LINE);
	}

	private StringBuilder handleClass(Class tclass, Queue<Pair<String, StringBuilder>> queue, Set<String> importList, HashMap<String, String> typeMap, int tabIndent, int fieldNumber) {
		StringBuilder sb = new StringBuilder();
		Field[] fields = tclass.getDeclaredFields();
		int currentFieldNumber = fieldNumber;
		for (Field field : fields) {
			fieldGenerator(sb, queue, importList, typeMap, tabIndent, field.getGenericType(), field.getName(), currentFieldNumber);
			currentFieldNumber++;
		}

		if (!tclass.getTypeName().equals("java.lang.Object") && !tclass.getSuperclass().getTypeName().equals("java.lang.Object")) {
			StringBuilder stringBuilder = handleClass(tclass.getSuperclass(), queue, importList, typeMap, tabIndent, currentFieldNumber);
			sb.append(stringBuilder);
		}
		return sb;
	}

	private StringBuilder handleEnum(Class tclass, int tabIndent) {
		StringBuilder sb = new StringBuilder();

		Field[] fields = tclass.getFields();
		for (int i = 0; i < fields.length; i++) {
			sb.append(getTabs(tabIndent)).append(fields[i].getName()).append(EQUAL).append(i).append(SEMI_COLON).append(NEW_LINE);
		}
		return sb;
	}

	private void fieldGenerator(StringBuilder sb, Queue<Pair<String, StringBuilder>> queue, Set<String> importList, HashMap<String, String> typeMap, int tabIndent, Type genericType, String label, int fieldNumber) {
		Class tClass;
		Class innerFieldtype = null;
		String entryName = null;
		if (genericType instanceof ParameterizedTypeImpl) {
			ParameterizedTypeImpl parameterizedType = (ParameterizedTypeImpl) genericType;
			tClass = parameterizedType.getRawType();
			if (tClass.getTypeName().equals("com.google.common.base.Optional")) {
				innerFieldtype = (Class) parameterizedType.getActualTypeArguments()[0];
			}

		} else {
			tClass = (Class) genericType;
		}

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
					buildEntryType(sb, entryName, queue, importList, tt, typeMap, tabIndent);
				}
			}
		}
		Class effectiveType = getEffectiveType(tClass, innerFieldtype);
		String typeMapKey = (entryName != null ? entryName : getPackageName(effectiveType));
		if (!typeMap.containsKey(typeMapKey)) {
			getProtobufEquivalent(effectiveType, queue, typeMap, 0);
		}

		importList.add(getPackageName(effectiveType));
		addFieldLine(sb, typeMap.get(typeMapKey), tabIndent, label, fieldNumber, repeated);
	}

	private void addFieldLine(StringBuilder sb, String typeName, int tabIndent, String label, int fieldNumber, boolean repeated) {
		if (typeName.contains(".")) {
			typeName = "." + typeName;
		}
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

	private void buildEntryType(StringBuilder builder, String name, Queue<Pair<String, StringBuilder>> queue, Set<String> importList, ParameterizedType tt, HashMap<String, String> typeMap, int tabIndent) {
		typeMap.put(name, name);
		startMessage(MESSAGE, name, builder, tabIndent);

		tabIndent++;

		fieldGenerator(builder, queue, importList, typeMap, tabIndent, tt.getActualTypeArguments()[0], KEY, 1);
		fieldGenerator(builder, queue, importList, typeMap, tabIndent, tt.getActualTypeArguments()[1], VALUE, 2);

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

	private String getPackageName(Class tClass){
		if(tClass.getPackage() == null){
			return tClass.getCanonicalName();
		}
		return tClass.getPackage().getName() + "." + tClass.getSimpleName();
	}
}
