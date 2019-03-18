package com.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P1 {
	WebDriver driver;
	String baseUrl = "http://dev-procon.com.s3-website-us-east-1.amazonaws.com/#/home/three";

	// setup the browser instance
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		FluentWait wt = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

	}
	 @DataProvider(name = "Authentication")

	  public static Object[][] credentials() {

	        return new Object[][] { { "url", "http://www.facebook.com" }, { "url", "http://www.amazon.com" }};
	        
	  }
	@Test
	public void getLinks() throws InterruptedException {
		System.out.println("this is getLinks test method");
		Thread.sleep(6000);
		List<WebElement> nav1 = driver.findElements(By.xpath("//ul[@class='header-dropdown']/li"));

		for (int i = 1; i < nav1.size(); i++) {
			String nav_bar_header = nav1.get(i).getText();
			System.out.println("Link " + i + " : " + nav_bar_header);
		}

		// get the main nav bar tabs list

		List<WebElement> mainTabs = driver.findElements(By.xpath("//ul[@id='main-menu']/li"));

		for (int i = 2; i <= mainTabs.size(); i++) {

			WebElement tab = driver.findElement(By.xpath("//ul[@id='main-menu']/li[" + i + "]/a"));
			String main_header = tab.getText();
			System.out.println("header " + i + " : " + main_header);
		}

		// click on categories and print all categories list
		// use select option in selenuim

		Select s = new Select(driver.findElement(By.xpath("//select[@class='select-main']")));

		List<WebElement> cateoryLisst = s.getOptions();
		System.out.println(cateoryLisst.size());

		// creating array list to add all items
		List actualCategories = new ArrayList<>();
		List expectedCategories = new ArrayList<>(
				Arrays.asList("Categories:", "Fashion", "Food", "Home", "Collections"));
		for (WebElement ee : cateoryLisst) {
			// System.out.println(ee.getText());
			actualCategories.add(ee.getText());

		}
		System.out.println(expectedCategories);
		System.out.println(actualCategories);
		Assert.assertEquals(expectedCategories, actualCategories, "this is passed");
		Thread.sleep(3000);
		// mouse hover on Fashion and get the all items in the hover list
		// use action class to move the mouse hove on webelement
		WebElement element = driver.findElement(By.linkText("FASHION"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		element.click();
		Thread.sleep(5000);
		List sl = new ArrayList<>();
		List<WebElement> abc = driver.findElements(By.xpath("//a[contains(text(),'Fashion')]/../ul/li//h5"));
		for (WebElement E : abc) {
			// System.out.println(E.getText());
			sl.add(E.getText().toLowerCase());
		}
		System.out.println(sl);
		System.out.println(sl.size());
		for (int k = 0; k < sl.size(); k++) {
			Object sk1 = sl.get(k);
			System.out.println(
					"//a[contains(text(),'Fashion')]/../ul/li//h5[contains(text(), '" + sk1 + "')]/../../..//li/a");

			List<WebElement> fashionList1 = driver.findElements(By.xpath(
					"//a[contains(text(),'Fashion')]/../ul/li//h5[contains(text(), '" + sk1 + "')]/../../..//li/a"));
			for (WebElement dd1 : fashionList1) {
				System.out.println(dd1.getText() + "s");

			}
			Thread.sleep(5000);
		}

		// List actualList = new ArrayList<>();
		/*
		 * List<WebElement> fashionList = driver.findElements(By.xpath(
		 * "//a[contains(text(),'Fashion')]/../ul/li//li/a")); for (WebElement
		 * dd : fashionList) { System.out.println(dd.getText() + "s"); //
		 * a[contains(text(),'Fashion')]/../ul/li//h5/../../..//li/a }
		 */
		Thread.sleep(5000);

	}

	// close the test and browser instance.
	@AfterTest
	public void closeBrowser() {
		driver.close();

	}
}
