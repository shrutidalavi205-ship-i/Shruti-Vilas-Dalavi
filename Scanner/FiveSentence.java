package Scanner;

import java.util.Scanner;

public class FiveSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Sentence ");

		String sentence = sc.nextLine();

		System.err.print("You Entered Sentence is the = ");
		System.out.println(sentence);
	}
}
