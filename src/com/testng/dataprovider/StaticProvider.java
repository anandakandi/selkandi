package com.testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	@DataProvider(name = "create", parallel = true)
	public static Object[][] createData(Method m) {
		System.out.println(m.getName());  // print test method name
		return new Object[][] { 
			 new Object[] { new Integer(42) },  new Object[] { new Integer(43) }			
		
		
	};

	}

}
