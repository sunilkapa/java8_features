package com.learnjava8;

import java.util.List;
import java.util.function.Consumer;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		consumer.accept("Sunil");
		
		StudentService studentService = new StudentService();
		
		Consumer<Student> c1 = (student)-> System.out.println(student);
		List<Student> students = studentService.getAll();
		students.forEach(c1);
		
		/*
		 * Name and activities of Student
		 */
		
		System.out.println("Name and Activity of student!!!");
		
		Consumer<Student> c2 = (student) -> System.out.print(student.getName());
		Consumer<Student> c3 = (student) -> System.out.println( " : " + student.getActivities());
		Consumer<Student> c4 = (student) -> System.out.println(" : " + student.getGpa());
		
		students.forEach(c2.andThen(c3));
		
		/*
		 * Name and activities only for gpa more or equal to 4
		 */
		System.out.println("Name and Activity for students with GPA more or equal to 4");
		students.forEach((student -> {
			if(student.getGpa() >= 4)
				c2.andThen(c3).andThen(c4).accept(student);
		}));
	}

}
