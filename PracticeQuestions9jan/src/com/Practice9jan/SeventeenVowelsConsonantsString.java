package com.Practice9jan;

public class SeventeenVowelsConsonantsString {

	public static void main(String[] args) {

		String s = "Shruti";
		int v = 0;
		int c = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				v++;
			} else {
				c++;
			}
		}

		System.out.println("Vowels = " + v);
		System.out.println("Consonants = " + c);

	}
}
