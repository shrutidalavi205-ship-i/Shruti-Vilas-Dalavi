package AbstactionInterface;

public class SixCircle implements SixShape {

	@Override
	public void area() {
		System.out.println("Area of Circle");
	}

	@Override
	public void edges() {
		System.out.println("No Edges");
	}
}
