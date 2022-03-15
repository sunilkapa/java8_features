package com.learnjava8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiFilter {

	final static Predicate<Student> femalePredicate = student -> !student.getGender();
	
	final static Predicate<? super Student> checkActivity = student -> student.getActivities().contains("Cricket");
	
	public static List<Student> getFemaleStudents() {
		
		
		return new StudentService().getAll().stream()	
							.filter(femalePredicate)
							.collect(Collectors.toList());
	}
	
	public static List<Student> getCricketers(){
		return new StudentService().getAll().stream()
							.filter(checkActivity)
							.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(getFemaleStudents());
		System.out.println("Cricketers : " + getCricketers());
	}

}
