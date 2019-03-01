package abstraction;

/*
 * 	1. abstract keyword can only be used with classes, methods (in an abstract class) and  interfaces.
	2. We focus in what a class can do instead of how it does it.
	3. Goal is to provide reusable variables and methods to subclasses.
	4. Can not be instantiated. 
		* We can not create an object from it. 
	5. Every class is a type. an abstract class is called abstract type. There are 2 ways to create abstract types:
		* creating an abstract class
		* creating an interface.
	6. It is meant to be inherited
	7. Abstract class  may include:
		* Constructor
		* blocks
		* Abstract Methods:  do not have a body
		* 					 can NOT be final or private
		* 					 can be default(not writing anything as access modifier), protected, private
		* 					 when implementing abstract method it should be same or more visible
		* Concrete methods: regular methods (static and instance methods)
		* Concrete variables: regular variables (static and instance variables). Variables can NOT be abstract.
	Note: abstract methods can only be inside abstract classes.
	8. When a sub-class extends an abstract class then sub-class must provide implementation for all the abstract methods.
	9. abstract class can extends other abstract class without implementing abstract methods. 
		* first concrete class has to implement the abstract methods if any.
	10. Abstract class can extend concrete and other abstract classes
	11. Abstract class can implement an interface without implementing abstract methods
		* first concrete class has to implement the abstract methods if any.
 */

public abstract class BankCard {

	String name; // <-variables can not be abstract
	double cardNumber;
	double balance;

	public BankCard(String name, double cardNumber, double balance) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	protected abstract double withdraw(double withdraw); // <- abstract methods do not have a body {}

	public double deposit(int deposit) { // <- no abstract method
		return balance += deposit;
	}
}
