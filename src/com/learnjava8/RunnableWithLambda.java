package com.learnjava8;

public class RunnableWithLambda {

	public static void main(String[] args) {
		
		/*
		 * Java 1.7
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable java 7");
			}
		};
		new Thread(runnable).start();	
		
		/*
		 * Java8
		 */
		Runnable runnable2 = () -> {
			System.out.println("Inside Runnable2");
		};
		new Thread(runnable2).start();
		
		Runnable runnable3 = () -> System.out.println("Inside Runnable3");
		new Thread(runnable3).start();
		
		new Thread(() -> System.out.println("Inside Runnable 4 ")).start();
	}

}
