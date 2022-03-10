package com.learnjava8;

import java.util.function.UnaryOperator;

public class UnaryOperatorWithLambda {

	static UnaryOperator<String> nameConcat = name -> "Welcome " + name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nameConcat.apply("Sunil"));
	}

}
