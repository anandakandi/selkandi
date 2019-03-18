package com.loops;

public class DoWhileDemo {
	public static void main(String[] args) {
		// This is Do while loop. this is disadvantage..before going to check
		// the the condition it will do actions.
		int i = 5;
		do {
			System.out.println("i value :" + i);
			i++;
		} while (i < 10);

		// While loop
		int a = 0;
		while (a <5) {
		  System.out.println("a value : "+a);
		  a++;
		}
		
	}
}
