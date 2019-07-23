package com.learnjava.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumer1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};
		consumer1.accept("hola");
		
		Consumer<String> consumer2 = (value) -> System.out.println(value.toUpperCase());
		consumer2.accept("java8");
		
		Consumer<Integer> consumer3 = (value) -> System.out.println(value*value);
		consumer3.accept(3);
	}

}
