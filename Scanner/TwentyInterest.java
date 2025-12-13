package Scanner;

import java.util.Scanner;

public class TwentyInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Principal");
		double p = sc.nextDouble();

		System.out.println("Enter a Rate");
		double r = sc.nextDouble();

		System.out.println("Enter a Time");
		double t = sc.nextDouble();

		double SI = (p * r * t / 100);

		System.out.println("The Simple Interest is the = " + SI);

	}
}
