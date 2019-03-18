package com.oops.tests;

public class Example3 {
	private int var; // declaring integer variable
	
	// this is the default constructor
	public Example3(){
		
	}

	public Example3(int num) {
		var = num; // assigned value into variable
	}

	public int getValue() { //without void integer type method
		return var; // return variable
	}

	public static void main(String args[]) { // main method
		Example3 myobj = new Example3(); // throwing compilation error because there is no default constructor
		System.out.println("value of var is: " + myobj.getValue());
	}
}
