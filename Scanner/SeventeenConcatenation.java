package Scanner;

import java.util.Scanner;

public class SeventeenConcatenation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Sentence");
		String f = sc.nextLine();

		System.out.println("Enter Second Sentence");
		String s = sc.nextLine();

		System.out.println("The Complete Sentence is the = " + f +" " + s);
	}
}
