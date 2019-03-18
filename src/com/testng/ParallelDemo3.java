package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelDemo3 {
	WebDriver driver;
	@BeforeClass
	public void setUp(){
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get(baseUrl);
	}
	
	@Test
	public void test1() {
		List<WebElement> dd = driver.findElements(By.tagName("a"));
		for (int i = 1; i < dd.size(); i++) {
			String LinkName = dd.get(i).getText();
			System.out.println("Link " + i + " : " + LinkName);
		}
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
	
}
