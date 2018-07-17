package com.flipkart.protobuf.ext.serde.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.protobuf.ext.serde.ISerDe;

import java.io.IOException;

public class JacksonSerDe implements ISerDe {
	private ObjectMapper objectMapper;

	public JacksonSerDe(ObjectMapper objectMapper) {

		this.objectMapper = objectMapper;
	}

	@Override
	public <T> byte[] serialize(T object) throws Exception {
		try {
			return objectMapper.writeValueAsBytes(object);
		} catch (JsonProcessingException e) {
			throw new Exception("Unable to serialize");
		}
	}

	@Override
	public <T> T deserialize(byte[] data, Class<T> clazz) throws Exception {
		try {
			return objectMapper.readValue(data, clazz);
		} catch (IOException e) {
			throw new Exception("Unable to deserialize");
		}
	}
}
