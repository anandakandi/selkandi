package com.testng.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadDataFrmCSV {
	public static void main(String[] args) throws FileNotFoundException {
		String csvFile = "./testdata/country.csv";
		String line = "";
		String cvsSplitBy = ",";
		String[] country = null;
		// FileReader file = new FileReader(csvFile);
		// try (BufferedReader br = new BufferedReader(file)) {
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				country = line.split(cvsSplitBy);

				System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

				System.out.println(Arrays.toString(country));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
