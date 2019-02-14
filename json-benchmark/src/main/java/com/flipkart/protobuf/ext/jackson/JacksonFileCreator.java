package com.flipkart.protobuf.ext.jackson;


import cart.client.utils.JsonUtils;
import cart.client.v2.endpoints.response.SvcGetCartLiteResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Files;

public class JacksonFileCreator {
	public static void main(String[] args) throws Exception {
		File file = new File("json-benchmark/src/main/resources/json/cartlite/cartlite_response.txt");
		byte[] bytes = Files.readAllBytes(file.toPath());
		ObjectMapper objectMapper = JsonUtils.getObjectMapper();
		SvcGetCartLiteResponse response = objectMapper.readValue(bytes, SvcGetCartLiteResponse.class);
		System.out.println(objectMapper.writeValueAsString(response));
	}
}
