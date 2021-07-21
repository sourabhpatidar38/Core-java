package com.sourabhproject.oop;

public class Account {
	
    private String name = null;
	private String number = null;
	private String accountType = null;
	private Double balance = 5000.00;
	
	public Account() {
		System.err.println("21__DIN__MAE__PASSA__DOUBLE__BANK");
	}
	
	public Account(String a , String b) {
		name = a; 
		number = b;
		
	}
	
	public Account(String a, String b , String c) {
		name = a;
		number = b;
		accountType = c;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public double deposit(int a) {
		 balance = a + balance;
		return this.balance;
	}
	public double withdrawal(int c) {
		balance = balance - c;
		return this.balance;
	}
	public double fundTransfer(int c) {
		balance = balance + c;
		return this.balance;
	}
	public double payBill(int d) {
		balance = balance - d;
		return this.balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
