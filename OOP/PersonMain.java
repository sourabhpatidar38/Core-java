package com.sourabhproject.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonMain {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse("12-03-2012");
		Person p = new Person();
		
		p.setFname("Sourabh");
		p.setLname("Patidar");
		
		p.setAddress("Sagore");
		p.setDob(d);
		
		Date d1 = p.getDob();
		
		System.out.println(sdf.format(d1));
		System.out.println(p.getFname()+p.getLname());
		System.out.println(p.getAddress());
	}

}
