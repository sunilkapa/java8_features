package com.learnjava8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.learnjava8.model.Student;

public class ConstructorReferenceFunctionInterface {
	
	/*
	 * Expectation is Student class should have no arg constructor
	 */
	
	static Supplier<Student> supplier = Student::new; 
	
	/*
	 * Expectation here is student class should have one arg construtor
	 */
	
	static Function<String, Student> function = Student::new;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(supplier.get());
		
		System.out.println(function.apply("Sunil"));
	}

}
