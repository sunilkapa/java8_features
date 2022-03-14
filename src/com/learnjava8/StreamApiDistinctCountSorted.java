package com.learnjava8;

import java.util.List;
import java.util.stream.Collectors;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiDistinctCountSorted {
	public static List<String> getActivities(){
		return new StudentService().getAll().stream()
							.map(Student::getActivities)
							.flatMap(List::stream)
		/*
		 * Till here we have all activities in which many of them repeated
		 * to filter out distinct method useful
		 */
							.distinct()
							.collect(Collectors.toList());
	}
	public static Long getActivityCount() {
		return new StudentService().getAll().stream()
							.map(Student::getActivities)
							.flatMap(List::stream)
							.distinct()
							.count();
	}
	public static List<String> getSortedActivities(){
		return new StudentService().getAll().stream()
							.map(Student::getActivities)
							.flatMap(List::stream)
							.sorted()
							.distinct()
							.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getActivities());
		System.out.println("Activity Count : " + getActivityCount());
		System.out.println("Sorted Activities : " + getSortedActivities());
	}

}
