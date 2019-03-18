package com.mytest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://flipkart.com");

		//
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ESCAPE);
		 robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		Actions builder = new Actions(d);
//		builder.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		WebElement headerelement = d.findElement(By.xpath("//ul/li/span[contains(text(), 'Electronics')]"));
		Action mouseoverevent = builder.moveToElement(headerelement).build();

		mouseoverevent.perform();

		Thread.sleep(5000000);

		

		d.close();

	}
}
