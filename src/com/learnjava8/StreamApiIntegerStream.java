package com.learnjava8;

import java.util.stream.IntStream;

public class StreamApiIntegerStream {
	public static int sumOfNumbers() {
		return IntStream.rangeClosed(1, 6).sum();
	}
	public static void main(String[] args) {
		System.out.println("Sum of numbers :" + sumOfNumbers());
	}

}
