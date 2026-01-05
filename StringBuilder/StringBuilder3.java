package StringBuilder;

public class StringBuilder3 {

	public static void main(String[] args) {

		String str = "Shruti";

		StringBuilder sb = new StringBuilder(str);

		sb.reverse();

		String reverse = sb.toString();

		System.out.println(reverse);
	}
}
