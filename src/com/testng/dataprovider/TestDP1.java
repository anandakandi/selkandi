package com.testng.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDP1 {
	WebDriver driver;
	 @BeforeTest
	    public void setup(){
	        //Create firefox driver object
		 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://google.com");
	    }
	 
	 @Test(dataProvider="SearchProvider", dataProviderClass=Dp1.class)
	    public void testMethod(String author,String searchKey, String d) throws InterruptedException
	    {
	    	
	        WebElement searchText = driver.findElement(By.name("q"));
	        //search value in google search box
	        searchText.sendKeys(searchKey);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey+" : "+d);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey +":"+d);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	        
	    }
	 @AfterTest
	 public void close(){
		 driver.close();
	 }
	
}
