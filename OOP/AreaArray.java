package com.sourabhproject.oop;

public class AreaArray {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1);
		s[1] = new Rectangle(5,7);
		s[2] = new Triangle(4, 5);
		
		double d = s[0].area();

		
		double totalArea = calArea(s);
		System.out.println("Total Area = "+totalArea);
		System.out.println(d);
		

	}
	public static double calArea(Shape[] s) {
		double totalArea  = 0;
		
		for (int i = 0; i <s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}

}
