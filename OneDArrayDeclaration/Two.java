package OneDArrayDeclaration;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("Enter Marks");

		int[] marks = new int[5];

		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		System.out.println("*******************");
		for (int i = 0; i < marks.length; i++) {

			System.out.println(marks[i]);
		}

	}
}
