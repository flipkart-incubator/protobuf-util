package com.flipkart.protobuf.ext.grpc;

import com.flipkart.protobuf.ext.client.grpc.CartClientImpl;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Benchmark)
public class GRPCBenchMark {
	CartClientImpl cartClient;

	@Setup
	public void setup() {
		cartClient = new CartClientImpl("localhost", 50051);
	}

	@Benchmark()
	public void get() throws Exception {
		cartClient.makeGetCart();
	}

	@TearDown
	public void stop() {
		try {
			cartClient.shutdown();
		} catch (Exception ignore) {
		}
	}

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(GRPCBenchMark.class.getSimpleName())
				.mode(Mode.All)
				.forks(1)
				.warmupIterations(1)
				.build();

		new Runner(opt).run();
	}
}
