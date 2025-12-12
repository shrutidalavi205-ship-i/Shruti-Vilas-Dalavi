package InheritanceVariablesMethodsConstructor;

public class FiveCat extends FiveAnimal {

	FiveCat() {
		super("Muny", 4);
	}

	void name2() {
		System.out.println("Bokya");
	}

	public static void main(String[] args) {
		FiveDog d = new FiveDog();
		System.out.println("Dog Details");
		d.viewDetails();
		d.eat1();
		System.out.println(" ");
		System.out.println("Cat Details");
		FiveCat c = new FiveCat();
		c.viewDetails();
		c.name2();
	}
}
