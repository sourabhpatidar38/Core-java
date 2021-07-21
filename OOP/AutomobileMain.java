package com.sourabhproject.oop;

public class AutomobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automobile a = new Automobile();
		
		a.setColor("Red");
		a.setMake("2020");
		
		System.out.println(a.getColor());
		System.out.println(a.getMake());
		System.out.println(a.acceleration());
		System.out.println(a.changeGear(4));
		System.out.println(a.breaak());
		

	}

}
