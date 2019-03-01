package inheritance;

public class VoiceMessage_InheritanceDefinition extends TextMessage_InheritanceDefinition{
	
	public VoiceMessage_InheritanceDefinition(String sender,String receiver,String messageBody) {
		setType("VoiceMessage");
		setSender(sender);
		setReceiver(receiver);
		setMessageBody(messageBody);
	}
}
