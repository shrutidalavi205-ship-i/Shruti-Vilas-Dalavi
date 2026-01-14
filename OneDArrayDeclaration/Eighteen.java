package OneDArrayDeclaration;

public class Eighteen {

	public static void main(String[] args) {

		int[] num = { 3, 5, 6, 4, 7, 8, 9 };

		int multi = 1;

		for (int i = 0; i < num.length; i++) {

			multi = multi * num[i];
		}
		System.out.println("Total Multiplication = " + multi);

	}
}
