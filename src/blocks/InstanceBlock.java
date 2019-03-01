package blocks;

public class InstanceBlock {
	/*
	 * * order from the program when running: Static block(s) will run first even if main
	 * method is empty. From main method the program will run in order. If we create
	 * an object then the instance block will run and right after the constructor
	 * will run. Constructor and instance blocks run once every time we create an
	 * object.
	 */

	public String instanceField1;
	public final String finalInstanceField1;

	public String instanceField2; // can stay without being initialized but will print null if I call it
	public final String finalInstanceField2;

	public static String staticField1;
	public static final String FINAL_STATIC_FIELD_1;

	public static String staticField2; // can stay without being initialized but will print null if I call it
	public static final String FINAL_STATIC_FIELD_2 = "FINAL_STATIC_FIELD_2";

	{
		System.out.println("instance block");// <-will run every time an object is created

		instanceField1 = "instanceField1";
		finalInstanceField1 = "finalInstanceField1";

		// FINAL_STATIC_FIELD_1 = "FINAL_STATIC_FIELD_1"; //marks
		// compile
		// error because final static fields must be initialized in same line or static
		// block

//		staticField1 = "staticField1_fromInstanceBlock"; // wont mark any compile error but is not recommended to
//															// initialize a static member outside of static block or same
//															// line. instance block and constructor will run only if an
//															// object is created but static elements can be called
//															// without creating an object and if we call a static field
//															// before assigning a value it will come null.
	}

	static {
		System.out.println("running static block 1");

		staticField1 = "staticField1";
		FINAL_STATIC_FIELD_1 = "FINAL_STATIC_FIELD_1";

		// instanceField1 = "instanceField1"; //marks compile error because a non-static
		// member can not be inside a static method
	}

	InstanceBlock() {
		System.out.println("constructor");

		finalInstanceField2 = "finalInstanceField2";

		// FINAL_STATIC_FIELD_1 = "FINAL_STATIC_FIELD_1"; //marks
		// compile
		// error because final static fields must be initialized in same line or static
		// block

//		staticField1 = "staticField_fromConstructor"; // wont mark any compile error but is not recommended to
//														// initialize a static method outside of static block or same
//														// line. instance block and constructor will run only if an
//														// object is created but static elements can be called without
//														// creating an object and if we call a static field before
//														// assigning a value it will come null.
	}

	static {
		System.out.println("running static block 2");
	}

	{
		System.out.println("instance block 2");// <-will run every time an object is created
	}

	public static void staticMethod() {
		System.out.println("printing static method");
	}

	public static void main(String[] args) {

		System.out.println("main starts");
		System.out.println(staticField1);
		staticMethod();

		InstanceBlock ib = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock();

		System.out.println(ib.instanceField1);
		staticMethod();
		System.out.println(staticField1);

		System.out.println("main ended");
	}

	/*
	 * console output: running static block 1, running static block 2, main starts,
	 * staticField1, printing static method, instance block, instance block 2,
	 * constructor, instance block, instance block 2, constructor, instanceField1,
	 * printing static method, staticField1, main ended.
	 */
}
