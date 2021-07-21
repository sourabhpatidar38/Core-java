package com.sourabhproject.oop;

public class PersonTwo {
	
	protected String fname;
	protected String lname;
	protected String address;
	
	public PersonTwo() {
		System.out.println("First cont.....");
	}
	
	public PersonTwo(String fn,String ln) {
		fname = fn;
		lname = ln;
		System.out.println("Second cont..."+fn+" "+ln);
		
	}
	
	public PersonTwo(String fn,String ln,String add) {
		this(fn, ln);
		address = add;
		System.out.println("3rd cont....."+fn+" "+ln+" "+add);
	}
	
	public void changeAddress() {
		System.out.println("Your Current Address is Indore");
	}
	
	public static void main(String[] args) {
		
		PersonTwo p = new PersonTwo("Sourabh", "Patidar", "Indore");
	}

}
