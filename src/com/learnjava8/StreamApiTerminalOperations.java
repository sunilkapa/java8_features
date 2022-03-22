package com.learnjava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiTerminalOperations {

	/*
	 * joining() --> concatenates all values of stream and return single value
	 * 3 versions
	 * joining()
	 * joining("delimiter")
	 * joining("delimiter","prefix","suffix")
	 */
	
	public static String join1() {
		return Arrays.asList("Sunil","Kapa").stream()
						.collect(Collectors.joining());
	}
	
	public static String join2() {
		return Arrays.asList("Sunil","Kapa").stream()
						.collect(Collectors.joining(" "));
	}
	
	public static String join3() {
		return Arrays.asList("Sunil","Kapa").stream()
						.collect(Collectors.joining(" ","Mr. ", " Welcome!!"));
	}
	
	/*
	 * counting() --> Count number of ele of stream
	 * 
	 */
	
	public static Long counting() {
		return Arrays.asList(1,2,3,4,5,6,7,8,9,0).stream()
						.collect(Collectors.counting());
	}
	
	/*
	 * mapping() -> takes an elemnt and maps it to target type
	 */
	
	public static List<String> mapping() {
		return new StudentService().getAll().stream() // Student object Stream
						.collect(Collectors.mapping(Student::getName, Collectors.toList())); //collects names of students and add them to list
	}
	/*
	 * minBy() -> return minimum value of stream in conjunction with provided comparator
	 * maxBY() -> return max value
	 */
	
	public static Optional<Student> minBy() {
		return new StudentService().getAll().stream().
					collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy() {
		return new  StudentService().getAll().stream()
					.collect(Collectors.maxBy(Comparator.comparing(Student::getGrade)));
	}
	/*
	 * summingInt() -> return sum of numbers
	 * avaeragingInt() -> return avg of numbers
	 * 
	 */
	public static Integer summingInt() {
		return new StudentService().getAll().stream()
					.collect(Collectors.summingInt(Student::getNoOfNoteBooks));
	}
	public static Double averagingInt() {
		return new StudentService().getAll().stream()
					.collect(Collectors.averagingDouble(Student::getGpa));
	}
	public static void main(String[] args) {
		System.out.println("Join 1 : " + join1());
		System.out.println("Join 2 : " + join2());
		System.out.println("Join 3 : " + join3());
		System.out.println("******************************************");
		System.out.println("Counting : " + counting());
		System.out.println("******************************************");
		System.out.println("Mapping : " + mapping());
		System.out.println("******************************************");
		System.out.println("Min GPA : " + minBy().isPresent() != null ? minBy().get() : null);
		System.out.println("Max Grade : " + maxBy().isPresent() != null ? maxBy().get() : null);
		System.out.println("******************************************");
		System.out.println("Summing : " + summingInt());
		System.out.println("Averaging : " + averagingInt());
		
	}

}
