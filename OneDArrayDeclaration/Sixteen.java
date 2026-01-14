package OneDArrayDeclaration;

public class Sixteen {

	public static void main(String[] args) {

		int[] num = { 45, 65, 87, 98, 34 };

		System.out.println("Number Greater Than 50.");

		for (int i = 0; i < num.length; i++) {
			if (num[i] > 50) {
				System.out.println(num[i]);
			}
		}
	}
}
