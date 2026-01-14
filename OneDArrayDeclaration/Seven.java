package OneDArrayDeclaration;

public class Seven {

	public static void main(String[] args) {

		int[] num = { 45, 67, 89, 34, 68 };

		int even = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even = num[i];
				System.out.println(num[i]);
			}
		}

	}
}