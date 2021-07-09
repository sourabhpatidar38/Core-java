package com.sourabhproject.basic;

import java.util.Iterator;

public class RevChar {
	public static void main(String[] args) {
		String name = "Sourabh Patidar";

		for(int i=name.length()-1; i>0; i--) {
			
			System.out.print(name.charAt(i));
		
		}
		
	}
}
