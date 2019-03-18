package com.java;

public class ReverseWordByWordDemo {
	public static void main(String[] args) {
		reverseWord("sasidhar reddy");
	}
	
	/*
	 * Creating new method to reverse the string word by word.
	 */
	public static void reverseWord(String str){
		
		//Create String Array with splitting the words by space.
		String[] words = str.split(" ");
//		Declared and initialized the revString variable with nulll value.
		String reversedString="";
		String reverseWord="";
		
		for(int i=0; i<words.length; i++){
			
			String word = words[i];
			

			reverseWord = reverseWord+word;
			
			
		}
		System.out.println(reverseWord);
		
	}
}
