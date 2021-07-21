package com.sourabhproject.oop;

public class SavingAccount extends AccountTwo{

	public int getAccountBalance() {
		int i = super.getAccountBalance() + 10;
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount s = new SavingAccount();
		AccountTwo a = new AccountTwo("Sourabh ", 1000);
		AccountTwo sa = new SavingAccount();
		
		System.out.println(s.getAccountBalance());
		System.out.println(a.getAccountBalance());
		System.out.println(sa.getAccountBalance());
		
		
		
		

	}

}
