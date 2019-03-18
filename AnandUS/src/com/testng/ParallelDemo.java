package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
	
	@Test
	public void test1() {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		List<WebElement> dd = driver.findElements(By.tagName("a"));
		for (int i = 1; i < dd.size(); i++) {
			String LinkName = dd.get(i).getText();
			System.out.println("Link " + i + " : " + LinkName);
		}
	}
	
	@Test
	public void test2() {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		List<WebElement> dd = driver.findElements(By.tagName("a"));
		for (int i = 1; i < dd.size(); i++) {
			String LinkName = dd.get(i).getText();
			System.out.println("Link " + i + " : " + LinkName);
		}
	}
	
	@Test
	public void test3() {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		List<WebElement> dd = driver.findElements(By.tagName("a"));
		for (int i = 1; i < dd.size(); i++) {
			String LinkName = dd.get(i).getText();
			System.out.println("Link " + i + " : " + LinkName);
		}
	}
}
