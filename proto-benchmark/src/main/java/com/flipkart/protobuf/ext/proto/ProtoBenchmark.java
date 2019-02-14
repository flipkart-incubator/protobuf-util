package com.flipkart.protobuf.ext.proto;

import cart.client.v3.endpoints.response.SvcGetCartLiteResponse;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@State(Scope.Benchmark)
public class ProtoBenchmark {

	final Random RANDOM = new Random();

	private List<byte[]> byteArrayList;

	private List<SvcGetCartLiteResponse> objectArrayList;

	@Param("dirPath")
	String dirPath;

	@Setup
	public void setup() throws Exception {
		List<Path> allFilesPath = getAllFiles(this.dirPath);
		byteArrayList = new ArrayList<>(allFilesPath.size());
		objectArrayList = new ArrayList<>(allFilesPath.size());
		for (Path path : allFilesPath) {
			byteArrayList.add(Files.readAllBytes(path));
			objectArrayList.add(SvcGetCartLiteResponse.parseFrom(Files.readAllBytes(path)));
		}
	}

	private List<Path> getAllFiles(String folderPath) throws IOException {
		List<Path> files = new ArrayList<>();
		Files.walkFileTree(Paths.get(folderPath), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				files.add(file);
				return FileVisitResult.CONTINUE;
			}
		});
		return files;
	}

	public byte[] getRandomByteArray() {
		return byteArrayList.get(RANDOM.nextInt(1000) % byteArrayList.size());
	}

	public SvcGetCartLiteResponse getRandomObject() {
		return objectArrayList.get(RANDOM.nextInt(1000) % byteArrayList.size());
	}


	@Benchmark()
	public void deserialize(ProtoBenchmark benchmarkData) throws Exception {
        SvcGetCartLiteResponse response = SvcGetCartLiteResponse.parseFrom(benchmarkData.getRandomByteArray());
	}


	@Benchmark()
	public void serialize(ProtoBenchmark benchmarkData) throws Exception {
		benchmarkData.getRandomObject().toByteArray();
	}


	public static void main(final String[] args) throws RunnerException {
		String dirPath = args.length > 0 ? args[0]: "proto-benchmark/src/main/resources/proto/cartlite";
		Options opt = new OptionsBuilder()
				.include(ProtoBenchmark.class.getSimpleName())
				.param("dirPath", dirPath)
				.mode(Mode.All)
				.forks(1)
				.warmupIterations(1)
				.build();

		new Runner(opt).run();
	}

}
