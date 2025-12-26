package StaticKeyword;

public class ThreeOuter {

	static class Inner {

		static void display() {
			System.out.println("Inner Class");
		}
	}

	public static void main(String[] args) {

		ThreeOuter.Inner i = new ThreeOuter.Inner();
		i.display();
	}

}
