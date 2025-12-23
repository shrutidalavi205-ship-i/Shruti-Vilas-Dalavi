package AbstractionAbstractClass;

public class TwoSmartSpeaker extends TwoSmartDevice {

	@Override
	public void connectToInternet() {
		System.out.println("When we want the Smart speaker can connect the internet");
	}

	@Override
	public void batteryStatus() {
		System.out.println("67 % battery available in smart speaker");
	}

}
