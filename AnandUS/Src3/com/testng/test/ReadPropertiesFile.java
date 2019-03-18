package com.testng.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
	InputStream file = new FileInputStream("config.properties");
	prop.load(file);
	String s = prop.getProperty("browser");
	System.out.println(s);
}
}
