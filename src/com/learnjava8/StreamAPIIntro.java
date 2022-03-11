package com.learnjava8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamAPIIntro {

	public static void main(String[] args) {
		Map<String, List<String>> nameActivities = new StudentService().getAll().stream()
			.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		
		Map<String, List<String>> nameGradeActivities = new StudentService().getAll().stream()
			.filter(student -> student.getGrade()>=4)
			.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Map<String, List<String>> nameGradeGpaActivities = new StudentService().getAll().stream()
				.filter(student -> student.getGrade()>=4)
				.filter(student -> student.getGpa()>=4)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(nameActivities);
		System.out.println(nameGradeActivities);
		System.out.println(nameGradeGpaActivities);
	}

}
