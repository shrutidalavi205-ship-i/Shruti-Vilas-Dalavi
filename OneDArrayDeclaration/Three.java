package OneDArrayDeclaration;

public class Three {

	public static void main(String[] args) {

		int[] num = { 4, 6, 7, 3, 5, 2, 8 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];
		}
		System.out.println("Total sum = " + sum);
	}
}
