package com.flipkart.protobuf.ext.serde.proto;

import com.flipkart.protobuf.ext.serde.ISerDe;

public class ProtoSerDe implements ISerDe {
	@Override
	public <T> String serialize(T object) {
		return null;
	}

	@Override
	public <T> T deserialize(byte[] data, Class<T> clazz) {
		return null;
	}
}
