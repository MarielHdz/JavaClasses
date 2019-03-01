package abstraction;

public class ExtendingSecondAbstractClass extends AnotherAbstractClass{

	public ExtendingSecondAbstractClass(String name, double cardNumber, double balance) {
		super(name, cardNumber, balance);
	}

	@Override
	public double withdraw(double withdraw) { //<-must implement abstract methods
		return 0;
	}

	@Override
	public void method() {  //<-must implement abstract methods
		
	}

}
