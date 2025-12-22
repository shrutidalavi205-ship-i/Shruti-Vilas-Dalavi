package AbstactionInterface;

public class SevenApple implements SevenFruit {

	@Override
	public void name() {
		System.out.println("Apple");
	}

	@Override
	public void quantity() {
		System.out.println("1 KG");
	}
}
