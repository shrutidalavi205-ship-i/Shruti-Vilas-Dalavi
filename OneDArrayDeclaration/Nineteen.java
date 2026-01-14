package OneDArrayDeclaration;

public class Nineteen {

	public static void main(String[] args) {

		int[] num = { 34, 6, 7, 5, 3, 2 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum = sum + num[i];

				System.out.println(num[i]);
			}
		}
		System.out.println("Sum of Even Numbers = " + sum);
	}
}
