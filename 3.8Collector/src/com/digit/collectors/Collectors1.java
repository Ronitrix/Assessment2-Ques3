package com.digit.collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; //We have to import Collectors package to use collectors features

class Student{
	String id;
	String name;
	double marks;

	public Student(String id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class Collectors1 {
	public static void main(String[] args) {
		List<Student> emp = new ArrayList<>();
		emp.add(new Student("1", "Ram", 84));
		emp.add(new Student("2", "Shyam", 81));
		emp.add(new Student("3", "Mohan", 89));
		emp.add(new Student("4", "Amit",  82));
  
		//Here we will use toList(), a feature of collectors package
		List<String> names = emp.stream().map(Student::getName).collect(Collectors.toList());

		System.out.println(names);
	}
}
