package com.flipkart.protobuf.ext.generator.test.sample;

public enum SampleEnumType {

	MOBILE("MOBILE_PHONE"),
	HOME,
	WORK;

	private String label;

	private SampleEnumType(String label) {

		this.label = label;
	}

	private SampleEnumType() {

	}
}
