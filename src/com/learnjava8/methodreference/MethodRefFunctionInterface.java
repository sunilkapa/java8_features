package com.learnjava8.methodreference;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class MethodRefFunctionInterface {

	static Function<String, String> toUpper = s -> s.toUpperCase();
	static Function<String, String> toUpperRef = String::toUpperCase;
	
	static List<Student> students = new StudentService().getAll();
	static Consumer<Student> consumer = System.out::println;
	static Consumer<Student> ativities = Student::getListActivities;
	
	public static void main(String[] args) {
		System.out.println(toUpper.apply("Sunny"));
		System.out.println(toUpperRef.apply("hello"));
		
		students.forEach(consumer);
		System.out.println("***********************");
		students.forEach(ativities);
		
		
	}

}
