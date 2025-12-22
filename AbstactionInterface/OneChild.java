package AbstactionInterface;

public class OneChild implements OneFather, OneMother {

	@Override
	public void surName() {
		System.out.println("My Surname is Dalavi from Father");
	}

	private void suName() {
		System.out.println("My Surname is Dalavi From Mother");
	}

	@Override
	public void cooking() {
		System.out.println("Non-Veg");
	}

	public static void main(String[] args) {

		OneChild c = new OneChild();
		c.suName();
		c.surName();
		c.cooking();

		OneChild b;
		b = new OneChild();
		b.suName();
		b.surName();
		b.cooking();
	}
}
