package OneDArrayDeclaration;

public class Twelve {

	public static void main(String[] args) {

		int[] num = { 3, 6, 5, 8, 9, 45, 55 };

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				num[i] = 0;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
