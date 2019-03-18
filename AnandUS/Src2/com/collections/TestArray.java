package com.collections;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		double[] myAray = {9,3,2,3,12,2};
		
		System.out.println(Arrays.toString(myAray));
		
		
		System.out.println(myAray.length);
		for(int i=0; i<myAray.length; i++){
			System.out.println(myAray[i]);
		}
		
		//total the all elements in the array
		double total=0;
		 for (int i = 0; i < myAray.length; i++) {
	         total += myAray[i];
	      }
		  System.out.println("Total is " + total);
		// Print all the array elements by using ForEach loop
	      for (double element: myAray) {
	         System.out.println(element);
	      }
	// if you want to add elements into array
	     
	     
	}
}
