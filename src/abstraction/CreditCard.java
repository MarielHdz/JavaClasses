package abstraction;

/*
 * 	1. abstract keyword can only be used with classes, methods (in an abstract class) and  interfaces.
	2. We focus in what a class can do instead of how it does it.
	3. Goal is to provide reusable variables and methods to subclasses.
	4. Can not be instantiated. 
		* We can not create an object from it
	5. It is meant to be inherited
	6. Abstract class  may include:
		* Constructor
		* blocks
		* Abstract Methods:  do not have a body
		* Concrete methods: regular methods (static and instance methods)
		* 					 can be default(not writing anything as access modifier), protected, private
		* 					 when implementing abstract method it should be same or more visible
		*					 Concrete variables: regular variables (static and instance variables). Variables can NOT be abstract.
		Note: abstract methods can only be inside abstract classes.
	7. When a sub-class extends an abstract class then sub-class must provide implementation for all the abstract methods.
	8. When a sub-class extends an abstract class then sub-class must provide implementation for all the abstract methods.
	9. abstract class can extends other abstract class without implementing abstract methods. 
		* first concrete class has to implement the abstract methods if any.
	10. Abstract class can extend concrete and other abstract classes
	11. Abstract class can implement an interface without implementing abstract methods
		* first concrete class has to implement the abstract methods if any.
 */

public class CreditCard extends BankCard {

	public CreditCard(String name, double cardNumber, double balance) {
		super(name, cardNumber, balance);
	}

	@Override
	protected double withdraw(double withdraw) { // <--sub-class must provide implementation for all the abstract
													// methods.
		double charge = withdraw * (10.0 / 100.0);
		return balance -= (withdraw + charge);
	}

	public static void main(String[] args) {
		// Student s = new Student(); //<-- we can not instantiate an abstract class
	}
}
