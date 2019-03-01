package inheritance;

public class TextMessage_InheritanceDefinition extends Message_InheritanceDefinition {

	public TextMessage_InheritanceDefinition() {
		setType("TextMessage");
	}
	
	public TextMessage_InheritanceDefinition(String sender,String receiver, String messageBody) {
		setType("TextMessage");
		setSender(sender);
		setReceiver(receiver);
		setMessageBody(messageBody);
	}
}
