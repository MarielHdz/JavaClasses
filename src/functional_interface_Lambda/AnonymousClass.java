package functional_interface_Lambda;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClass {

	/*
	 * Abstract types like abstract class and interface can not be instantiated
	 * directly.
	 * 
	 * they should be assigned to subclasses or implementing classes of that
	 * interface.
	 * 
	 * Functional Interface: an interface that have a single abstract method and
	 * other elements. Optional: @FunctionalInterface - annotation
	 * 
	 * java gives us some fast ways to use abstract method from a functional
	 * interface without creating a "new class".
	 * 
	 * 1.Anonymous inner class: created inside another class it doesn't have a name.
	 * it implements the interface and overrides the abstract method. this class is
	 * instantiated and assigned to interface reference and statement ended with
	 * semicolon.
	 * 
	 * 2. Lambda Expression: is an instance of a functional interface. 1. is the
	 * only place in the java world where parameter type is optional. 2. if there is
	 * only one parameter then the parenthesis is optional as well. 3. if the body
	 * is only one line we can omit curly braces.
	 */

	public static void main(String[] args) {

		// Before Anonymous Inner Class we needed to instantiate functional Interface
		// with a subclass reference. as in following code

		/////////////////////////////////////////////////////

		Moveable dm = new DistanceMover();
		Moveable am = new Animal();

		List<Moveable> list = new ArrayList<>();
		list.add(dm);
		list.add(am);

		for (Moveable each : list) {
			each.move(1);
		}

		// output:
//		Distance is moving: 1
//		Animal is moving: 1

		/////////////////////////////////////////////////////

		/*
		 * with Anonymous Inner class I can access and give implementation to the
		 * abstract method in the functional inner interface without implementing it.
		 */

		Moveable motorcycle = new Moveable() { // -- Anonymous inner class(don't have a name)
			@Override
			public void move(int distance) {
				System.out.println("Motorcycle is moving: " + distance); // i'm implementing moveable for my Motorcycle
			}
		};

		Moveable truck = new Moveable() { // -- Anonymous inner class(don't have a name)
			@Override
			public void move(int distance) {
				System.out.println("Truck is moving: " + distance); // i'm implementing moveable for my Truck
			}
		};

		motorcycle.move(1); // Motorcycle is moving: 1
		truck.move(3); // Truck is moving: 3
	}
}

@FunctionalInterface
interface Moveable { // functional interface
	void move(int distance);
}

/*
 * DistanceMover and Animal classes must implement the functional interface in
 * order to give implementation to move() method. The only way to avoid this is
 * by Anonymous inner class or Lambda Expression
 */

class DistanceMover implements Moveable {

	@Override
	public void move(int distance) {
		System.out.println("Distance is moving: " + distance);
	}

}

class Animal implements Moveable {

	@Override
	public void move(int distance) {
		System.out.println("Animal is moving: " + distance);
	}
}

class Truck {

}

class Motorcycle {

}