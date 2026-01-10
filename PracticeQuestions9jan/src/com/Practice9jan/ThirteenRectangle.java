package com.Practice9jan;

public class ThirteenRectangle extends ThirteenShape{

	int length;
	int width;

	ThirteenRectangle(int l, int w) {
		length = l;
		width = w;
	}

	@Override
	void m1() {
		System.out.println("Rectangle = " + 2*(length+width));	}
}
