package com.learnjava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> predicate = (value) -> value%2 == 0;
	static Predicate<Integer> predicate1 = (value) -> value%2 == 0;
	static Predicate<Integer> predicate2 = (value) -> value%5 == 0;
	
	public static void predicateAnd() {
		System.out.println("Predicate And result is:: "+ predicate1.and(predicate2).test(10));//predicate chaining
		System.out.println("Predicate And result is:: "+ predicate1.and(predicate2).test(9));//predicate chaining
	}
	
	public static void predicateOr() {
		System.out.println("Predicate Or result is:: "+ predicate1.or(predicate2).test(10));//predicate chaining
		System.out.println("Predicate Or result is:: "+ predicate1.or(predicate2).test(8));//predicate chaining
	}
	
	public static void predicateNegate() {
		System.out.println("Predicate Negate result is:: "+ predicate1.or(predicate2).negate().test(8));//predicate chaining
	}
	
	
	public static void main(String[] args) {
		System.out.println(predicate.test(4));
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
