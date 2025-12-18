package PolymorphismCombine;

public class ThreeNotificationInfo extends ThreeNotification {

	@Override
	void n(String messageContent) {
		System.out.print("Message");
		System.out.println(messageContent);
	}

	@Override
	void n(String messageContent, String reciversAddress) {
		System.out.print("Address");
		System.out.println(messageContent + "  " + reciversAddress);
	}

	public static void main(String[] args) {

		ThreeNotification n = new ThreeNotification();
		n.n("Hii");
		n.n("Hii", "Pune");

		ThreeNotificationInfo i = new ThreeNotificationInfo();
		i.n("Hii... I am Shruti");
		i.n("Hii... I am Shruti" + "  " + "Tasgaon Phata, Pandharpur Road, Malgaon");

	}

}
