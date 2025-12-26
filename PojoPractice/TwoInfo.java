package PojoPractice;

import java.util.Scanner;

public class TwoInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name = ");
		String name = sc.nextLine();

		System.out.println("Enter Age = ");
		int age = sc.nextInt();

		System.out.println("Enter Salary");
		double salary = sc.nextDouble();

		TwoEmployee e = new TwoEmployee(name, age, salary);
		e.display();

		sc.close();
	}
}
