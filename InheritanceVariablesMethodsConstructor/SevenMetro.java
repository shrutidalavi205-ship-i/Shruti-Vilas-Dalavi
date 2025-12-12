package InheritanceVariablesMethodsConstructor;

public class SevenMetro extends SevenTicket {

	SevenMetro() {
		super("PCMS", 10);
	}

	void name2() {
		System.out.println("Vaishnavi");
	}

	public static void main(String[] args) {
		System.out.println("Bus Details");

		SevenBus b = new SevenBus();
		b.viewDetails();
		b.name1();

		System.out.println(" ");
		System.out.println("Metro Details");
		SevenMetro m = new SevenMetro();
		m.viewDetails();
		m.name2();
	}
}
