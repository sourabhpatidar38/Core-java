package com.sourabhproject.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonMainTwo {

	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
	
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");

		
		Person p1 = new Person("Sourabh", "Patidar");
		
		Person p2 = new Person("Sourabh", "Patidar","12-12-2022");
		
		Person p3 = new Person ("Sourabh", "Patidar", "12-12-2022", "Indore");
		
		Date d = p2.getDob();
		
		System.out.println(p1.getFname()+" "+p1.getLname());
		
		System.out.println(p1.getFname()+" "+p1.getLname()+" "+s.format(d));
		
		System.out.println(p1.getFname()+" "+p1.getLname()+" "+s.format(d)+" "+p3.getAddress());
		
		
		
		
	}
}
