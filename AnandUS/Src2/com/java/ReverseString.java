package com.java;

import java.util.Scanner;

/* This class is for reverse a string
 * 
 */
public class ReverseString {
public static void main(String[] args) {
	System.out.println("Enter a String : ");
	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	System.out.println("You entered String : " +str+" : for reverse.");
	String reverse = "";
	
	for(int i=str.length()-1; i>=0; i--){
		reverse = reverse+str.charAt(i);
		
	}
	System.out.println("Reverese String is : "+ reverse);
	
	
	//another method to reverse a string
	StringBuilder sb = new StringBuilder(str);
	String reverseString = sb.reverse().toString();
	System.out.println(reverseString);
	
	// another method
	StringBuilder sbr = new StringBuilder(str);
	System.out.println("This is suing reverse() method from java : "+sbr.reverse().toString());
}
}
