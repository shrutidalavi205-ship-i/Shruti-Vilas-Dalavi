package Scanner;

import java.util.Scanner;

public class TwoNameAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Full Name");
		String name = sc.nextLine();

		System.out.println("Enter Your Age");
		int age = sc.nextInt();

		System.out.println("_________");
		System.out.println(" ");

		System.err.print("Your Full Name is = ");
		System.out.println(name);
		System.err.print("Your Age is = ");
		System.out.println(age);
	}
}
