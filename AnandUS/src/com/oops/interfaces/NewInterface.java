package com.oops.interfaces;

public interface NewInterface {
	final int id = 100;
	int move();
	// static method
	static void hello() {
		System.out.println("Hello, New Static Method Here");
	}

	// Public and abstract method of Interface
	void overrideMethod(String str);
}
