package com.sourabhproject.basic;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		Random random = new Random();
		
        for (int i = 1;i <=5;i++) 
        {
            int value =random.nextInt(100);
            System.out.println(value);
        }
	}

}
