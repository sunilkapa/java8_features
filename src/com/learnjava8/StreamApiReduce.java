package com.learnjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiReduce {
	
	static Optional<Student> getMeritStudent() {
		return new StudentService().getAll().stream()
							.reduce((s1,s2)->{
								if(s1.getGpa() > s2.getGpa())
									return s1;
								else
									return s2;
							});
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		System.out.println(integers.stream()
		.reduce(0,(count,ele) -> count+ele));
		
		if(getMeritStudent().isPresent())
			System.out.println("Student with highest GPA : " + getMeritStudent().get());
	}

}
