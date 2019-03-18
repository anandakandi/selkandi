package com.resolve;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
public static void main(String[] args) throws AWTException, InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	WebDriver d = new ChromeDriver();
//	d.get("http://flipkart.com");
	String baseWebUrl = "http://expirebox.com/";
	
	        d.get(baseWebUrl);


	//
	 Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_ESCAPE);
	 robot.keyRelease(KeyEvent.VK_ESCAPE);
	
	 WebElement element = d.findElement(By.xpath("//*[@id='ala1']"));
	 
	         element.sendKeys("C:\\selenium_demo\\HTML_Form.html");
	         Thread.sleep(50000);

	
	
	
}
}
