package OverridingAndReferenceCreation;

public class EightPhone extends EightDevice {

	@Override
	void name() {
		System.out.println("Samsung");
	}

	@Override
	void ram() {
		System.out.println("6 GB");
	}

	public static void main(String[] args) {
		EightDevice d;
		d = new EightLaptop();
		System.out.println("Laptop Details");
		d.name();
		d.ram();
		System.out.println(" ");
		d = new EightPhone();
		System.out.println("Phone Details");
		d.name();
		d.ram();
	}
}
