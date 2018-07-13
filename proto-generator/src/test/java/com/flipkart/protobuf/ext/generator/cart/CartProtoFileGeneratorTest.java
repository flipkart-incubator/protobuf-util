package com.flipkart.protobuf.ext.generator.cart;

import cart.client.endpoints.request.SvcAddItemsRequest;
import cart.client.v2.endpoints.response.SvcCompleteCartResponse;
import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicTypeScanner;
import org.junit.Test;

public class CartProtoFileGeneratorTest {
	IProtoFileGenerator protoFileGenerator = new BasicProtoFileGenerator(new BasicTypeScanner());

	@Test
	public void cartRequestGenerator() {
		String generate = protoFileGenerator.generate(SvcAddItemsRequest.class);
		System.out.println(generate);
	}
}
