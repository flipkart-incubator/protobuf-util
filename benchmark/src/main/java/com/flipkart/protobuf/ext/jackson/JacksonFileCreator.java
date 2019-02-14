package com.flipkart.protobuf.ext.jackson;


import com.flipkart.protobuf.ext.serde.ISerDe;
import com.flipkart.protobuf.ext.serde.json.JacksonSerDe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JacksonFileCreator {
	public static void main(String[] args) throws Exception {
		File file = new File("benchmark/src/main/resources/json/cart_response.txt");
		byte[] bytes = Files.readAllBytes(file.toPath());
		ISerDe serDe = new JacksonSerDe();
		serDe.deserialize(bytes, Object.class);
		System.out.println(new String(bytes));
	}
}
