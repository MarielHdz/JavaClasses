package final_keyword;

public class FinalFields {

	/*
	 * when an instance field is final it MUST be initialized or it will show a
	 * compile error: 1. can be initialized in the same line 2. It can be
	 * initialized in the constructor 3. can be initialized in the instance block
	 * 
	 * when a static field is final it MUST be initialized or it will show a compile
	 * error: 1. can be initialized in the same line 2. It can be initialized in the
	 * static block. also by convention static final fields are capitalized
	 * Constant: is a public static final field
	 */

	/*
	 * * order from the program when running: Static block(s) will run first even if
	 * main method is empty. From main method the program will run in order. If we
	 * create an object then the instance block will run and right after the
	 * constructor will run. Constructor and instance blocks run once every time we
	 * create an object.
	 */

	final String brand = "apple"; // <-final instance field can be initialized in the same line or in the
									// constructor or in the instance block
	private final double size;

	public final static String PLATFORM = "iOS"; // <-static final can be initialized in the same line or in the static
													// block. also by convention static final fields are capitalized

	public final static double PRICE;

	static { // <-static block will run only one time when the class is loaded.
		if (PLATFORM == "iOS") {
			PRICE = 700; // <-static final can be initialized in the same line or in the static block
			System.out.println("first static block");
		}
	}

	FinalFields(double size) {
		this.size = size;
		System.out.println("constructor will be printed only if a create an object");
	}

	static {// <- we can have as many static blocks as we want
		System.out.println("second static block");
	}

	public static void staticMethod() {
		System.out.println("printing from static method");
	}

	public static void main(String[] args) {

		System.out.println("Main started");
		FinalFields ff = new FinalFields(4.5);
		// ff.SIZE = 5.5; //can NOT assign a new value to a final field
		// ff.brand = "Samsung"; //can NOT assign a new value to a final field
		FinalFields.staticMethod();
		System.out.println("Main Ended");

	}

	/**
	 * Console output: first static block, second static block, Main started, constructor will be
	 * printed only if a create an object, printing from static method, Main Ended.
	 */
}
