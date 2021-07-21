package com.sourabhproject.oop;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account sou = new Account();
		 sou.setNumber("10000000001");
		 sou.setAccountType("Saving");
		 sou.setBalance(5000.00);
		 
		 double  b = sou.getBalance();
		 double  dp = deposit();
		 double wd = withdrawal();
		 double fd = fundTransfer();
		 double pb = paybill();
		 
		 double cb = b+dp;
		 double cb1 = b-wd;
		 double cb2 = cb1-fd;
		 double cb3 = cb2-pb;
		 
		
		 System.out.println("Account Number is : "+sou.getNumber());
		 System.out.println("Account Type is : "+sou.getAccountType());
		 System.out.println("Account Balance is :"+sou.getBalance());
		 System.out.println("After Deposit 1000 Rupees Account Balance is : "+cb);
		 System.out.println("After Withdrawal 1000 Rupees Account Balance is : "+cb1);
		 System.out.println("After Transfer 1000 Rupees Account Balance is :"+cb2);
		 System.out.println("Afer Paying 1000 rupess bill Account Balance is :"+cb3);
		 
		 System.out.println("  ");
		 
		 System.out.println("Account Number is : "+sou.getNumber());
		 System.out.println("Account Type is : "+sou.getAccountType());
		 System.out.println("Account Balance is :"+sou.getBalance());
		 System.out.println("After Deposit 1000 Rupees Account Balance is : "+sou.deposit(1000));
		 System.out.println("After Withdrawal 1000 Rupees Account Balance is : "+sou.withdrawal(2000));
		 System.out.println("After Transfer 1000 Rupees Account Balance is :"+sou.fundTransfer(600));
		 System.out.println("Afer Paying 1000 rupess bill Account Balance is :"+sou.payBill(100));
		 
		
		
		
		
		
		

	}
	public static double deposit() {
		return 1000;
		
		
		
	}
	
	public static double withdrawal() {
		return 2000;
		
	}
	
	public static double fundTransfer() {
		return 1000;
		
	}
	
	public static double paybill() {
		return 1000;
		
	}

}
