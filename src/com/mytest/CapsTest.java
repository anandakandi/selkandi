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

public class CapsTest {
	public static void main(String[] args) throws AWTException, InterruptedException {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "bye")
				.doubleClick(txtUsername)
				.contextClick()
				.build();

		seriesOfActions.perform();
		
		
		 
		 
		 Thread.sleep(5000);

	}
}
