package com.testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp3 {
	@DataProvider(name = "dp")
	public Object[][] createData(Method m) {
	  System.out.println(m.getName());  // print test method name
	  return new Object[][] { new Object[] { "Cedric" }};
	}
	 
	@Test(dataProvider = "dp")
	public void test1(String s) {
		System.out.println("thisis "+s);
	}
	 
	@Test(dataProvider = "dp")
	public void test2(String s) {
		System.out.println("thi sdsd "+s);
		
	}

}
