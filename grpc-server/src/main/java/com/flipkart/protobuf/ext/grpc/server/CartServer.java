package com.flipkart.protobuf.ext.grpc.server;

import com.flipkart.protobuf.ext.server.CartServerImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CartServer {
	private Server server;

	public static void main(String[] args) throws IOException, InterruptedException {
		CartServer server = new CartServer();
		server.start();
		server.blockUntilShutdown();
	}

	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	private void start() throws IOException {
		int port = 50051;
		server = ServerBuilder.forPort(port)
				.addService(new CartServerImpl())
				.build()
				.start();
		System.out.println("Started...");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutting down...");
				CartServer.this.stop();
			}
		});
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}
}
