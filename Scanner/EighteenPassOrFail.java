package Scanner;

import java.util.Scanner;

public class EighteenPassOrFail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Marks");
		float m = sc.nextFloat();

		if (m > 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}
