package overriding;

public class OutOfStateStudent extends LocalStudent {

	public static void main(String[] args) {
		
		LocalStudent ls3 = new LocalStudent("Juan", 2, 22);

		ls3.staticMethod(); //do something different
	}
}
