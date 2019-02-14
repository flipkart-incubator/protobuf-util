package com.flipkart.protobuf.ext.proto;

import com.flipkart.protobuf.ext.serde.proto.CartInfoSample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ProtoFileCreator {
	public static void main(String[] args) throws IOException {
		File file = new File("benchmark/src/main/resources/proto/cart_response.txt");
		Files.write(file.toPath(), CartInfoSample.getSampleCartInfo().toByteArray());
	}
}
