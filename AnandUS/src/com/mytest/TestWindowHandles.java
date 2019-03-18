package com.mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class TestWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		// open flipkart
		String baseUrl = "https://brands.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		//
		System.out.println("dasd : "+driver.findElements(By.xpath("//div[contains(text(), 'sfds')]/..//ul[@class='nav-fds']/li")).size());
		
		//
		WebElement txtUsername = driver.findElement(By.xpath("//div[contains(text(), 'Products')]"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername)
				.build();

		seriesOfActions.perform();
		
		
		List<WebElement> sd = driver.findElements(By.xpath("//div[contains(text(), 'sfds')]/..//ul[@class='nav-fds']/li"));
		System.out.println(sd.size());
		for(int i=0; i<sd.size(); i++){
			String s1 = sd.get(i).getText();
			System.out.println(s1);
		}

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

//		Action seriesOfActions2 = builder.moveToElement(sd.get(0))
//				.contextClick()
//				.sendKeys(Keys.ARROW_DOWN)
//				.click()
//				.build();
//		seriesOfActions2.perform();
		
		Thread.sleep(15000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
	}

}
