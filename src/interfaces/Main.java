package interfaces;

public class Main {

	public static void main(String[] args) {

		RubyClass rc = new RubyClass();
		rc.code();
		rc.defaultAddedAfterImplementation();
		System.out.println(rc.CONSTANT);
		//rc.staticAddedAfterImplementation(); // compile error. we must call static 
											   // methods using interface name when using
											   // interfaces
		InterfaceOne.staticAddedAfterImplementation();

	}
}
