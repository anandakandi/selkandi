package com.oops.tests;

public class Employee {
	int empId;
	String empName;
	
//	parameterized constructor with two parameters
	Employee(int id, String name) { 
		this.empId = id;
		this.empName = name;
	}

	void info() { // this is the method and printing values
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String args[]) {
//		passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.
		Employee obj1 = new Employee(10245, "Sasidhar");
		Employee obj2 = new Employee(92232, "Anand");
		obj1.info(); // invoke method
		obj2.info(); // invoke method
	}
}
