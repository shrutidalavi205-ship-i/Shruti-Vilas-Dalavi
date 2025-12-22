package AbstactionInterface;

public class NineLaptop implements NineEletronicProduct {

	@Override
	public void name() {
		System.out.println("Hp");
	}

	@Override
	public void price() {
		System.out.println("50000 Ru");
	}
}
