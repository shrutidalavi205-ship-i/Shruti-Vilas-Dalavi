package StringBuilder;

public class StringBuilder2 {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("I LOVE PROGRAMMING");

		System.out.println(s);

		int position = s.indexOf("LOVE") + "LOVE".length() + 1;
		s.insert(position, "JAVA ");

		System.out.println(s);
	}
}
