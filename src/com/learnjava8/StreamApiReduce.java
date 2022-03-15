package com.learnjava8;

import java.util.Arrays;
import java.util.List;

public class StreamApiReduce {
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		System.out.println(integers.stream()
		.reduce(0,(count,ele) -> count+ele));
	}

}
