package com.digit.functional;

import java.util.Scanner;

interface Higher{  //this is a functional interface as it contains only one abstract method
	public void print(int a, int b);
	public static void show() {
		System.out.println("Hello");
	}
}
public class FunctionalIntf {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FunctionalIntf fi = new FunctionalIntf();
		System.out.println("Enter First number:");
    	int a=sc.nextInt();
    	System.out.println("Enter Second number:");
    	int b=sc.nextInt();
    	
		// Referring to a non-functional method
		Higher h = fi::compare;
		
		// calling abstract method
		h.print(a,b);
	}

	// Implementation of print() abstract method
	public void compare(int a, int b) {
		
		if(a>b) {
		System.out.println(a+"is greater");
		}
		else if(b>a){
			System.out.println(b+"is greater");
			}
		else {
			System.out.println("Both are equal");
		}
	}
}
