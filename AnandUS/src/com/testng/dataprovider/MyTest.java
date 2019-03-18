package com.testng.dataprovider;

import org.testng.annotations.Test;

public class MyTest {
	@Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
	public void testDinggasdgads(Integer n) {
		// ...
	}
}
