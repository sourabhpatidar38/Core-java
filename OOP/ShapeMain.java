package com.sourabhproject.oop;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Shape s1 = new Shape();
		
		s.setColor("red");
		s.setBorderWidth(3);
		s1.setColor("green");
		s1.setBorderWidth(4);
		System.out.println("First shape color "+s.getColor());
		System.out.println("Fitrst shape width "+s.getBorderWidth());
		System.out.println();
		System.out.println("Second shape color "+s1.getColor());
		System.out.println("Second shape width "+s1.getBorderWidth());
	}


	}
