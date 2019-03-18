package com.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNG {
	@BeforeClass
	public void testBeforeClass(){
		System.out.println("this is before class");
	}
	@AfterClass
	public void testAfterCls(){
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	public void testBM(){
		System.out.println("This is before method");
	}
	@AfterMethod
	public void testAM(){
		System.out.println("This is after method");
	}
	
	@BeforeTest
	public void testBeforeT(){
		System.out.println("this is before test annotation");
	}
	
	@AfterTest
	public void testAfterT(){
		System.out.println("This is after test annotation.");
	}
	@Test(groups = { "smoke" })
	public void testMethod1(){
		System.out.println("This is test1 Method");
	}
	@Test(groups = { "smoke" })
	public void testMethod2(){
		System.out.println("This is test2 method");
	}
	@Test(groups = { "smoke" })
	public void testMethod3(){
		System.out.println("This is test3 method");
	}
	@Test(groups = { "Regression" })
	public void testMethod4(){
		System.out.println("This is test4 method");
	}
	@Test(groups = { "Regression" })
	public void testMethod5(){
		System.out.println("This is test5 method");
	}
}
