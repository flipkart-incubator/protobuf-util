package com.flipkart.protobuf.ext.serde;

public interface ISerDe {
	<T> byte[] serialize(T object) throws Exception;

	<T> T deserialize(byte[] data, Class<T> clazz) throws Exception;
}
