package com.oops.tests;

public class ConstructorOverLoading {
	String name;
	int x;

	ConstructorOverLoading(String a){  // parameterized constructor
		name = a; // we can use this.name also
	   }

	
	ConstructorOverLoading(int  abc){  
		x = abc;
	   }

	void disp() {
		System.out.println("text: " + name + "  int : "+ x);
	}

	public static void main(String args[]) {
		ConstructorOverLoading obj1 = new ConstructorOverLoading("This is basic concepts");

		
		ConstructorOverLoading obj2 = new ConstructorOverLoading(9);
		obj1.disp();
		obj2.disp();
	}

}
