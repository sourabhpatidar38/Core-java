package com.sourabhproject.oop;

public class TriangleAbstract extends ShapeAbstract {
	
	private int base = 0;
	private int height = 0;
	
	public TriangleAbstract() {}
	
	public TriangleAbstract(int a , int b) {
		
		base = a;
		height = b;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double area() {
		double ar = 0.5 * base * height;
		return ar;
	}


}
