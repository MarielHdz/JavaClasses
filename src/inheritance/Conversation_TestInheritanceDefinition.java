package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Conversation_TestInheritanceDefinition {

	public static void main(String[] args) {

//		TextMessage_InheritanceDefinition txt1 = new TextMessage_InheritanceDefinition();
//		txt1.send();	
//		
//		TextMessage_InheritanceDefinition txt2 = new TextMessage_InheritanceDefinition("Kevin", "Scott", "hi! how is it going?");
//		txt2.send();
//		txt2.reply("I am fine, How are you?!");
//		
//		IMessage_InheritanceDefinition imessage = new IMessage_InheritanceDefinition("Lora", "Jane", "Whats up!");
//		imessage.send();
//		
//		VoiceMessage_InheritanceDefinition vm = new VoiceMessage_InheritanceDefinition("Wiki", "Tiki", "Aloha! This is Wiki, Please call me back asap.");
//		vm.send();
//		
//		Message_InheritanceDefinition msg = new Message_InheritanceDefinition();
//		msg.setSender("John");
//		msg.setReceiver("Smith");
//		msg.setMessageBody("Good morning");
//		msg.send();
//		msg.reply("Have a good day");

		List<String> msgs = new ArrayList<>();
		msgs.add("Hello");
		msgs.add("Hi, How can I help");
		msgs.add("I need to increase my conection speed");
		msgs.add("Sure, no problem");

		TextMessage_InheritanceDefinition txt3 = new TextMessage_InheritanceDefinition();
		for (int i = 0; i < msgs.size() - 1; i++) {
			if (i == 0 || i % 2 == 0) {
				txt3.setSender("John");
				txt3.setReceiver("Smith");
				txt3.setMessageBody(msgs.get(i));
				txt3.send();
				txt3.reply(msgs.get(i + 1));
			}
		}

	}
}
