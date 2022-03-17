package com.learnjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPiAnyMatchAllMatchNoneMatch {
/*
 * anyMatch, allMatch and noneMatch
 * takes a predicate as input and boolean as output
 */

static Predicate<Integer> anyMatch = a -> a>10 ? true : false;
static Predicate<Integer> allMatch = a -> a<0 ? false : true;
static Predicate<Integer> noneMatch = a -> a == 0 ? true : false;
	
/*
 * anymatch --> returns true if any one ele of stream satisfies predicate
 */
static Boolean anyMatch() {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	return list.stream().anyMatch(anyMatch);
}
/*
 * allMatch --> returns true only if all ele of stream satisfies predicate 
 */
static Boolean allMatch() {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
	return list.stream().allMatch(allMatch);
}
/*
 * noneMatch --> returns true only if all ele of stream violates predicate (opposite to allMatch)	
 */
static Boolean noneMatch() {
	List<Integer> list = Arrays.asList(1,2,3,4);
	return list.stream().noneMatch(noneMatch);
}
	public static void main(String[] args) {
		System.out.println("Any Match : " + anyMatch());
		System.out.println("All Match : " + allMatch());
		System.out.println("None Match : " + noneMatch());
	}

}
