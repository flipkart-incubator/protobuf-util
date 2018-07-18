package com.flipkart.protobuf.ext.example;


import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class ProgrammaticalConfig {

	public static void main(String[] args) throws RunnerException {
		Options opts = new OptionsBuilder()
//				.include(".*")
				.include(WarmupConfig.class.getSimpleName())
				.warmupIterations(10)
				.measurementIterations(20)
				.jvmArgs("-Xms4g", "-Xmx4g")
				.shouldDoGC(true)
				.forks(1)
				.build();

		new Runner(opts).run();
	}
}