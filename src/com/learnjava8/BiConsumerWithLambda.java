package com.learnjava8;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class BiConsumerWithLambda {
	static List<Student> students = new StudentService().getAll();
	static BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a : " + a + " , b : " + b);
	static BiConsumer<Integer, Integer> biConsumer2 = (a,b) -> System.out.println("Multiplication : " + (a * b));
	static BiConsumer<String, List<String>> biConsumer3 = (name,activities) -> System.out.println(name + " : " + activities);
	public static void main(String[] args) {
		biConsumer.accept("Sunil", "Sunny");
		biConsumer2.accept(18, 7);
		students.forEach((student -> {
			biConsumer3.accept(student.getName(), student.getActivities());
		}));
	}
}
