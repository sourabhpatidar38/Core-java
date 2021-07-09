package com.sourabhproject.basic;

public class ShowAllEvenAndOddNumber {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			while(i%2==0) {
				System.out.println(i+" is Even");
				break;
			}System.out.println(" ");
			while(i%2!=0) {
				System.out.println(i+" is Odd");
				break;
			}
		}
	}

}
