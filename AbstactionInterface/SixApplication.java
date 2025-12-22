package AbstactionInterface;

public class SixApplication {

	public static void main(String[] args) {
		SixCircle c;
		c = new SixCircle();
		System.out.println("Circle Details");
		c.area();
		c.edges();
		System.out.println(" ");
		SixTriangle t;
		t = new SixTriangle();
		System.out.println("Triangle Details");
		t.area();
		t.edges();
	}
}
