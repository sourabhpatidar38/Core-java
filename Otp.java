package com.sourabhproject.basic;

import java.util.Random;

public class Otp {
	public static void main(String[] args) {
Random r = new Random();
		
        for (int i = 1;i <=5;i++) 
        {
            int value =r.nextInt(9);
            System.out.print(value);
           
        }
	}

}