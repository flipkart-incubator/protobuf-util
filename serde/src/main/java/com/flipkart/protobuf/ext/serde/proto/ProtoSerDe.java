package com.flipkart.protobuf.ext.serde.proto;

import cart.client.v2.datamodels.CartInfo;
import com.flipkart.protobuf.ext.serde.ISerDe;

public class ProtoSerDe implements ISerDe {
	@Override
	public <T> byte[] serialize(T object) {
		return null;
	}

	@Override
	public <T> T deserialize(byte[] data, Class<T> clazz) {
		return null;
	}
}
