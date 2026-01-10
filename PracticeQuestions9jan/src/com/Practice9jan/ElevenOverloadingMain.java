package com.Practice9jan;

public class ElevenOverloadingMain {

	public static void main(String[] args) {

		ElevenOverloading s = new ElevenOverloading();
		ElevenOverloading s1 = new ElevenOverloading("Shruti");
		ElevenOverloading s2 = new ElevenOverloading("Shruti", 21);

		s.display();
		s1.display();
		s2.display();
	}

}
