package com.java;
/*
 * 
 */
public class FibonacciForLoop {
	public static void main(String[] args) {
		int t1 = 0;
		int t2 = 1;
		int sum = t1 + t2;
		for (int i = 1; i < 10; i++) {
			sum = t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
		}
	}
}
