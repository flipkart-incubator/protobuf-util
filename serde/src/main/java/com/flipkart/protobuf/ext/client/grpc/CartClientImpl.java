package com.flipkart.protobuf.ext.client.grpc;

import cart.client.v2.datamodels.CartInfo;
import com.flipkart.protobuf.ext.serde.proto.CartInfoSample;
import com.flipkart.protobuf.ext.server.CartServiceGrpc;
import com.flipkart.protobuf.ext.server.CartServiceGrpc.CartServiceImplBase;
import com.flipkart.protobuf.ext.server.GetRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class CartClientImpl {
	private final CartServiceGrpc.CartServiceBlockingStub blockingStub;
	private final ManagedChannel channel;

	public CartClientImpl(String host, int port) {
		this(ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext()
				.build());
	}

	public CartClientImpl(ManagedChannel channel) {
		this.channel = channel;
		this.blockingStub = CartServiceGrpc.newBlockingStub(channel);
	}


	public CartInfo makeGetCart() {
		GetRequest request = GetRequest.newBuilder().setId("id").build();
		return blockingStub.getCart(request);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
}
