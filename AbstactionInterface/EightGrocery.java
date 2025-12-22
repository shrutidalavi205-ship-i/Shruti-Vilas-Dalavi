package AbstactionInterface;

public class EightGrocery implements EightProduct {

	@Override
	public void name() {
		System.out.println("Milk");
	}

	@Override
	public void price() {
		System.out.println("60 ru");
	}
}
