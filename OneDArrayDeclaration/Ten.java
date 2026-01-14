package OneDArrayDeclaration;

public class Ten {

	public static void main(String[] args) {

		int[] num = {5,6,8,3,9};

		int[] num1 = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			num1[i] = num[i];
		}

		System.out.println("Elements of first Num:");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println("Elements of second Num:");
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
	}
}
