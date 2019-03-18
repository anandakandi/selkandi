package com.readData;

import java.io.IOException;

public class TestData extends ReadXlsfile{
public static void main(String[] args) throws IOException {
	String fileName = "Auction.xlsx";
	String sheetName = "Fi_Bu_03";
	int rowNum = 1;
	ReadXlsfile data = new ReadXlsfile();
	data.getExcelValue(fileName, sheetName, "State", rowNum).trim();
	
}
}
