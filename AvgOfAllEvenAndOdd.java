package com.sourabhproject.basic;

public class AvgOfAllEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0,sum2=0;
		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				sum1=sum1+i;
				
			}else {
				sum2=sum2+i;
			}
			
		} 
		int avg1=sum1/2;
		int avg2=sum2/2;
		System.out.println("Average of All Even Number is "+avg1);
		System.out.println(" ");
		System.out.println("Average of All Odd Number is "+avg2);
			

	}

}
