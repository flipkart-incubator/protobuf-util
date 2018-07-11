package com.flipkart.protobuf.ext.generator.test;

import com.flipkart.protobuf.ext.generator.ITypeScanner;
import com.flipkart.protobuf.ext.generator.impl.BasicTypeScanner;
import com.flipkart.protobuf.ext.generator.test.sample.BaseClassImpl;
import com.flipkart.protobuf.ext.generator.test.sample.SampleMessage;
import org.junit.Test;

import java.util.HashMap;

public class TypeScannerTest {
	@Test
	public void testScanningPerson() {
		ITypeScanner typeScanner = new BasicTypeScanner();
		HashMap<Class<?>, String> typeMap = typeScanner.getTypeMap(SampleMessage.class);
		typeMap.forEach((x, y) -> {
			if (!typeScanner.getDefaults().containsKey(x)) {
				System.out.println(x.getTypeName() + " " + y);
			}
		});
	}

	@Test
	public void testScanningPaymentBase() {
		ITypeScanner typeScanner = new BasicTypeScanner();
		HashMap<Class<?>, String> typeMap = typeScanner.getTypeMap(BaseClassImpl.class);
		typeMap.forEach((x, y) -> {
			if (!typeScanner.getDefaults().containsKey(x)) {
				System.out.println(x.getTypeName() + " " + y);
			}
		});
	}
}
