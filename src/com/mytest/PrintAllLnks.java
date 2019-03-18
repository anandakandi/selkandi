package com.mytest;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLnks {
	public static void main(String[] args) throws AWTException, InterruptedException {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		List<WebElement> dd = driver.findElements(By.tagName("a"));
		for(int i=1; i<dd.size(); i++){
			String LinkName = dd.get(i).getText();
			System.out.println("Link "+i+" : "+LinkName);
		}
	}
}
