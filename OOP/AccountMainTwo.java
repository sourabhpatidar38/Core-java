package com.sourabhproject.oop;

public class AccountMainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Account sou = new Account();
		 
		 
		 Account sou2 = new Account("Sourabh Patidar","AC98985896","Saving");
		 
		 
		 
		 System.out.println("Account Number is : "+sou2.getNumber());
		 System.out.println("Account Type is : "+sou2.getAccountType());
		 System.out.println("Account Balance is :"+sou2.getBalance());
		 System.out.println("After Deposit 1000 Rupees Account Balance is : "+sou.deposit(1000));
		 System.out.println("After Withdrawal 1000 Rupees Account Balance is : "+sou.withdrawal(2000));
		 System.out.println("After Transfer 1000 Rupees Account Balance is :"+sou.fundTransfer(600));
		 System.out.println("Afer Paying 1000 rupess bill Account Balance is :"+sou.payBill(100));

	}

}
