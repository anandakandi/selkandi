package com.testng.dataprovider;

import org.testng.annotations.DataProvider;

public class Dp1 {
	 @DataProvider(name="SearchProvider")
	    public static Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "Guru99", "India", "dude" },
	            { "Krishna", "UK", "dule" },
	            { "Bhupesh", "USA", "hello" },	            
	            { "Sasidhar", "Russia", "proud" }
	        };

	    }
}
