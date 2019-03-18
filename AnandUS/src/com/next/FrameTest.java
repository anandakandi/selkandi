package com.next;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
	
	public static void main(String[] args) throws InterruptedException {
		// open flipkart
		String baseUrl = "https://paytm.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(), 'Log In/Sign Up')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement link = driver.findElement(By.xpath("//div[@class='qr-code-footer']/div[3]/span"));
		System.out.println(link.getText());
		link.click();
		
	}

}
