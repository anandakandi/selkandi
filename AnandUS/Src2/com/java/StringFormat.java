package com.java;

public class StringFormat {
public static void main(String[] args) {
	String s1 = String.format("%d %d %d %d %d", 10, 20, 30,40, 50);
	
	System.out.println(s1);
	
	String s2 = String.format("%3$d %2$d %1$d", 300,200,100);
	System.out.println(s2);
}
}
