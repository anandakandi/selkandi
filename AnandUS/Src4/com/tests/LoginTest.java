package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	String baseUrl = "http://dev-procon.com.s3-website-us-east-1.amazonaws.com/#/home/three";

	// setup the browser instance
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);

	}

	// Do some actions and validate the data.
	@Test
	public void userLogin() {
		System.out.println("this si userLogin");

		List<WebElement> dd = driver.findElements(By.tagName("a"));
		for(int i=1; i<dd.size(); i++){
			String LinkName = dd.get(i).getText();
			System.out.println("Link "+i+" : "+LinkName);
		}

	}

	@Test
	public void testActionClass() throws InterruptedException{
		System.out.println("this si testActionClass");
		
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
	// close the test and browser instance.
	@AfterTest
	public void closeBrowser() {
		driver.close();

	}
}
