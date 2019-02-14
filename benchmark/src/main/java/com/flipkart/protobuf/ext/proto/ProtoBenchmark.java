package com.flipkart.protobuf.ext.proto;

import cart.client.v2.datamodels.CartInfo;
import com.flipkart.protobuf.ext.serde.ISerDe;
import com.flipkart.protobuf.ext.serde.json.JacksonSerDe;
import com.flipkart.protobuf.ext.serde.proto.CartInfoSample;
import com.flipkart.protobuf.ext.serde.proto.ProtoSerDe;
import com.flipkart.protobuf.ext.serde.proto.ProtoSerDeUtil;
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

	private List<CartInfo> objectArrayList;

	@Param("dirPath")
	String dirPath;

	@Setup
	public void setup() throws Exception {
		ProtoSerDeUtil serDe = new ProtoSerDeUtil();
		List<Path> allFilesPath = getAllFiles(this.dirPath);
		byteArrayList = new ArrayList<>(allFilesPath.size());
		objectArrayList = new ArrayList<>(allFilesPath.size());
		for (Path path : allFilesPath) {
			byteArrayList.add(Files.readAllBytes(path));
			objectArrayList.add(serDe.deserialize(Files.readAllBytes(path)));
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

	public CartInfo getRandomObject() {
		return objectArrayList.get(RANDOM.nextInt(1000) % byteArrayList.size());
	}

	private static final ProtoSerDeUtil serDe = new ProtoSerDeUtil();

	@Benchmark()
	public void deserialize(ProtoBenchmark benchmarkData) throws Exception {
		serDe.deserialize(benchmarkData.getRandomByteArray());
	}


	@Benchmark()
	public void serialize(ProtoBenchmark benchmarkData) throws Exception {
		serDe.serialize(benchmarkData.getRandomObject());
	}


	public static void main(final String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(ProtoBenchmark.class.getSimpleName())
				.param("dirPath", "benchmark/src/main/resources/proto")
				.mode(Mode.All)
				.forks(1)
				.warmupIterations(1)
				.build();

		new Runner(opt).run();
	}

}
