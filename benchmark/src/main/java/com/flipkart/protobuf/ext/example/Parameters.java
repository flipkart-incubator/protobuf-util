package com.flipkart.protobuf.ext.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

public class Parameters {

	public static void main(String[] args) throws IOException, RunnerException {
		org.openjdk.jmh.Main.main(args);
	}

	@Fork(value = 1, warmups = 1)
	@Benchmark
	@BenchmarkMode(Mode.Throughput)
	public void runSample(BenchmarkParams params) {
		for (int i = 0; i <= params.loops; i++) {
			params.sb.append("num ").append(i).append("\n");
		}
		System.out.println(params.sb.toString());
	}

	@State(Scope.Benchmark)
	public static class BenchmarkParams {

		@Param({"1", "20", "40", "100", "1000"})
		public int loops;

		public StringBuffer sb;

		@Setup(Level.Invocation)
		public void setup() {
			sb = new StringBuffer();
		}
	}
}
