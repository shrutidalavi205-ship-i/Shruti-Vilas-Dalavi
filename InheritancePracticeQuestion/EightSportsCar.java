package InheritancePracticeQuestion;

public class EightSportsCar extends EightCar {

	void myMessage3() {
		System.out.println("Sports Car");
	}

	public static void main(String[] args) {
		EightSportsCar e = new EightSportsCar();
		e.myMessage();
		e.myMessage2();
		e.myMessage3();
	}
}
