package com.learnjava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	//paramtro de entrada y retorno son del mismo tipo
	static UnaryOperator<String> unaryOperator = (str) -> str.concat("Default");
	static UnaryOperator<Integer> unaryOperator1 = (value) -> value+value;
	
	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("java8"));
		System.out.println(unaryOperator1.apply(5));
	}

}
