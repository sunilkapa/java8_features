package com.learnjava8;

import com.learnjava8.model.Student;
import com.learnjava8.service.StudentService;

public class StreamApiMapFilterReduce {
		
	/*
	 * Count Number of Notebooks
	 */
	
	static Integer getTotalNumberOfNoteBooks() {
		return new StudentService().getAll().stream()
							.map(Student::getNoOfNoteBooks)
							.reduce(0,(count,nextVal) -> count+nextVal);
			
	}				
	
	/*
	 *	Count number of note books with grade above 3 
	 */
	
	static Integer getTotalNumberOfNoteBooksGrade() {
		return new StudentService().getAll().stream()
							.filter((student->student.getGrade()>=3))
							.peek((student)-> System.out.println(student))
							.map(Student::getNoOfNoteBooks)
							.reduce(0, (count,nextVal) -> count+nextVal);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Total Number of Note Books : " + getTotalNumberOfNoteBooks());
		System.out.println("Total number of not books with grade 3 or above : " + getTotalNumberOfNoteBooksGrade());

	}

}
