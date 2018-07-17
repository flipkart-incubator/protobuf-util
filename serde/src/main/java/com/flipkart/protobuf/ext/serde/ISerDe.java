package com.flipkart.protobuf.ext.serde;

public interface ISerDe {
	<T> String serialize(T object);

	<T> T deserialize(byte[] data, Class<T> clazz);
}
