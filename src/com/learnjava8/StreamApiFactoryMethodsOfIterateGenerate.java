package com.learnjava8;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamApiFactoryMethodsOfIterateGenerate {
	/*
	 * of() method of Stream class generates,stream of elements
	 */
	public static void ofMethod() {
		Stream<String> stringStream = Stream.of("Sunny","Sunil");
		stringStream.forEach(System.out::println);
	}
	
	/*
	 * iterate() method generate infinite stream
	 * accepts seed and unary operator --> takes one argument as input and 
	 * generate same type of value as output
	 */
	public static void generateExample() {
		Stream.iterate(1, x->x*2).forEach(System.out::println);
	}
	/*
	 * generate() method also used to generate infinite streams
	 * it accepts supplier as input
	 */
	static Supplier<Integer> supplier = () -> new Random().nextInt();
	public static void iterateExample() {
		Stream.generate(supplier).forEach(System.out::println);
	}
	public static void main(String[] args) {
		ofMethod();
		System.out.println("*************");
		generateExample();
		System.out.println("*************");
		iterateExample();
	}

}
