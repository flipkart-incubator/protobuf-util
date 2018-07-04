package com.flipkart.protobuf.ext.example;


import com.flipkart.protobuf.ext.example.person.Person;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		Person build = Person.newBuilder().setId(1).build();
		System.out.println(build.toString());


	}
}
