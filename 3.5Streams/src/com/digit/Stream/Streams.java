package com.digit.Stream;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args)
	{

		// Creating an ArrayList object of integer type
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Inserting elements to ArrayList class object
		// Custom input integer numbers
		al.add(24);
		al.add(16);
		al.add(91);
		al.add(34);
		al.add(28);

		System.out.println("Printing the collection : "
						+ al);
		System.out.println();

		List<Integer> ls
			= al.stream()  //Getting the stream from this collection
				.filter(i -> i % 2 == 0)  //Filtering out only even elements
				.collect(Collectors.toList());  //Collecting the required elements to List
		
		System.out.println(
			"Printing the List after stream operation : "
			+ ls);
	}
}

