package com.sourabhproject.oop;

public class AutomobileMainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Automobile a = new Automobile();
        
        Automobile a1 = new Automobile("Red",500,"2020");
        
        
		
		System.out.println(a1.getColor());
		System.out.println(a1.getMake());
		System.out.println(a1.getSpeed());
		
		System.out.println(a.changeGear(4));
		System.out.println(a.acceleration());
		System.out.println(a.breaak());
		

	

	}

}
