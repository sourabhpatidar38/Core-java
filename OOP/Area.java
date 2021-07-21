package com.sourabhproject.oop;

public class Area {
	
	public static void main(String[] args) {
		
		Circle c = new  Circle(5);
		c.setColor("red");
		c.setBorderWidth(6);
		
		double d = c.area();
		
		System.out.println("Color : "+c.getColor());
		System.out.println("BorderWidth : "+c.getBorderWidth());
		System.out.println("Area of Circle : "+d);
		
		Rectangle r = new Rectangle(55,33);
		r.setBorderWidth(8);
		r.setColor("Red");
		
		double d1 = r.area();
		
		System.out.println("Color : "+r.getColor());
		System.out.println("BorderWidth : "+r.getBorderWidth());
		System.out.println("Area of Rectangle : "+d1);
		
		Triangle t = new Triangle(33, 22);
		t.setColor("Red");
		t.setBorderWidth(8);
		
		double d3 = t.area();
		
		System.out.println("Color : "+t.getColor());
		System.out.println("BorderWidth : "+t.getBorderWidth());
		System.out.println("Area of Triangle : "+d3);
		
		
		
	}

}
