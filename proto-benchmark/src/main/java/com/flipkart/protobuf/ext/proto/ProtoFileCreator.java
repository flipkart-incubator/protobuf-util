package com.flipkart.protobuf.ext.proto;

import cart.client.v3.endpoints.response.SvcGetCartLiteResponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ProtoFileCreator {
    public static void main(String[] args) throws IOException {
//		File file = new File("benchmark/src/main/resources/proto/cart_response.txt");
//		Files.write(file.toPath(), CartInfoSample.getSampleCartInfo().toByteArray());

        File file = new File("proto-benchmark/src/main/resources/proto/cartlite/cartlite_response.txt");
        byte[] bytes = Files.readAllBytes(file.toPath());

        SvcGetCartLiteResponse response = SvcGetCartLiteResponse.parseFrom(bytes);
        System.out.println(response);


    }
}
