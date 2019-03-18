package com.mytest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestWindowHandles2 {
	public static void main(String[] args) throws InterruptedException {
		// open flipkart
		String baseUrl = "https://brands.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);

		WebElement contactUs = driver.findElement(By.xpath("//button[contains(text(), ' Contact Us ')]"));
		System.out.println("title "+driver.getTitle());
		System.out.println("url"+ driver.getCurrentUrl());
		// click contact us
		Actions builder = new Actions(driver);
		builder.moveToElement(contactUs);
		builder.keyDown(contactUs, Keys.CONTROL).click().build().perform();

		Thread.sleep(5000);

		System.out.println("anotehr title "+driver.getTitle());
		System.out.println("anoterh url "+driver.getCurrentUrl());
		String parent = driver.getWindowHandle();
		Set<String> handle= driver.getWindowHandles();
		 
		Iterator<String> I1= handle.iterator();
		 
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		 
		// Here we will compare if parent window is not equal to child window then we            will close
	
		driver.switchTo().window(I1.next());
		 
		System.out.println("fasdf"+driver.getTitle());
		 
		
		}
		
		driver.close();
		}

}
