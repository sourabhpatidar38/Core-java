package com.sourabhproject.oop;

public class Automobile {
	
	private String color = null;
	private int speed = 0;
	private String make = null;
	public static final int noOfGears = 4;
	
	public Automobile() {
		System.err.println("CHAPRII___AUTOMOBILE");
	}
	public Automobile(String a, int b, String c) {
		color = a;
		speed = b;
		make = c;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int breaak() {
		
		speed = speed - 25;
		
		return this.speed;
		
	}
	public int changeGear(int a) {
		if (a > 5 ) {
			System.out.println("You Have only 5 Gear");
		}else {
		speed = a * 25;
		}
		return speed;
		
	}
	public int acceleration() {
		
		speed = speed + 10; 
		
		return this.speed;
		
	}

}
