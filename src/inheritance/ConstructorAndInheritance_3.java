package inheritance;

public class ConstructorAndInheritance_3 extends ConstructorAndInheritance_2 {

	public ConstructorAndInheritance_3() {
		/*
		 * I do not need super() keyword because super class has a no
		 * arguments constructor. the parent of this class is extending a different class that is
		 * the reason that when I create an object of this class it will call 3
		 * constructors: the parent of my parent class constructor then my parent class
		 * constructor and at the end this class constructor.
		 */

		System.out.println("calling ConstructorAndInheritance_3 constructor");
	}

	public static void main(String[] args) {

		ConstructorAndInheritance_3 c3 = new ConstructorAndInheritance_3();

	}

	/*
	 * output: calling ConstructorAndInheritance constructor. calling
	 * ConstructorAndInheritance_2 constructor. calling ConstructorAndInheritance_3
	 * constructor
	 */
}
