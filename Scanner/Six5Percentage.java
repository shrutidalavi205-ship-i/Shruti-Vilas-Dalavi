package Scanner;

import java.util.Scanner;

public class Six5Percentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Marks with Subject");
		double marks = sc.nextDouble();
        double total = sc.nextDouble();
		double percentage = (marks / total) * 100;
		System.out.println("Your Percentage is = " + percentage + "%");
	}
}
