package com.Encap;

public class Encapsulate {

	private int sal;
	
	private String name;
	
	
	private int age;
	public void setAge(int yyy) {

		this.age = yyy;
	}

	public int getAge() {
		return age;
	}
	
	
	public int getSal() {
		return sal;
	}

	public String getName() {
		return name;
	}

	public void setSal(int sal) {
		this.sal = sal;

	}

	public void setName(String name) {
		this.name = name;
	}
}
