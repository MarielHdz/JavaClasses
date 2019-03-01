package inheritance;

public class IMessage_InheritanceDefinition extends Message_InheritanceDefinition{

	public IMessage_InheritanceDefinition(String sender,String receiver,String messageBody) {
		setType("IMessage");
		setSender(sender);
		setReceiver(receiver);
		setMessageBody(messageBody);
	}
}
