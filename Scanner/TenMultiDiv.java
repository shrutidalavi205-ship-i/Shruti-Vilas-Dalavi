package Scanner;

import java.util.Scanner;

public class TenMultiDiv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Two Numbers");
		int num1 = sc.nextInt();
		double num2 = sc.nextDouble();

		int num3 = (int) (num1 * num2);
		System.out.println("The Multiplication of Two Numbers are = " + num3);

		double num4 = num1 / num2;
		System.out.println("The Division of Two Numbers are = " + num4);
	}
}
