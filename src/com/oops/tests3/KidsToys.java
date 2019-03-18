package com.oops.tests3;

public class KidsToys extends Toys{ // Child class
	//write same methods to overridden from parent class
	public void toysSale() { // methos void
		System.out.println("sales on weight");
	}

	public int remoteToys() { // integer type method with return type - without
								// void here
		return 100;
	}

	public String remoteCar() { // String type method with return type - without
								// void here
		return "remote gear CArs";
	}

	public static void main(String[] args) {
		Toys obj = new KidsToys();
		String val = obj.remoteCar();
		System.out.println("this is String Val : "+ val);
		obj.toysSale();
		int num = obj.remoteToys();
		System.out.println("this is number : "+ num);
		
		
	}
}
