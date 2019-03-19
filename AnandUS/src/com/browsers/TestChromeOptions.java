package com.browsers;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class TestChromeOptions {
// this a example for v2 second
	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get(baseUrl);
		Thread.sleep(5000);
		
	
	
		Cookie ck = new Cookie("name", "value");
		driver.manage().addCookie(ck);
		System.out.println(driver.manage().getCookies());
		
		driver.close();
	}
}
