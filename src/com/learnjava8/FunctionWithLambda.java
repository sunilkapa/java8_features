package com.learnjava8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class FunctionWithLambda {

	static Function<String, String> name = (name) -> "Mr. " + name;
	static Function<String, String> greeting = (name) -> name.concat(" Welcome!!");
	static Predicate<Integer> gradePredicate = (grade) ->  grade >= 4;
	static Function<List<Student>,Map<String, Double>> nameGpa = (students) -> {
		Map<String, Double> nameGpaMap = new HashMap();
		Map<String, Double> nameGradeGpaMap = new HashMap();
		Consumer<Student> studentConsumer = (student) -> {
			if(gradePredicate.test(student.getGrade()))
			{
				nameGradeGpaMap.put(student.getName(), student.getGpa());
			}
			nameGpaMap.put(student.getName(), student.getGpa());
		};
		students.forEach(studentConsumer);
		return nameGpaMap;
	};
	
	static Function<List<Student>,Map<String, Double>> nameGpaGrade = (students) -> {
		Map<String, Double> nameGradeGpaMap = new HashMap();
		Consumer<Student> studentConsumer = (student) -> {
			if(gradePredicate.test(student.getGrade()))
			{
				nameGradeGpaMap.put(student.getName(), student.getGpa());
			}
		};
		students.forEach(studentConsumer);
		return nameGradeGpaMap;
	};
	
	static BiConsumer<String, Double> printMap = (name, gpa) -> {
		System.out.println("Name : " + name + " GPA : " + gpa);
	};
	public static void main(String[] args) {
		System.out.println(name.andThen(greeting).apply("Sunil "));
		System.out.println(name.compose(greeting).apply("Sunny"));
		Map<String, Double> nameGPAMap = nameGpa.apply(new StudentService().getAll());
		Map<String, Double> nameGpaGradeMap = nameGpaGrade.apply(new StudentService().getAll());
		nameGPAMap.forEach(printMap);
		System.out.println("****************************************");
		nameGpaGradeMap.forEach(printMap);
		
	}

}
