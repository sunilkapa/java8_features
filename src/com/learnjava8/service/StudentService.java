package com.learnjava8.service;

import java.util.Arrays;
import java.util.List;

import com.learnjava8.model.Student;

public class StudentService {
	
	public List<Student> getAll(){
		Student std1 = new Student("Sunil", 2, 3.9, true, Arrays.asList("Cricket","Volley"),5);
		Student std2 = new Student("Sunny", 3, 2.9, true, Arrays.asList("Volley","Shuttle"),6);
		Student std3 = new Student("Nani", 4, 5.0, true, Arrays.asList("Cricket","Volley","Shuttle"),7);
		Student std4 = new Student("Anil", 10, 1.8, true, Arrays.asList("Cricket"),1);
		Student std5 = new Student("Chinni", 8, 4.0, true, Arrays.asList("Cricket","Volley"),3);
		Student std6 = new Student("Jammy", 7, 3.9, true, Arrays.asList("Cricket","Volley","Hockey"),7);
		Student std7 = new Student("Sudhakar", 9, 3.0, true, Arrays.asList("Tennis","Shuttle"),6);
		Student std8 = new Student("Venky", 10, 5.0, true, Arrays.asList("Cricket","Shuttle","Squash"),8);
		Student std9 = new Student("Satyam", 1, 1.9, true, Arrays.asList("Cricket"),1);
		Student std10 = new Student("Ravi", 2, 3.9, true, Arrays.asList("Cricket","Volley"),3);
		Student std11 = new Student("ABC",4,4.5,false,Arrays.asList("Cricket","Volley","Chess","Carrom"),9);
		List<Student> students = Arrays.asList(std1,std2,std3,std4,std5,std6,std7,std8,std9,std10,std11);
		return students;
		
	}
}
