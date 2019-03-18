package com.java;

public class FibonacciWhileLoop {
	public static void main(String[] args) {
		int n = 10, t1 = 0, t2 = 1, i = 1;
		while (t1 <= n) {
			System.out.print(t1 + " + ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println("**************************");
		int s = 10, a = 0, b = 1, c = 1;
		while (c <= n) {
			System.out.print(a + " + ");
			int sum2 = a + b;
			a = b;
			b = sum2;
			c++;
		}

		System.out.println("++++++++++++++++++++++");

		int n2 = 100, a1 = 0, b1 = 1;

		System.out.print("Upto " + n2 + ": ");
		while (a1 <= n2) {
			System.out.print(a1 + " + ");
			int sum1 = a1 + b1;
			a1 = b1;
			b1 = sum1;
		}
	}
}
