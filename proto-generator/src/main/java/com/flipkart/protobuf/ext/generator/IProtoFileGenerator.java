package com.flipkart.protobuf.ext.generator;

import javafx.util.Pair;

import java.io.IOException;
import java.util.Queue;

public interface IProtoFileGenerator {
	Queue<Pair<String, StringBuilder>> generate(Class tclass);

	String getMessages(Queue<Pair<String, StringBuilder>> messages);

	boolean build(String basePath, Queue<Pair<String, StringBuilder>> messages) throws IOException;
}
