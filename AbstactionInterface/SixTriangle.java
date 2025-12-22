package AbstactionInterface;

public class SixTriangle implements SixShape {

	@Override
	public void area() {
		System.out.println("Area of Triangle");
	}

	@Override
	public void edges() {
		System.out.println("Three Edges");
	}
}
