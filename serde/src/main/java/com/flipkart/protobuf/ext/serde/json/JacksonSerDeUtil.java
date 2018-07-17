package com.flipkart.protobuf.ext.serde.json;

import cart.client.v2.datamodels.CartInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.protobuf.ext.serde.ISerDe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JacksonSerDeUtil {
	private byte[] content;
	private ISerDe serDe;

	public JacksonSerDeUtil() throws IOException {
		this("serde/src/main/resources/json/cart_response.txt");
	}
	public JacksonSerDeUtil(String jsonPath) {
		File file = new File(jsonPath);
		try {
			this.content = Files.readAllBytes(file.toPath());
		} catch (IOException e) {
		}
		this.serDe = new JacksonSerDe(new ObjectMapper());
	}

	public byte[] serialize(Object object) throws Exception {
		return serDe.serialize(object);
	}

	public Object deserialize() throws Exception {
		return serDe.deserialize(content, Object.class);
	}
}
