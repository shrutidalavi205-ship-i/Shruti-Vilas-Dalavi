package InheritanceVariablesMethodsConstructor;

public class TwoVideoMessage extends TwoMessage {

	TwoVideoMessage() {
		super("fhue45", "fhsu447");
	}

	void duration() {
		System.out.println("Video Duration 5 min and 32 sec");
	}

	public static void main(String[] args) {

		System.out.println("Text Message Details");
		TwoTextMessage t = new TwoTextMessage();
		t.viewDetails();
		t.content();

		System.out.println("__________________");
		System.out.println(" ");
		System.out.println("Video Message Details");
		TwoVideoMessage v = new TwoVideoMessage();
		v.viewDetails();
		v.duration();
	}
}
