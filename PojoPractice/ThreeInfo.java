package PojoPractice;

import java.util.Scanner;

public class ThreeInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ThreeCalculator c = new ThreeCalculator();

		System.out.println("Enter two int Numbers = ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter three int Numbers = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		System.out.println("Enter two double Numbers = ");
		double p = sc.nextDouble();
		double q = sc.nextDouble();

		System.out.println(a + b);
		System.out.println(x + y + z);
		System.out.println(p + q);

	}
}
