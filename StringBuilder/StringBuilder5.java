package StringBuilder;

public class StringBuilder5 {

	public static void main(String[] args) {

		String str = "Characters";

		StringBuilder sb = new StringBuilder(str);

		sb.delete(2, 5);

		String result = sb.toString();

		System.out.println(result);
	}
}
