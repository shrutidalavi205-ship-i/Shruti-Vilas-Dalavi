package PolymorphismOverrding;

public class FiveCircle extends FiveShape {

	@Override
	void name() {
		System.out.println("Circle");
	}

	void shape() {
		System.out.println("Circle is a child class");
	}

	public static void main(String[] args) {
		FiveShape s = new FiveShape();
		s.name();
		FiveCircle c = new FiveCircle();
		c.name();
		c.shape();
	}
}
