package com.learnjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamApiFindAnyFindFirst {
	/*
	 * findAny and findFirst work in same context but difference encountered 
	 * when run stream in parallel.. cover later :)
	 */
	
	/*
	 * findAny and findFirst will take predicate as input and returns 
	 * first element which satisfies criteria and won't look for next elements 
	 */
	static Predicate<Integer> find = a -> a>10 ? true : false;

	static Optional<Integer> findAny() {
		List<Integer> list = Arrays.asList(1,2,3,10,20,30,0,-1);
		return list.stream().
				filter(find).
				findAny();
	}

	static Optional<Integer> findFirst(){
		List<Integer> list = Arrays.asList(1,2,3,4,10,20,30);
		return list.stream().filter(find).findFirst();
	}
	public static void main(String[] args) {
		System.out.println("Find Any : " + findAny());
		System.out.println("Find First : " + findFirst());
	}

}
