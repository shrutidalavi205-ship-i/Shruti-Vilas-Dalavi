package StringBuffer;

public class StringBuffer6 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Shruti");

		int len = sb.length();

		int cap = sb.capacity();

		System.out.println(len);

		System.out.println(cap);
	}
}
