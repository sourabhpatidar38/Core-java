package com.sourabhproject.oop;

public class Circle extends Shape{
	
	private int radius = 0;
	
	public Circle() {}
	
	public Circle(int a) {
		radius = a;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		double ar = Shape.PI * radius * radius;
		return ar;
	}
	


}
