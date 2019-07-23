package com.learnjava.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiconsumerExample {
	
	public static void main(String[] args) {
		BiConsumer<String, String> biconsumer = new BiConsumer<String, String>() {
			@Override
			public void accept(String val1, String val2) {
				System.out.println("val1 :: "+ val1 + ", val2:: "+val2);
			}
		};
		biconsumer.accept("java7", "java8");
		
	}

}
