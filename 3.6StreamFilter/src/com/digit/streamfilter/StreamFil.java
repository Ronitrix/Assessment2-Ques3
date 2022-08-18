package com.digit.streamfilter;

import java.util.*;  
class Student{  
    int id;  
    String name;  
    int marks;  
    public Student(int id, String name, int marks) {  
        this.id = id;  
        this.name = name;  
        this.marks = marks;  
    }  
}  
public class StreamFil {  
    public static void main(String[] args) {  
        List<Student> studentList = new ArrayList<Student>(); // creating a new array list to store marks of students   
        studentList.add(new Student(1,"Ravi",78));  
        studentList.add(new Student(2,"Saloni",59));  
        studentList.add(new Student(3,"Hemant",74));  
        studentList.add(new Student(4,"Riya",89));  
        studentList.add(new Student(5,"Arun",56));  
        studentList.stream()  
                    .filter(p ->p.marks> 60)   // here it will filter only those students whose marks is greater than 60  
                    .map(pm ->pm.marks)        // fetching all the marks
                    .forEach(System.out::println);  
    }  
}  
