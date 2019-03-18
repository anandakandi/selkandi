package com.Encap;

//import org.junit.Test;

import org.testng.annotations.Test;

public class TestEncapsulation {

//	public static void main(String[] args) {
	@Test
	public void test(){
		Encapsulate obj = new Encapsulate();
		
		obj.setAge(9);
		
		obj.setName("Harish");
		obj.setSal(9000);
		
		
		int ss = obj.getAge();
		System.out.println(ss);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getSal());
	}
}
