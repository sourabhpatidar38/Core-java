package com.sourabhproject.basic;

public class Reverse {
	public static void main(String[] args) {
		int a = 123,r=0;
		while(a!=0) {
			int re= a % 10;
			r = r*10+re;
			a=a/10;
		}
		System.out.println(r);
	}

}
