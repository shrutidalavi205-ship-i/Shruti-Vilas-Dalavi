package Scanner;

import java.util.Scanner;

public class SixteenSquareCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number for Print Square and Cube");
		int a = sc.nextInt();

		int num = a * a;
		System.out.println("The Square of the Number is = " + num);

		int num2 = a * a * a;
		System.out.println("The Cube of the Number is = " + num2);
	}
}
