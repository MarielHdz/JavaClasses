package abstraction;

/*
 * Abstract class can extends other abstract class
 *  and do not have to implement abstract methods
 */
 abstract class AnotherAbstractClass extends BankCard{

	public AnotherAbstractClass(String name, double cardNumber, double balance) {
		super(name, cardNumber, balance);
	}
	
	public abstract void method();

}
