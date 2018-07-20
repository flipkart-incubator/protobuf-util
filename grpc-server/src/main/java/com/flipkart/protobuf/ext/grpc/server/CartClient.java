package com.flipkart.protobuf.ext.grpc.server;

import cart.client.v2.datamodels.CartInfo;
import com.flipkart.protobuf.ext.client.grpc.CartClientImpl;

public class CartClient {

	public static void main(String[] args) {
		CartClientImpl client = new CartClientImpl("localhost", 50051);
		CartInfo cartInfo = client.makeGetCart();
		System.out.println(cartInfo.getId());
	}
}
