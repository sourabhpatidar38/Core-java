package com.sourabhproject.oop;

public class AccountTwo {
	
	private String accountName;
	private int accountBalance;
	
	public AccountTwo() {}
	
	public AccountTwo(String an,int ab) {
		accountName = an;
		accountBalance = ab;
		
		System.out.println("Account Info "+an+"Balance "+ab);
		
	}

	public String getAccountName() {
		return accountName;
	}

	public int getAccountBalance() {
		return 1000;
	}
	
	
	public static void main(String[] args) {
		
		AccountTwo a = new AccountTwo("Sourabh",2000);
	}

}
