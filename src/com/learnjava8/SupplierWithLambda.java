package com.learnjava8;

import java.util.List;
import java.util.function.Supplier;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class SupplierWithLambda {

	static Supplier<Integer> supplier = () -> 10;
	static Supplier<List<Student>> students = () -> new StudentService().getAll();
	public static void main(String[] args) {
		
		System.out.println(supplier.get());
		System.out.println(students.get());
	}

}
