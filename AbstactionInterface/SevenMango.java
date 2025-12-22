package AbstactionInterface;

public class SevenMango implements SevenFruit {

	@Override
	public void name() {
		System.out.println("Mango");
	}

	@Override
	public void quantity() {
		System.out.println("2 KG");
	}
}
