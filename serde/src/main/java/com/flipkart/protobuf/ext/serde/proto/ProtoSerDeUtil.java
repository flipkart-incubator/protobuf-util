package com.flipkart.protobuf.ext.serde.proto;

import cart.client.v2.datamodels.CartInfo;

public class ProtoSerDeUtil {
	public ProtoSerDeUtil(){
		CartInfoSample.getSampleCartInfo();
	}

	public byte[] serialize(CartInfo cartInfo) throws Exception {
		return cartInfo.toByteArray();
	}

	public CartInfo deserialize(byte[] content) throws Exception {
		return CartInfo.parseFrom(content);
	}

	public static void main(String[] args) {
		CartInfo sampleCartInfo = CartInfoSample.getSampleCartInfo();
		System.out.println(sampleCartInfo);
	}
}
