package functional_interface_Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

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
	 * only place in the java world where method parameter type is optional. 2. if
	 * there is only one parameter then the parenthesis is optional. 3. if you add
	 * parameter type you must add parenthesis. 3. if the body is only one line we
	 * can omit curly braces. 4. There should be a semicolon at the end of my
	 * statement 5. We must add return keyword if there are curly braces 6. We can
	 * NOT add return keyword if there are not curly braces
	 */

	public static void main(String[] args) {

		Moveable motorcycle = (distance) -> {
			System.out.println("motorcycle distance is: " + distance);
		};

		Moveable truck = distance -> System.out.println("truck distance is: " + distance);

		motorcycle.move(2); // motorcycle distance is: 2
		truck.move(5);// truck distance is: 2

		Loveable horrorMovies = howMuch -> howMuch > 3 ? true : false;
		System.out.println(horrorMovies.loveIt(2)); // false

		Loveable romanticComedy = howMuch -> {
			return howMuch > 5 ? true : false;
		};

		Loveable romanticComedy2 = howMuch -> howMuch > 5 ? true : false;

		System.out.println(romanticComedy.loveIt(6)); // true

		Addable sum = (num1, num2) -> System.out.println("the sum is: " + (num1 + num2));
		sum.compute(2, 5); // the sum is: 7

//		Computable areEvenNumbers = (num1, num2) -> num1 % 2 == 0 && num2 % 2 == 0;
//		System.out.println(areEvenNumbers.canBeCompute(2, 6)); // true
//		System.out.println(areEvenNumbers.canBeCompute(2, 3)); // false
//
//		Computable divisibleByFive = (Integer num1, Integer num2) -> {return num1 % 5 == 0 && num2 % 5 == 0;};
//		System.out.println(divisibleByFive.canBeCompute(10, 15)); // true
//		System.out.println(divisibleByFive.canBeCompute(11, 15)); // false
	}
}

class d {
	@FunctionalInterface
	interface Computable {
		boolean canBeCompute(Integer num1, Integer num2);
	}
}

@FunctionalInterface
interface Addable {
	void compute(int num1, int num2);
}

//functional interface with abstractMmethod with return type
@FunctionalInterface
interface Loveable {

	boolean loveIt(int howMuch);
}