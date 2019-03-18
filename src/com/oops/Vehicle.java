package com.oops;

class Vehicle {
	int x;
	int y;
	  protected String brand = "Ford";         // Vehicle attribute
	  public void honk() {                     // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	  
	  public void setData(int a, int b){
		  this.x=a;
		  this.y=b;
	  }
	}