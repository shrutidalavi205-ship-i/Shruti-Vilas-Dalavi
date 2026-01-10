package com.Practice9jan;

public class ElevenOverloading {

	String name;
	int age;

	ElevenOverloading() {
		name = "Unknown";
		age = 0;
	}

	ElevenOverloading(String n) {
		name = n;
		age = 0;
	}

	ElevenOverloading(String n, int a) {
		name = n;
		age = a;
	}

	void display() {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}
