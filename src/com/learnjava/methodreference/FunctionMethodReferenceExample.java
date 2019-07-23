package com.learnjava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	
	static Function<String, String> toUpperCaseLambda = value -> value.toUpperCase();
	static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
	
	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda.apply("java8"));
		System.out.println(toUpperCaseMethodReference.apply("java8"));
	}

}
