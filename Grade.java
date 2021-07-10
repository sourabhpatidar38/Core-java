package com.sourabhproject.basic;

public class Grade {
	public static void main(String[] args) {
		int a = 89;
		
		if(a>0 && a<33) {
			System.out.println("Fail");
		}
		             else if(a>91 && a<100) {
			             System.out.println("Grad A1");
		}
		             else if(a>81 && a<90) {
			System.out.println("Grad A2");
		}
		             else if(a>71 && a<80) {
				System.out.println("Grad B1");
			}
		             else if(a>61 && a<70) {
					System.out.println("Grad B2");
				}
		             else if(a>51 && a<60) {
						System.out.println("Grad C1");
					}
		             else if(a>41 && a<50) {
							System.out.println("Grad C2");
						}
		             else {
							System.out.println("Grad D");
						}
	}

}