package com.sourabhproject.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String fname = null;
	private String lname = null;
	private Date dob = null;
	private String address = null;
	
	public static final int averageAge = 40;
	

	public Person() {
		
		System.err.println("ABOUT_____YOUR______SELF");
		
	}
	
	public Person(String a,String b) {
		fname = a;
		lname = b;
	}
	
	public Person(String a, String b, String c) throws ParseException {
		fname = a;
		lname = b;
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date d = s.parse(c);
		dob = d;
		
		
		
	}
	
	public Person(String a, String b, String c, String e) throws ParseException {
		fname = a;
		lname = b;
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date d = s.parse(c);
		//Date v = s.format(d);
		dob = d;
		address = e;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static int getAverageage() {
		return averageAge;
	}
	

	
	
	
}
