package InheritanceVariablesMethodsConstructor;

public class TwoMessage {

	String messageID;
	String sendersId;

	public TwoMessage(String messageID, String sendersId) {
		this.messageID = messageID;
		this.sendersId = sendersId;
	}

	void viewDetails() {
		System.err.println("Message ID = " + messageID);
		System.err.println("Senders Id = " + sendersId);

	}
}
