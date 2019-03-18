package com.readData2;

import java.io.IOException;

public class ReadDemo2 extends DataReading2 {
	public static void main(String[] args) throws IOException {
		String fileName = "Auction.xlsx";
		String sheetName = "Fi_Bu_03";
		int rowNum = 1;

		DataReading2 obj = new DataReading2();
		String s = obj.getExcelValue(fileName, sheetName, "state", rowNum);
		System.out.println(s);
	}
}
