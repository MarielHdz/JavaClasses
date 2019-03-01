package blocks;

public class StaticBLock {

	static int counter;
	static String name;
	
	/*
	 * static block will run only the first time the class is used.
	 * It is used to initialize all the static fields 
	 */
	
	/*
	 * * order from the program when running: Static block(s) will run first even if main
	 * method is empty. From main method the program will run in order. If we create
	 * an object then the instance block will run and right after the constructor
	 * will run. Constructor and instance blocks run once every time we create an
	 * object.
	 */
	
	static {
		System.out.println("static block message");
		counter = 5;
		name = "abc";
	}
	
	public static void runIt() {
		System.out.println("Running " + name);
	}
}
