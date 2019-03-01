package inheritance;

public class ConstructorAndInheritance_2 extends ConstructorAndInheritance {

	static int someNumber = 5;

	public ConstructorAndInheritance_2() {
		super(someNumber); /*
							 * super() keyword calls parent class constructor. Without this piece of code my
							 * class will NOT compile because my parent class does not have an empty
							 * constructor. When creating an object of this class 2 constructors will be
							 * called: parent constructor and then this class constructor
							 */

		System.out.println("calling ConstructorAndInheritance_2 constructor");
	}
	
	public ConstructorAndInheritance_2(int numero) {
		this();
	}

	public static void main(String[] args) {

		ConstructorAndInheritance_2 c2 = new ConstructorAndInheritance_2();
	}

	/*
	 * output: calling ConstructorAndInheritance constructor. calling
	 * ConstructorAndInheritance_2 constructor
	 */
}
