package com.oops.abs;

public class Dog extends Animal{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal obj = new Dog(); // 
		obj.sound();
		obj.myMethod();
	   }
	   

}
