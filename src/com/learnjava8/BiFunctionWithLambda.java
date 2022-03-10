package com.learnjava8;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class BiFunctionWithLambda {

	static Function<List<Student>, Map<String, Double>> studentFunction = FunctionWithLambda.nameGpa;
	static Predicate<Double> gpaPredicate = PredicateWithLambda.gpa;
	static List<Student> students = new StudentService().getAll();
	static BiFunction<Function<List<Student>, Map<String,Double>>, Predicate<Double>, Map<String, Double>> nameGradeGpa = 
				(function, predicate) -> {
					Map<String, Double> gpaMap = function.apply(students);
					gpaMap.values().removeIf(predicate.negate());
					return gpaMap;
				};
	static BiConsumer<String, Double> printMap = (name, gpa) -> System.out.println("Name : " + name + " GPA : " + gpa);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> mapExample = nameGradeGpa.apply(studentFunction, gpaPredicate);
		
		mapExample.forEach(printMap);
		
	}

}
