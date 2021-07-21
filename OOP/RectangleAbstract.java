package com.sourabhproject.oop;

public class RectangleAbstract extends ShapeAbstract{

	private int length = 0;
	private int width = 0;
	
	public RectangleAbstract() {}
	
	public RectangleAbstract(int a, int b) {
		length = a;
		width = b;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		double ar = length * width;
		return ar;
		
	}

}
