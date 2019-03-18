package com.next;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	        File screenshot = ((TakesScreenshot)augmentedDriver).
	                            getScreenshotAs(OutputType.FILE);
	        File DestFile=new File(".//screenshots//test.png");
	        FileUtils.copyFile(screenshot, DestFile);
	        
	        WebElement select = driver.findElement(By.tagName("select"));
	        
	        List<WebElement> allOptions = select.findElements(By.tagName("option"));
	        for (WebElement option : allOptions) {
	            System.out.println(String.format("Value is: %s", option.getAttribute("value"))+" : "+option.getText());
//	           
//	            option.click();
	        
	        }
	       
	        
	        
	}
	
	
	
}
