package inheritance;

public class ConstructorAndInheritance {

	/*
	 * My class does not have an empty constructor. Any class extending this class
	 * have to give my constructor expected argument or code will not compile for
	 * that class. we can enter the argument by using the super() keyword in the
	 * child class constructor. the super() keyword call the constructor of the
	 * parent class. when parent class have a no argument constructor we can skip
	 * the super() keyword in the child class constructor.
	 */

	int num;

	public ConstructorAndInheritance(int num) {
		this.num = num;
		System.out.println("calling ConstructorAndInheritance constructor");
	}

	public static void main(String[] args) {

		ConstructorAndInheritance c1 = new ConstructorAndInheritance(31);
	}

	/*
	 * output: calling ConstructorAndInheritance constructor
	 */
}
