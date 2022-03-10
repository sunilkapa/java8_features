package com.learnjava8;

import java.util.Comparator;

public class ComparatorWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java7 Way
		 *
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("COmparing Java 7 way : " + comparator.compare(10, 20));
		/*
		 * Java8
		 */
		Comparator<Integer> comparator2 = (o1,o2) -> o1.compareTo(o2);
		System.out.println("COmparing Java 8 way : " + comparator2.compare(10, 20));
	}

}
