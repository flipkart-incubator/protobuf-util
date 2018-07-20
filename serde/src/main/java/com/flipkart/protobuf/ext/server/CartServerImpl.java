package com.flipkart.protobuf.ext.server;

import cart.client.v2.datamodels.CartInfo;
import com.flipkart.protobuf.ext.serde.proto.CartInfoSample;
import com.flipkart.protobuf.ext.server.CartServiceGrpc.CartServiceImplBase;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.stub.StreamObserver;

public class CartServerImpl extends CartServiceImplBase {
	private byte[] data;

	public CartServerImpl() {
		CartInfo cartInfo = CartInfoSample.getSampleCartInfo();
		this.data = cartInfo.toByteArray();
	}

	@Override
	public void getCart(GetRequest request, StreamObserver<CartInfo> responseObserver) {
		CartInfo cartInfo = null;
		try {
			cartInfo = CartInfo.parseFrom(data);
		} catch (InvalidProtocolBufferException e) {
			System.out.println("Unable to parse");
		}
		responseObserver.onNext(cartInfo);
		responseObserver.onCompleted();
	}
}
