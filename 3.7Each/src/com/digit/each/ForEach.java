package com.digit.each;

import java.util.ArrayList;
import java.util.Scanner;
public class ForEach {
	public String name="";
	public String address="";
	public ForEach(String name, String address) {
		
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
     System.out.println("Please enter the number of students detail : ");
     int numberOfInputs = input.nextInt();

     ArrayList<ForEach> StudentList = new ArrayList<ForEach>();  //creating array list to store the details of students
     for( int i=0;  i < numberOfInputs ; i++){
         System.out.println("Please enter Name : ");
         String name = input.next();
         System.out.println("Please enter Address : ");
         String address = input.next();

         ForEach std = new ForEach(name, address);
         StudentList.add(std);  //here we are adding student details in the list
     }
     StudentList.forEach(student->System.out.println(student)); //here forEach() will print the details of all the students present in the list
  }
}