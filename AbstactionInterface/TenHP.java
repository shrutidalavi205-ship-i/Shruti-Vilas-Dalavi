package AbstactionInterface;

public class TenHP implements TenLaptop {

	@Override
	public void brand() {
		System.out.println("HP");
	}

	@Override
	public void ram() {
		System.out.println("10 GB");
	}

	@Override
	public void price() {
		System.out.println("50000 ru");
	}
}
