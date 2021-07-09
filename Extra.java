package com.sourabhproject.basic;

import java.util.Arrays;

public class Extra {

	public static void main(String[] args)
	{
		String str= "Sourabh Patidar lucky";
	      String arr[]=str.split(" ");
	      for(int i=0;i<arr.length;i++)
	      {

	          for(int j=arr[i].length()-1;j>=0;j--)
	          {   
	          System.out.print(arr[i].charAt(j));
	          }
	          System.out.print(" ");
	      }
	   }
}
