package String;

public class A {

	public static void main(String[] args) {

		// Type 1 through string literal with same values
		String s1 = "shruti";
		String s2 = "shruti";

		System.out.println(s1 == s2); // references
		System.out.println(s1.equals(s2)); // values

//		// Type 1 through string literal with different values
		String st1 = "shruti";
		String st2 = s1;
		String st3 = "vaishnavi";

		System.out.println(st1 == st3); // references
		System.out.println(st1.equals(st2)); // values

//	 with NEW keywords : 

		String str1 = new String("shruti");
		String str2 = "shruti";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(str1 == str2); // references
		System.out.println(str1.equals(str2)); // Values
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.trim());
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str1.contains(str2));
		System.out.println(str1.startsWith(str1));
		System.out.println(str1.endsWith(str2));
		System.out.println(str1.indexOf(4));
		System.out.println(str1.lastIndexOf(5));
		System.out.println(str1.replace("s", "v"));
		System.out.println(str1.substring(2));
		System.out.println(str1.split(str2));
		System.out.println(str1.valueOf(3));
		System.out.println(str1.toCharArray());

//		interns()methods

		String str4 = new String("hello");
		String str5 = str4.intern();
		String str6 = "hello";

		System.out.println(str4 == str5);
		System.out.println(str5 == str6);
	}
}