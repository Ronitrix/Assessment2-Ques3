package com.strjoin;
// you to have import StringJoiner package to use StringJoiner
import java.util.StringJoiner;  
public class StringJoin {  
    
    public static void main(String[] args) {  
    	/**
         * StringJoiner helps to create string by passing delimiter.We can also pass
         * prefix and suffix to the char sequence.
         */
    	
        StringJoiner combine = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        combine.add("Sachin");  
        combine.add("Dhoni");  
        combine.add("Kohli");  
        combine.add("Yuvraj");  
                  
        System.out.println(combine);  
    }  
}  
