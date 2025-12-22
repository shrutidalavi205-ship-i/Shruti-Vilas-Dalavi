package AbstactionInterface;

public class TenASUS implements TenLaptop {

	@Override
	public void brand() {
		System.out.println("ASUS");
	}

	@Override
	public void ram() {
		System.out.println("10 GB");
	}

	@Override
	public void price() {
		System.out.println("70000 ru");
	}
}
