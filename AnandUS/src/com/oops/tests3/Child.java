package com.oops.tests3;

public class Child extends Parent {
	// This method overrides show() of Parent

	void show() {
//		super.show();
		System.out.println("Child's show()");
	}

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.show();
	}
}
