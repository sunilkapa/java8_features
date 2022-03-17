package com.learnjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;

public class StreamApiLimitSkip {
/*
 * Limit --> If List contains 100 ele and given limit as 10, 
 * only first 10 elements will be considered
 */
	static Function<Integer, List<Integer>> randomInts = (noOfValues) -> {
		Random rand= new Random();
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < noOfValues; i++) {
			list.add(rand.nextInt(noOfValues));
		}
		System.out.println("List : " + list);
		return list;
	};
	
	/*
	 * Limit --> If List contains 100 ele and given limit as 10, 
	 * only first 10 elements will be considered
	 */
	
	static Optional<Integer> getMaxWithLimit() {
		List<Integer> list = randomInts.apply(100);
		return list.stream().
				limit(10).
				reduce((res,currVal)->res>currVal ? res : currVal);
	}
	
	/*
	 * Skip --> If List cotains 100 ele and given skip as 10,
	 * first 10 ele ignored and remaining elements considered for processing
	 */
	
	static Optional<Integer> getMinWithSkip() {
		List<Integer> list = randomInts.apply(10);
		return list.stream().
			skip(3).
			reduce((res,currVal) -> res < currVal ? res : currVal);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Max Value : " + getMaxWithLimit().get());
		System.out.println("Min Value : " + getMinWithSkip().get());
	}

}
