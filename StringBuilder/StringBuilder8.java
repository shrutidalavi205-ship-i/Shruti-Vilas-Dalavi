package StringBuilder;

public class StringBuilder8 {

	public static void main(String[] args) {

		String str = "121";

		StringBuilder sb = new StringBuilder(str);

		sb.reverse();

		String reversed = sb.toString();

		if (str.equals(reversed)) {

			System.out.println("Palindrome");

		} else {
			System.out.println("No Palindrome");
		}

	}
}
