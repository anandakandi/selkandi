package com.n1.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.FieldAttributes;

import jxl.Sheet;

//Read data from xls file
public class ReadData {
	public static void main(String[] args) throws InterruptedException, IOException {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		Thread.sleep(3000);

		driver.manage().window().maximize();
		
		File myfile = new File(".//testdata/Auction.xlsx");
		
		FileInputStream iFile = new FileInputStream(myfile);
		
		XSSFWorkbook wk = new XSSFWorkbook(iFile);
		XSSFSheet st = wk.getSheet("Fi_Bu_03");
		
		int rowCount = st.getLastRowNum();
		System.out.println("Row Count : "+rowCount);
		
		for(int i=1; i<=rowCount; i++){
			Row rw = st.getRow(i);
			String uname = rw.getCell(0).getStringCellValue();
			String pwd = rw.getCell(1).getStringCellValue();
			System.out.println(uname +" : " + pwd);
			
		}
		iFile.close();
		
	}
}
