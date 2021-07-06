package com.sourabhproject.basic;

public class Factorial {

	public static void main(String[] args) {
		int a = 1;
		int number = 5;
		for (int i = 1; i<=number; i++) {
			a = a*i;
			
			
		}System.out.println("The factorial of "+number+" is "+a);
	}
}
