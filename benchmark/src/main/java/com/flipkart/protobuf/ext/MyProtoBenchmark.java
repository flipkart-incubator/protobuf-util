package com.flipkart.protobuf.ext;

import com.flipkart.protobuf.ext.serde.proto.CartInfoSample;
import com.flipkart.protobuf.ext.serde.proto.ProtoSerDeUtil;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

public class MyProtoBenchmark {
	@State(value = Scope.Benchmark)
	public static class MyState {
		public CartInfoSample cartInfoSample = new CartInfoSample();
		public ProtoSerDeUtil protoSerDeUtil = new ProtoSerDeUtil();
	}

	@Benchmark
	public void myProtoBenchmark(MyState myState) throws Exception {
		myState.protoSerDeUtil.serialize(myState.cartInfoSample.getSampleCartInfo());
	}
}
