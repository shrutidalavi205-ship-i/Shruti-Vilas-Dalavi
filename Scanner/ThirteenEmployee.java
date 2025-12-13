package Scanner;

import java.util.Scanner;

public class ThirteenEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Employee's Name");
		String name = sc.nextLine();

		System.out.println("Enter a Employee's ID");
		int id = sc.nextInt();

		System.out.println("Enter a Employee's Salary");
		double salary = sc.nextDouble();

		System.err.print("The Employee's Name is = ");
		System.out.println(name);
		System.err.print("The Employee's ID is = ");
		System.out.println(id);
		System.err.print("The Employee's Salary is = ");
		System.out.println(salary);

	}
}
