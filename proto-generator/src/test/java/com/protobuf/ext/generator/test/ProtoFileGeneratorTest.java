package com.protobuf.ext.generator.test;

import com.protobuf.ext.generator.IProtoFileGenerator;
import com.protobuf.ext.generator.impl.BasicProtoFileGenerator;
import com.protobuf.ext.generator.test.sample.Person;
import com.protobuf.ext.generator.test.sample.SearchRequest;
import org.junit.Test;


public class ProtoFileGeneratorTest {
	IProtoFileGenerator protoFileGenerator = new BasicProtoFileGenerator();
	public ProtoFileGeneratorTest() {

	}

	@Test
	public void testSimpleClass() {
		String generate = protoFileGenerator.generate(Person.class);
		System.out.println(generate);
	}

	@Test
	public void testSimpleClassWithEnum() {
		String generate = protoFileGenerator.generate(SearchRequest.class);
		System.out.println(generate);
	}
}
