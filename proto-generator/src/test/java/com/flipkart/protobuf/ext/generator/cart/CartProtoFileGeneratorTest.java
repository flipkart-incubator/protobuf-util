package com.flipkart.protobuf.ext.generator.cart;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicTypeScanner;
import com.flipkart.protobuf.ext.generator.test.sample.PlainMessage;
import javafx.util.Pair;
import org.junit.Test;

import java.io.IOException;
import java.util.Queue;

public class CartProtoFileGeneratorTest {
	IProtoFileGenerator protoFileGenerator = new BasicProtoFileGenerator(new BasicTypeScanner());

	@Test
	public void cartRequestGenerator() throws IOException {
		Queue<Pair<String, StringBuilder>> messages = protoFileGenerator.generate(PlainMessage.class);
		System.out.println(protoFileGenerator.getMessages(messages));
		String resourceFolder = "proto-generator/src/test/resources";
		String targetFolder = resourceFolder + "/generated";


//		protoFileGenerator.build(targetFolder, messages);
	}
}
