package com.oops.interfaces;

import com.oops.abs.Animal;

public class Dog extends Animal implements Pet{
//	public class Dog extends Animal{
//	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method Implemented");
	}
public static void main(String[] args) {
	//Dog obj = new Dog();
	
	Pet p = new Dog();
//	Dog p = new Dog();
	p.test();
}
}
