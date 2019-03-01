package inheritance;


/*a class in java can inherit variables and methods from another class. We do this by using the keyword extends.
 * 
 * Parent class -> child class or
 * Super class -> sub class
 * 
 * this is also known as a IS A relationship * 
 */

public class Message_InheritanceDefinition {

	private String sender;
	private String receiver;
	private String type;
	private String messageBody;

	{

		sender = "Unknown";
		receiver = "Unknown";
		type = "Unknown";
		messageBody = "";
	}
	
	public void send() {
		if (sender.equals("unknown") || receiver.equals("unknown") || messageBody.isEmpty()) {
			System.out.println("Error : Message sending failure");
			return;
		}
		
		String str = "Message Sent Successfully: \n" + "[Sender=" + sender + "]\n" + "[Receiver=" + receiver + "]\n"
				+ "[Type=" + type + "]\n" + "[MessageBody=" + messageBody + "]\n";
		System.out.println(str);
	}
	
	public void reply(String messageBody) {

		String receiver = getReceiver();
		setReceiver(getSender());
		setSender(receiver);

		setMessageBody(messageBody);
		send();
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
}
