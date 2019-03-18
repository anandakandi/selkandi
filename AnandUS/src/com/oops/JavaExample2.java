package com.oops;

public class JavaExample2 extends ParentClass{
	JavaExample2(){
		System.out.println("Constructor of Child");
	   }
	   void disp(){
		System.out.println("Child Method");
	        //Calling the disp() method of parent class
		super.disp();
	   }
	   public static void main(String args[]){
		//Creating the object of child class
		JavaExample2 obj = new JavaExample2();
		obj.disp();
	   }
}
