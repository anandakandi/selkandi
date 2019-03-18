package com.oops.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		InterfaceDemo interfaceDemo = new InterfaceDemo();

		// Calling the static method of interface
		NewInterface.hello();

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");
		hello();
	}

	// Implementing interface method

	public void overrideMethod(String str) {
		System.out.println(str);
	}
	// Class Static method is defined 
    static void hello() 
    { 
        System.out.println("Called from Class"); 
    } 
}
