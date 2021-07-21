package com.sourabhproject.oop;

public class BussinessmanMain implements Richman, SocialWorker {

	@Override
	public void helpToOther() {
		System.out.println("helpToOther");
	}

	@Override
	public void earnmoney() {
		System.out.println("earnmoney");

	}

	@Override
	public void donation() {
		System.out.println("donation");

	}

	@Override
	public void party() {
		System.out.println("party");

	}

	public static void main(String[] args) {

		BussinessmanMain b = new BussinessmanMain();

		b.donation();
		b.earnmoney();
		b.party();
		b.helpToOther();
	}

}
