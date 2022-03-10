package com.learnjava8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorWithLambda {

	static BinaryOperator<Integer> mul = (a,b) -> a * b;
	
	static Comparator<Integer> compare = (num1,num2) -> num1.compareTo(num2);
	public static void main(String[] args) {
		System.out.println(mul.apply(13, 13));
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(compare);
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compare);
		
		System.out.println("Minimum Value : " + minBy.apply(12, -1));
		System.out.println("Maximum Value : " + maxBy.apply(13, 12));
	}

}
