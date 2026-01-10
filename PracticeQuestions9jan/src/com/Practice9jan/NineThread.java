package com.Practice9jan;

public class NineThread extends Thread {

	@Override
	public void run() {
		System.out.println("Name = " + getName());
		System.out.println("Priority = " + getPriority());
	}
}
