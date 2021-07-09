package com.sourabhproject.basic;

import java.util.Iterator;

public class SumOfAllEvenAndOdd {
	public static void main(String[] args) {
		int sum1=0,sum2=0;
		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				sum1=sum1+i;
				
			}else {
				sum2=sum2+i;
			}
			
	   }
		System.out.println("Sum of All Even Number is "+sum1);
		System.out.println(" ");
		System.out.println("Sum of All Odd Number is "+sum2);
			
	}
}
