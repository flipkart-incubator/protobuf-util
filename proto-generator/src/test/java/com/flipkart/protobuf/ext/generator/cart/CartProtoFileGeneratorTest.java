package com.flipkart.protobuf.ext.generator.cart;

import cart.client.endpoints.request.SvcAddItemsRequest;
import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicTypeScanner;
import javafx.util.Pair;
import org.junit.Test;

import java.io.IOException;
import java.util.Queue;

public class CartProtoFileGeneratorTest {
	IProtoFileGenerator protoFileGenerator = new BasicProtoFileGenerator(new BasicTypeScanner());

	@Test
	public void cartRequestGenerator() throws IOException {
		Queue<Pair<String, StringBuilder>> messages = protoFileGenerator.generate(SvcAddItemsRequest.class);
		System.out.println(protoFileGenerator.getMessages(messages));
		String resourceFolder = "proto-example/src/main/resources";
		String targetFolder = resourceFolder ;


		protoFileGenerator.build(targetFolder, messages);
	}
}
