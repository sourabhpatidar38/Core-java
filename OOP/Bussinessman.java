package com.sourabhproject.oop;

public class Bussinessman {
	
	private String name;
	private String address;
	private double account = 5000.00;
	
	public Bussinessman() {
		System.err.println("_Rays_Bussinessman_");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	
	public double earnMoney(int e) {
		
		account = account + e;
		
		return account;
	}
	
	public double donation(int d) {
		
		account = account - d;
		
		return account;
	}
	
	public double party(int p) {
		
		account = account - p;
		
		return account;
	}
	
	public double helpToOther(int h) {
		
		account = account - h;
		
		return account;
		
	}

}
