package com.learnjava8.model;

import java.util.List;

public class Student {
	private String name;
	private Integer grade;
	private Double gpa;
	private Boolean gender;
	private List<String> activities;
	private Integer noOfNoteBooks;
	
	public Student() {
		
	}

	public Student(String name, Integer grade, Double gpa, Boolean gender, List<String> activities,
			Integer noOfNoteBooks) {
		super();
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
		this.noOfNoteBooks = noOfNoteBooks;
	}


	public Student(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	
	public void getListActivities() {
		System.out.println(activities);
	}
	
	public Integer getNoOfNoteBooks() {
		return noOfNoteBooks;
	}

	public void setNoOfNoteBooks(Integer noOfNoteBooks) {
		this.noOfNoteBooks = noOfNoteBooks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", gpa=" + gpa + ", gender=" + gender + ", activities="
				+ activities + ", noOfNoteBooks=" + noOfNoteBooks + "]";
	}

	
}
