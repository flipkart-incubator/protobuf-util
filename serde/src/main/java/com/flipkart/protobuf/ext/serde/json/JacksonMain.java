package com.flipkart.protobuf.ext.serde.json;

import cart.client.v2.datamodels.CartInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class JacksonMain {
	public static void main(String[] args) throws Exception {
		String path="serde/src/main/resources/json/cart_response.txt";
//		File file = new File(path);
//		String contentStr = Resources.toString(Resources.getResource("json/cart_response.json"), Charset.defaultCharset());
//		Files.write(file.toPath(), contentStr.getBytes());
//		byte[] content = Files.readAllBytes(file.toPath());
//		ObjectMapper objectMapper = new ObjectMapper();
//		JacksonSerDe jacksonSerDe = new JacksonSerDe(objectMapper);
//		Object deserialize = jacksonSerDe.deserialize(content, Object.class);
//		byte[] serialize = jacksonSerDe.serialize(deserialize);
//		System.out.println(serialize.length);
//		System.out.println("Ended");

//		JacksonSerDeUtil jacksonSerDeUtil = new JacksonSerDeUtil(path);
		JacksonSerDeUtil jacksonSerDeUtil = new JacksonSerDeUtil();

		Object cartInfo = jacksonSerDeUtil.deserialize();
		System.out.println(new String(jacksonSerDeUtil.serialize(cartInfo)));
	}
}
