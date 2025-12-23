package AbstractionAbstractClass;

public class TwoSmartWatch extends TwoSmartDevice {

	@Override
	public void connectToInternet() {
		System.out.println("When we want the Smart Watch can connect the internet");
	}

	@Override
	public void batteryStatus() {
		System.out.println("90 % battery available in smart watch");
	}

}
