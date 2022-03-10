package com.learnjava8;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class PredicateWithLambda {
	static List<Student> students = new StudentService().getAll();
	static Predicate<Double> gpa= (gpa) -> gpa>=4;
	static BiConsumer<String, List<String>> nameAndActivities = (name, activities) -> {
		System.out.println(name + " : " + activities);
	};
	public static void main(String[] args) {
//		Predicate<Integer> predicate = (num) -> {
//			return ((num % 2 ) == 0);
//		};
//		
//		Predicate<Integer> predicate2 = (num) -> {
//			System.out.println("Number : " + num);
//			return ((num%2) == 0);
//			};
//		
//		Predicate<Integer> p3 = (num) -> {
//			System.out.println("Number : " + num);
//			return ((num%3) == 0);
//			};
//		if(predicate.test(11))
//			System.out.println("Even");
//		else
//			System.out.println("Odd");
//		
//		if(predicate2.test(11))
//			System.out.println("Even");
//		else
//			System.out.println("Odd");
//		
//		if(predicate2.and(p3).test(25))
//			System.out.println("Number is Divisible by 6");
//		else
//			System.out.println("Not Divisible by 6");
		students.forEach((student -> {
			if(gpa.test(student.getGpa())) {
				nameAndActivities.accept(student.getName(), student.getActivities());
			}
		}));
	}
}
