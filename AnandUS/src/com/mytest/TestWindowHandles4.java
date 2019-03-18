package com.mytest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestWindowHandles4 {
	public static void main(String[] args) throws InterruptedException {
		// open flipkart
		String baseUrl = "https://brands.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		// window handles
		String mainWindow = driver.getWindowHandle();
		// print window name
		System.out.println(mainWindow);
		// Get the footer links and click social icons, it iwll open new tab or
		// window.

		// use javascript executor to scroll the page
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//*[@class='footer-meta']//ul[@class='socialicons']")));

		List<WebElement> socailaLinks = driver
				.findElements(By.xpath("//*[@class='footer-meta']//ul[@class='socialicons']/li"));
		System.out.println(socailaLinks.size());
		for (int i = 0; i < socailaLinks.size(); i++) {
			socailaLinks.get(i).click();
			System.out.println("clicked " + i + " : ");
			driver.switchTo().window(mainWindow);
			Thread.sleep(10000);
		}

		Set<String> s1 = driver.getWindowHandles();
		/*
		 * for(int i=1; i<=s1.size(); i++){
		 * driver.switchTo().window(Integer.toString(i));
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle()); }
		 */
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			driver.switchTo().window(ChildWindow);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(6000);

		}

		driver.quit();
	}

}
