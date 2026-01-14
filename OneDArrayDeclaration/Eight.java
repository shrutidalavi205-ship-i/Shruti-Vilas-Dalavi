package OneDArrayDeclaration;

public class Eight {

	public static void main(String[] args) {

		int[] num = { 34, 67, 54, 78, 65 };

		int num1 = 54;

		boolean exists = false;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == num1) {
				exists = true;
				break;
			}
		}

		if (exists) {
			System.out.println(num1 + " = Exists");
		} else {
			System.out.println(num1 + " = Not Exist");
		}

	}
}
