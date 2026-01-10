package com.Practice9jan;

public class SixteenReverseString {

	public static void main(String[] args) {

		String s = "Shruti";
		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);

		}

		System.out.println(s);
		System.out.println(r);
	}
}