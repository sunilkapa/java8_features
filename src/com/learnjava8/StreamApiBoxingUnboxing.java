package com.learnjava8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiBoxingUnboxing {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10). //Stream of Primitive ints
				boxed(). //Integer Steam
				collect(Collectors.toList());
	}
	
	public static int unboxing(List<Integer> intList) {
		return intList.stream().
				mapToInt(Integer::intValue).
				sum();
	}
	public static void main(String[] args) {
		System.out.println("Boxing : " + boxing());
		System.out.println("Unboxing : " + unboxing(boxing()));
	}

}
