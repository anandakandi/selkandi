package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
	}
	
	
	

}
