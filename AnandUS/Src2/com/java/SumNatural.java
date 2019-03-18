package com.java;

public class SumNatural {
public static void main(String[] args) {
	 int num = 100, sum = 0;

     for(int i = 1; i <= num; ++i)
     {
          sum = sum + i;
//         sum += i;
     }

     System.out.println("Sum = " + sum);
     
     
     System.out.println("*******************************");
     
     
     

     int num2 = 50, i2 = 1, sum2 = 0;

     while(i2 <= num2)
     {
         sum2 += i2;
         i2++;
     }

     System.out.println("Sum2 = " + sum2);
}
}
