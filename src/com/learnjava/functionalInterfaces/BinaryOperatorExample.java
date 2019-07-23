package com.learnjava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Integer> comparator = (a, b)-> a.compareTo(b);
	
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
		System.out.println(binaryOperator.apply(3, 4));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		//Metodo maxBy recibe un comparator.
		System.out.println("Result of maxBy is:: "+maxBy.apply(5, 7));
		
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		//Metodo maxBy recibe un comparator.
		System.out.println("Result of minBy is:: "+minBy.apply(5, 7));
		
	}

}
