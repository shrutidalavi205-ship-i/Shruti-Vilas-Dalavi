package OneDArrayDeclaration;

public class Five {

	public static void main(String[] args) {

		int[] num = { 45, 67, 89, 34, 68 };

		int larg = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > larg) {
				larg = num[i];
			}
		}
		System.out.println("Largest Number is = " + larg);
	}
}
