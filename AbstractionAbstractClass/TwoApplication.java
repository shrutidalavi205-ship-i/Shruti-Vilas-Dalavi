package AbstractionAbstractClass;

public class TwoApplication {

	public static void main(String[] args) {

		TwoSmartDevice s;
		s = new TwoSmartWatch();

		System.out.println("Smart Watch Details");

		s.connectToInternet();
		s.batteryStatus();

		System.out.println(" ");

		s = new TwoSmartSpeaker();

		System.out.println("Smart Speaker Details");
		
		s.connectToInternet();
		s.batteryStatus();
	}
}
