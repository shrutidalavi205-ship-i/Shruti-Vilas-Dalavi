package OneDArrayDeclaration;

public class Six {

	public static void main(String[] args) {

		int[] num = { 45, 67, 89, 34, 68 };

		int small = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < small) {
				small = num[i];
			}
		}
		System.out.println("Smallest Number is = " + small);
	}

}
