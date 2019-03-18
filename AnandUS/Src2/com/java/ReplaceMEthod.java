package com.java;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* String formatting methods
 * replace and replaceAll methods
 * 
 * split methods
 * 
 * match methods
 */
public class ReplaceMEthod {
public static void main(String[] args) {
	String s1 = "apple, apple and orange please. ";
	
	String s2=s1.replaceAll("ple", "ricot");
	System.out.println(s1);
	System.out.println(s2);
	
	//just before the word break
	String s3 = s1.replaceAll("ple\\b", "ricot");
	System.out.println(s3);
	
	//split words
	String[] parts = s1.split("\\b");
	System.out.println(Arrays.toString(parts));
	
	//match words
	for (String thePart : parts){
		if(thePart.matches("\\w+")){
			System.out.println(thePart);
		}
	}
	
	//matchers and patterns
System.out.println("working with matchers and patterns");
	Pattern ps = Pattern.compile("\\w+");
	Matcher ms = ps.matcher(s1);
	while (ms.find())
		System.out.println(ms.group());
	
}
}
