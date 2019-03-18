package com.oops.tests3;

public class Benz extends Car{
	public int speedLimit() // same method from parent class with same arguements and same method type
    {
        return 150; // return type value is different
    }
    public static void main(String args[])
    {
    	Car obj = new Benz(); // created object for child class with reference of parent class
    	int num= obj.speedLimit();   // get the return value 
    	System.out.println("Speed Limit is: "+num); // print return value
    }
}
