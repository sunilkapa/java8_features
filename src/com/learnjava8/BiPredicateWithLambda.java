package com.learnjava8;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class BiPredicateWithLambda {
	
	static List<Student> students = new StudentService().getAll();
	
	static BiPredicate<Double, Integer> gpaAndgrade = (gpa,grade) -> gpa>=3.9 && grade>=4;
	static BiConsumer<String, List<String>> nameAndActivities = (name,activities) -> System.out.println("Name : " + name + " Activities : " + activities);
	
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p1 = (a,b) -> a > b;
		System.out.println(p1.test(10, 20));
		
		students.forEach((student -> {
			if(gpaAndgrade.test(student.getGpa(), student.getGrade())) {
				nameAndActivities.accept(student.getName(), student.getActivities());
			}
		}));
		
	}

}
