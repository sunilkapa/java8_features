package com.learnjava8;

import java.util.List;
import java.util.stream.Collectors;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiMapMethod {

	static List<String> getNames(){
		return new StudentService().getAll().stream()
						.map(Student::getName)//.map(student -> student.getName())
						.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNames());
	}

}
