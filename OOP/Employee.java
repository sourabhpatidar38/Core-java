package com.sourabhproject.oop;

public class Employee extends PersonTwo{
	
	private String designation;
	
	public Employee() {
		System.out.println("Employee First Cont.....");
	}
	
	public Employee(String fn,String ln,String des) {
		
		super(fn, ln);
		designation = des;
		
		System.out.println("Employee Second Cont....."+fn+" "+ln+" "+des);
	}
	
	public void changeAddress(String c) {
		super.changeAddress();
		String add = c;
		System.out.println("After Changing Address Your Current Address is : "+c);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Sourabh", "Patidar", "CEO");
		e.changeAddress("Goa");
	}

}
