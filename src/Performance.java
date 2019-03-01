

public class Performance implements SingMonologue, SpeakDialogue {

	public int talk(String... x) {
		return x.length;
	}

	@Override
	public int talk() {
		return 9;
	}

	public static void main(String[] args) {
		 System.out.println(new Performance().talk(args));


	}
}

