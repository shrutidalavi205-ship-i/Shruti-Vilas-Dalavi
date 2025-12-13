package Scanner;

import java.util.Scanner;

public class TwelveBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Price of Product");
		double price = sc.nextDouble();

		System.out.println("Enter a Quantity of Product");
		double quantity = sc.nextDouble();

		double bill = price * quantity;
		System.out.println("The Total Bill is = " + bill);
	}
}
