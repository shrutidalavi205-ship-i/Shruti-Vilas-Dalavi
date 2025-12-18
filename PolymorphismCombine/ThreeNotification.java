package PolymorphismCombine;

public class ThreeNotification {

	void n(String messageContent) {
		System.err.print("The message is = ");
		System.out.println(messageContent);
	}

	void n(String messageContent, String reciversAddress) {
		System.err.print("The message and recivers address is ");
		System.out.println(messageContent + "  " + reciversAddress);
	}
}
