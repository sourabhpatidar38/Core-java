package com.sourabhproject.basic;

public class DividibleBySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 196;
		int b = 105;
		int n=0,sum=0;
		while(n/7==0) 
		{
			n=((a-b)/7)+1;
			sum = (n/2)*(a+b);
			System.out.println("The Total Number between 100 to 200 Divisible by 7 is "+n);
			System.out.println("The Total Sum between 100 to 200 Divisible by 7 is "+sum);
		}
		

	}

}
