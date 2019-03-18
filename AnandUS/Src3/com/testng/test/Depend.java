package com.testng.test;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Depend {
	@BeforeClass
	public void testBeforeClass(){
		System.out.println("this is before class");
	}
	@AfterClass
	public void testAfterCls(){
		System.out.println("this is after class");
	}
	
	
	
	@BeforeTest
	public void testBeforeT(){
		System.out.println("this is before test annotation");
	}
	
	@AfterTest
	public void testAfterT(){
		System.out.println("This is after test annotation.");
	}
	@Test(groups = { "smoke1" })
	public void testMethod1(){
		System.out.println("This is test1 Method");
	}
	@Test(dependsOnGroups={"smoke3"})
	public void testMethod2(){
		System.out.println("This is test2 method");
	}
	@Test(groups = { "smoke3" })
	public void testMethod3(){
		System.out.println("This is test3 method");
	}
	@Test(dependsOnGroups={"smoke3"})
	public void testMethod4(){
		System.out.println("This is test4 method");
	}
	@Test(groups = { "Regression" })
	public void testMethod5(){
		System.out.println("This is test5 method");
	}
}
