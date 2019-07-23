package com.learnjava.lambdas;

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
		/**
		 * Prior(anterior) to java 8
		 */
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside runnable");
			}
		};
		new Thread(runnable).start();
		
		/**
		 * Java 8 lambda
		 */
		Runnable runnableLambda1 = ()->{
			System.out.println("Inside runnable 1");
		};
		new Thread(runnableLambda1).start();
		
		Runnable runnableLambda2 = () -> System.out.println("Inside runnable 2");
		new Thread(runnableLambda2).start();
		
		
		new Thread(new Runnable() {	
			@Override
			public void run() {
				System.out.println("Inside runnable 3.1");
			}
		});
		new Thread(()-> System.out.println("inside runnable 3")).start();;
		
	}

}
