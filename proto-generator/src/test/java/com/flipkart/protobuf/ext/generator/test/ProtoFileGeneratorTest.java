package com.flipkart.protobuf.ext.generator.test;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicTypeScanner;
import com.flipkart.protobuf.ext.generator.test.sample.*;
import com.google.common.io.Resources;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;


public class ProtoFileGeneratorTest {
	IProtoFileGenerator protoFileGenerator = new BasicProtoFileGenerator(new BasicTypeScanner());

	public ProtoFileGeneratorTest() {

	}

	@Test
	public void testProtoFileGeneration() throws Exception {
		validate("sample message validation", SampleMessage.class, "sample_message.proto");
		validate("plain message validation", PlainMessage.class, "plain_message.proto");
		validate("message with array", MessageWithArray.class, "array_message.proto");
		validate("message with list", MessageWithList.class, "list_message.proto");
		validate("message with basic map", MessageWithMap.class, "map_message.proto");
		validate("message with type map", MessageWithTypeMap.class, "type_map_message.proto");
		validate("message with inheritance", BaseClassImpl.class, "inheritance_message.proto");
		validate("message with double inheritance", TwoLevelImpl.class, "double_inheritance_message.proto");
	}

	private void validate(String message, Class tclass, String fileNameToMatch) {
		String generate = protoFileGenerator.generate(tclass);
		String actual = generate.replaceAll("\\s", "");
		String expected = readResource(fileNameToMatch, Charset.defaultCharset()).replaceAll("\\s", "");
		System.out.println(generate);
		Assert.assertTrue(message, actual.equals(expected));
	}

	public String readResource(final String fileName, Charset charset) {
		try {
			return Resources.toString(Resources.getResource(fileName), charset);
		} catch (Exception e) {
			return "";
		}
	}
}
