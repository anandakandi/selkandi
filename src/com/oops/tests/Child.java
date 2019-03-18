package com.oops.tests;

public class Child extends Parent {
	Child() { // default constructor
		System.out.println("this is the child class default constructor.");
	}

	public static void main(String[] args) {
//		Child c = new Child(); // invoking the default constructor in the Child class. IT
						// will invoke the parent class default constructor
//		c.Parent();// this is not a method so it show the compiler error
		new Parent(); // Constructor always invoke with new
	}
}
