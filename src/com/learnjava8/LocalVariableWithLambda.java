package com.learnjava8;

import java.util.function.Consumer;

public class LocalVariableWithLambda {

	//int a = 10;
	
	static int c = 10;
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		/* 
		 * Not allowed to use same variable name in lambda expression
		 * which already declared as local variable
		 */
		Consumer<Integer> consumer = a-> System.out.println("i : " + a);
		
		/*
		 * Local variable declared within the scope of lambda is final or effectively final
		 * means no modification of local variable allowed inside lambda expression 
		 */
		Consumer<Integer> con1 = x -> {
			b=b+10; // Not allowed, Commenet out line 15 error will pop up
		};
		
		/*
		 * for instance variables no restrictions (static variables)
		 */
		
		Consumer<Integer> cons2 = c->{
			c=c+10;
		};
		
		Consumer<Integer> consumer1 = i->System.out.println(b++);
		
		//consumer.accept(20);
		System.out.println("i : " + a);
	}

}
