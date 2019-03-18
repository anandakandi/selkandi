package com.next;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;
//no use this class
public class SelectOptions {

	public static void main(String[] args) throws IOException, InterruptedException {
		// String baseUrl = "https://www.amazon.in/";
		String url = "https://www.amazon.in/b/ref=sr_aj?node=1968024031&bbn=1968024031&ajr=0";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		Thread.sleep(6000);
		String topbrands = "//span[contains(text(),'Top Brands')]/../../../../../../../li";

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement we = driver.findElement(By.xpath(topbrands));
		jse.executeScript("arguments[0].scrollIntoView()", we);

		List<WebElement> dsd = driver.findElements(By.xpath(topbrands));
		System.out.println(dsd.size());
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		File DestFile = new File("D://test1.png");
		FileUtils.copyFile(screenshot, DestFile);
		for (WebElement s : dsd) {
			s.click();
			Thread.sleep(6000);
		}
		

		File screenshot3 = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		File DestFile3 = new File("D://test3.png");
		FileUtils.copyFile(screenshot3, DestFile3);

	}

}
