package OneDimentionalArray;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

//		 Static Initialization

//       1.Integer
//		int[] marks = { 23, 45, 67, 45, 78, 34, 78, 90, 46 };
//
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}

//		2.Character

//		char[] symbols = { '@', '$', 'S', '&', '*', '^', 'D', };
//
//		for (int i = 0; i < symbols.length; i++) {
//			System.out.println(symbols[i]);
//		}

//		3.Long

//		long[] number = { 2344537678l, 5645756756l, 3464576587l, 4325346547l };
//
//		for (int i = 0; i < number.length; i++) {
//			System.out.println(number[i]);
//		}

//		4.float

//		float[] salary = { 34.56f, 45.67f, 45.78f, 56.78f };
//
//		for (int i = 0; i < salary.length; i++) {
//
//			System.out.println(salary[i]);
//		}

//		5.double

//		double[] temp = { 45.67, 56.78, 98.4, 45.67 };
//
//		for (int i = 0; i < temp.length; i++) {
//
//			System.out.println(temp[i]);
//		}

//		6.String
//		String[] name = { "Shruti", "Vaishnavi", "Ganesh", "Onkar", "Harsh" };
//
//		for (int i = 0; i < name.length; i++) {
//			
//			System.out.println(name[i]);
//		}

//		Dynamic Initialization

//		1.Integer normal
//		int[] marks = new int[5];
//
//		marks[0] = 55;
//		marks[1] = 45;
//		marks[2] = 65;
//		marks[3] = 45;
//		marks[4] = 50;
//
//		for (int i = 0; i < marks.length; i++) {
//
//			System.out.println(marks[i]);
//		}

//		1.Integer Scanner

		Scanner sc = new Scanner(System.in);
//
//		System.err.println("Enter Marks");
//
//		int[] marks = new int[5];
//
//		for (int i = 0; i < marks.length; i++) {
//			marks[i] = sc.nextInt();
//		}
//
//		System.out.println("*******************");
//		for (int i = 0; i < marks.length; i++) {
//
//			System.out.println(marks[i]);
//		}

//		2.char normal
//		char[] symbols = new char[5];
//
//		symbols[0] = '%';
//		symbols[1] = '&';
//		symbols[2] = '^';
//		symbols[3] = '*';
//		symbols[4] = 'S';
//
//		for (int i = 0; i < symbols.length; i++) {
//
//			System.out.println(symbols[i]);
//		}

//		2. Char Scanner

//		System.err.println("Enter Symbols");
//
//		char[] symbols = new char[5];
//
//		for (int i = 0; i < symbols.length; i++) {
//			symbols[i] = sc.next().charAt(0);
//		}
//
//		System.out.println("*******************");
//		for (int i = 0; i < symbols.length; i++) {
//
//			System.out.println(symbols[i]);
//		}

//		3.long normal
//		long[] number = new long[5];
//
//		number[0] = 2343556743l;
//		number[1] = 4556346756l;
//		number[2] = 5676467746l;
//		number[3] = 4565656666l;
//		number[4] = 3456464566l;
//
//		for (int i = 0; i < number.length; i++) {
//
//			System.out.println(number[i]);
//		}

//		3.long Scanner

//		System.err.println("Enter Numbers");
//
//		long[] numbers = new long[5];
//
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = sc.nextLong();
//		}
//
//		System.out.println("*******************");
//		for (int i = 0; i < numbers.length; i++) {
//
//			System.out.println(numbers[i]);
//		}

//		4.float normal
//		float[] marks = new float[5];
//
//		marks[0] = 45.67f;
//		marks[1] = 56.78f;
//		marks[2] = 56.65f;
//		marks[3] = 34.56f;
//		marks[4] = 56.89f;
//
//		for (int i = 0; i < marks.length; i++) {
//
//			System.out.println(marks[i]);
//		}

//		4.float Scanner

//		System.err.println("Enter Marks");
//
//		float[] marks = new float[5];
//
//		for (int i = 0; i < marks.length; i++) {
//			marks[i] = sc.nextFloat();
//		}
//
//		System.out.println("*******************");
//		for (int i = 0; i < marks.length; i++) {
//
//			System.out.println(marks[i]);
//		}

//		5.double normal

//		double[] marks = new double[5];
//
//		marks[0] = 45.45;
//		marks[1] = 46.78;
//		marks[2] = 67.89;
//		marks[3] = 78.98;
//		marks[4] = 67.89;
//
//		for (int i = 0; i < marks.length; i++) {
//
//			System.out.println(marks[i]);
//		}

//		5.double Scanner

//		System.err.println("Enter Marks");
//
//		double[] marks = new double[5];
//
//		for (int i = 0; i < marks.length; i++) {
//			marks[i] = sc.nextDouble();
//		}
//
//		System.out.println("*******************");
//		for (int i = 0; i < marks.length; i++) {
//
//			System.out.println(marks[i]);
//		}

//		6.String normal
//		String[] names = new String[5];
//
//		names[0] = "Shruti";
//		names[1] = "Onkar";
//		names[2] = "Harsh";
//		names[3] = "Vaishnavi";
//		names[4] = "Ganesh";
//
//		for (int i = 0; i < names.length; i++) {
//
//			System.out.println(names[i]);
//		}

//		6.String Scanner

		System.err.println("Enter Names");

		String[] names = new String[5];

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}

		System.out.println("*******************");
		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i]);
		}

	}
}
