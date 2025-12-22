package AbstactionInterface;

public class EightElectronic implements EightProduct {

	@Override
	public void name() {
		System.out.println("Phone");
	}

	@Override
	public void price() {
		System.out.println("20000 ru");
	}
}
