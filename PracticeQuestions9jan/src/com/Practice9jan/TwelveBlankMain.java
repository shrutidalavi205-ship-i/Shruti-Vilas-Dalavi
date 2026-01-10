package com.Practice9jan;

public class TwelveBlankMain {

	public static void main(String[] args) {

		TwelveBlank acc = new TwelveBlank(1000);

		acc.deposit(500);

		acc.withdraw(300);

		System.out.println("Current Balance = " + acc.getBalance());
	}

}
