package com.oops;
/*
 * this is sub class
 * Subclasses inherit those methods declared as public or protected.
 * 
 */
public class TestB extends TestA{
	String mainSubject = "Physics";
	   public static void main(String args[]){
		TestB obj = new TestB();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	   }

	
}
