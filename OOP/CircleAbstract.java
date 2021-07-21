package com.sourabhproject.oop;

public class CircleAbstract extends ShapeAbstract{
	
private int radius = 0;
	
	public CircleAbstract() {}
	
	public CircleAbstract(int a) {
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
