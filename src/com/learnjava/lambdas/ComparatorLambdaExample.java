package com.learnjava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
	
	public static void main(String[] args) {
		/**
		 * Prior to java 8
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);//0 -> o1 == o2, 1 -> o1 > o2, -1 -> o1 < 02  
			}
		};
		System.out.println(comparator.compare(10, 20));
		
		Comparator<Integer> comparatorLambda = (a,b)-> a.compareTo(b);
		System.out.println(comparatorLambda.compare(10, 20));
	}

}
