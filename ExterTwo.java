package com.sourabhproject.basic;

public class ExterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100,S,n=0 ,l = 0,c = 0,n1=0,n2=0;
		
		for (int i=0;i<=7;i++) {
			c=a+i;
			while(c%7==0) {
				System.out.println("first term="+c);
				n1=c;
			break;
			}
		}
		int b=200;
		 
		for (int i=0;i<=7;i++) {
			l=b-i;
			
			while(l%7==0) {
				System.out.println("last term="+l);
				n2=l;
			break;
			}
		}
		 n= ((n2-n1)/7)+1;
		 S=n*(a+l)/2;
		System.out.println("no of terms="+n);
		System.out.println("Sum="+S);

	}

}