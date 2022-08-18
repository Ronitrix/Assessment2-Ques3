package com.digit.method;

import java.util.Scanner;

interface Total{  
    void add(int a, int b);  //this is the interface method
}  
public class MethodRef {  
    public static void plus(int a,int b){ // this is the static method
    	int c=a+b;
        System.out.println("The Sum of two numbers is:"+c);  
    }  
    public static void main(String[] args) {  
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter First number:");
    	int a=sc.nextInt();
    	System.out.println("Enter Second number:");
    	int b=sc.nextInt();
    	
        // Referring static method 
        Total T1 = MethodRef::plus;  //demonstration of method reference
        
        // Calling interface method  
        T1.add(a,b);  
    }  
}  
