package Scanner;

import java.util.Scanner;

public class NineteenConvertIntoMinSec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Time in Seconds");
		int t = sc.nextInt();

		int minutes = t / 60;
		int seconds = t % 60;

		System.out.println("The time in Minutes and Seconds = " + minutes +"Minutes"+ "" + seconds +"Seconds");
	}
}
