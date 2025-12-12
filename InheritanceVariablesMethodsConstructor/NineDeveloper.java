package InheritanceVariablesMethodsConstructor;

public class NineDeveloper extends NineCEO {

	NineDeveloper() {
		super("Mr.Ram Sir", 50.0);
	}

	void part() {
		System.out.println("Full Stack Developer");
	}

	public static void main(String[] args) {
		System.out.println("Manager Details");
		NineManager m = new NineManager();
		m.viewDetails();
		m.department();

		System.out.println(" ");
		System.out.println("Developer Details");
		NineDeveloper d = new NineDeveloper();
		d.viewDetails();
		d.part();
	}
}
