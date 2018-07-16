package com.flipkart.protobuf.ext.generator.test;

import com.flipkart.protobuf.ext.generator.IProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicProtoFileGenerator;
import com.flipkart.protobuf.ext.generator.impl.BasicTypeScanner;
import com.flipkart.protobuf.ext.generator.test.sample.*;
import com.google.common.io.Resources;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Queue;


public class ProtoFileGeneratorTest {
	private IProtoFileGenerator protoFileGenerator = new BasicProtoFileGenerator(new BasicTypeScanner());

	public ProtoFileGeneratorTest() {

	}

	@Test
	public void testProtoFileGeneration() throws Exception {
		validate("sample message validation", SampleMessage.class, "sample_message.txt");
		validate("plain message validation", PlainMessage.class, "plain_message.txt");
		validate("message with array", MessageWithArray.class, "array_message.txt");
		validate("message with list", MessageWithList.class, "list_message.txt");
		validate("message with basic map", MessageWithMap.class, "map_message.txt");
		validate("message with type map", MessageWithTypeMap.class, "type_map_message.txt");
		validate("message with list type map", MessageWithListTypeMap.class, "list_type_map_message.txt");
		validate("message with inheritance", BaseClassImpl.class, "inheritance_message.txt");
		validate("message with double inheritance", TwoLevelImpl.class, "double_inheritance_message.txt");
	}

	private void validate(String message, Class tclass, String fileNameToMatch) {
		Queue<Pair<String, StringBuilder>> messages = protoFileGenerator.generate(tclass);
		String generate = protoFileGenerator.getMessages(messages);
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
