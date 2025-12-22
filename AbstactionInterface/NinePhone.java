package AbstactionInterface;

public class NinePhone implements NineEletronicProduct {

	@Override
	public void name() {
		System.out.println("Samsung");
	}

	@Override
	public void price() {
		System.out.println("10000 Ru");
	}

}