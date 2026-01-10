package com.Practice9jan;

public class TwelveBlank {
	private double balance;

	TwelveBlank(double b) {
		balance = b;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited = " + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn = " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public double getBalance() {
		return balance;
	}
}
