package PolymorphismOverrding;

public class OneDog extends OneAnimal {

	@Override
	void eat() {
		System.out.println("Dog is eating");
	}

	public static void main(String[] args) {

		OneAnimal a = new OneAnimal();
		a.eat();
		OneDog d = new OneDog();
		d.eat();
	}
}
