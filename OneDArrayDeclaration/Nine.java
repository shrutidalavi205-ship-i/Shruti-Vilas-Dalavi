package OneDArrayDeclaration;

public class Nine {

	public static void main(String[] args) {

		int[] num = { 4, 6, 8, 9, 6, 2 };

		System.out.println(num.length);

		for (int i = num.length -1; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}
}
