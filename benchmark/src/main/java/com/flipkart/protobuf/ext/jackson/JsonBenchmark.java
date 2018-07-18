package com.flipkart.protobuf.ext.jackson;

import com.flipkart.protobuf.ext.serde.ISerDe;
import com.flipkart.protobuf.ext.serde.json.JacksonSerDe;
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
public class JsonBenchmark {

	final Random RANDOM = new Random();

	private List<byte[]> byteArrayList;

	private List<Object> objectArrayList;

	@Param("dirPath")
	String dirPath;

	@Setup
	public void setup() throws Exception {
		ISerDe serDe = new JacksonSerDe();
		List<Path> allFilesPath = getAllFiles(this.dirPath);
		byteArrayList = new ArrayList<>(allFilesPath.size());
		objectArrayList = new ArrayList<>(allFilesPath.size());
		for (Path path : allFilesPath) {
			byteArrayList.add(Files.readAllBytes(path));
			objectArrayList.add(serDe.deserialize(Files.readAllBytes(path), Object.class));
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

	public Object getRandomObject() {
		return objectArrayList.get(RANDOM.nextInt(1000) % byteArrayList.size());
	}

	private static final ISerDe serDe = new JacksonSerDe();

	@Benchmark()
	public void deserialize(JsonBenchmark benchmarkData) throws Exception {
		serDe.deserialize(benchmarkData.getRandomByteArray(), Object.class);
	}


	@Benchmark()
	public void serialize(JsonBenchmark benchmarkData) throws Exception {
		serDe.serialize(benchmarkData.getRandomObject());
	}


	public static void main(final String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(JsonBenchmark.class.getSimpleName())
				.param("dirPath", "/Users/gaurav.prasad/gitCurrent/fk-github/protobuf-util/benchmark/src/main/resources/json")
				.mode(org.openjdk.jmh.annotations.Mode.All)
				.forks(1)
				.warmupIterations(1)
				.build();

		new Runner(opt).run();
	}

}
