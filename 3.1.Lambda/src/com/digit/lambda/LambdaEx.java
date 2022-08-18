package com.digit.lambda;

import java.util.Scanner;

public class LambdaEx
{
	
	// operation is implemented using lambda expressions
	
	interface Calculate
	{
		int task(int a, int b);
	}
	
	// Performs FuncInter1's operation on 'a' and 'b'
	
	private int operate(int a, int b, Calculate calc)
	{
		return calc.task(a, b);
	}

	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		

	// lambda expression to calculate total cost This expression also implements 'Calculate' interface
		
    Calculate multiply = (int x, int y) -> x * y;
		
	// Creating an object of LambdaEx to calculate the total cost using above method
		
	 LambdaEx lamb = new LambdaEx();
	 System.out.println("Enter the number of chocolates:");
	 int a=sc.nextInt();
	 System.out.println("Enter the price of one chocolate:");
	 int b=sc.nextInt();

	// Calculate the total cost using lambda expression
	 
	System.out.println("Total cost is: " +
						lamb.operate(a, b, multiply));
	}
}

