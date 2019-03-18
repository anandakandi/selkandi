package com.java;

import java.util.StringJoiner;

public class StringSeperator {
	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(", ");
		str.add("hhh");
		str.add("oioio");
		
		String theResult =str.toString();
		System.out.println(theResult);
		
		
		StringJoiner sj = new StringJoiner(", ", "{","}");
		sj.add("sasidhar");
		sj.add("hello");
		
		String str34 = sj.toString();
		System.out.println(str34);
	}
	
	
}
