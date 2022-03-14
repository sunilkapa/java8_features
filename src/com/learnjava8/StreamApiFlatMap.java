package com.learnjava8;

import java.util.List;
import java.util.stream.Collectors;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiFlatMap {

	/*
	 * In context of Stream<List<T>>, or Stream<Map<T>> Collectors.toList will not work
	 * Collectors.toList() accepts, Stream<T> as input not Stream<List<T>>, or Stream<Map<T>>
	 * In such situations, flatMap() will work out
	 */
	
	public static List<String> getActivities(){
		/*
		 * List<List<String>> collect = new StudentService().getAll().stream()
		 * .map(Student::getActivities) .collect(Collectors.toList());
		 * 
		 * see the assignment variable here
		 */
		
		return new StudentService().getAll().stream()
							.map(Student::getActivities)
							.peek((list -> System.out.println(list)))
							.flatMap(List::stream)
							.peek((list -> System.out.println("after flat map " + list)))
							.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getActivities());
	}

}
