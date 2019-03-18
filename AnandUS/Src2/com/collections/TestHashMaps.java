package com.collections;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHashMaps {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String >();
	map.put(1, "Sasi");
	System.out.println(map);
	map.put(2, "null");
	
	map.put(3, "null");
	System.out.println(map);
	WebDriver driver;
	driver = new ChromeDriver();
	
	
}
}
