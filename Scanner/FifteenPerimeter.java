package Scanner;

import java.util.Scanner;

public class FifteenPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Sides of Triangle");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int num4 = num1 + num2 + num3;
		System.out.println("The Perimeter of Triangle is = " + num4);
	}
}
