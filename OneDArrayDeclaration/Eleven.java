package OneDArrayDeclaration;

public class Eleven {

	public static void main(String[] args) {

		int[] num = { 3, 6, 7, 8, 6, 4, 5 };

		int odd = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				odd = num[i];
				System.out.println(num[i]);
			}
		}

	}
}
