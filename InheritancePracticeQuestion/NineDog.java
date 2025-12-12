package InheritancePracticeQuestion;

public class NineDog extends NineAnimal {

	void myDog() {
		System.out.println("Living Thing Dog");
	}

	public static void main(String[] args) {
		NineDog n = new NineDog();
		n.myLive();
		n.myAnimal();
		n.myDog();
	}
}
