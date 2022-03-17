package com.learnjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApiMinMax {

	/*
	 * Max Value
	 */
	static Optional<Integer> getMaxValue(List<Integer> integerList) {
		return integerList.stream()
					.reduce((res,currValue) -> res>currValue ? res : currValue);
	}
	
	/*
	 * Min Value
	 */
	static Optional<Integer> getMinValue(List<Integer> integerList){
		return integerList.stream()
					.reduce((res,currVal) -> res<currVal ? res : currVal);
	}
	public static void main(String[] args) {
		
		System.out.println("Maximum value of List : " + getMaxValue(Arrays.asList(12,21,13,31,14,41,15,51)).get());
		System.out.println("Minimum Value of List : " + getMinValue(Arrays.asList(12,21,13,31,14,41,15,51)).get());
	}

}
