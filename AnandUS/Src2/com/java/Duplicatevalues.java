package com.java;

/*
 * This class is for finding duplicate characters in a string.
 */
public class Duplicatevalues {
	public static void main(String[] args) {
		String str1= "This is my name.";
		int c = 0;
		char[] inp = str1.toCharArray();
		for(int i=0; i<str1.length(); i++ ){
			for(int j=i+1; j<str1.length(); j++){
				if(inp[i] == inp[j]){
					System.out.println(inp[j]);
					c++;
					break;
				}
			}
		}
	}
}
