package exceptions;

public class CustomExceptions {

	public static void main(String[] args) {
		
//		throw new InvalidCardException(); //won't compile unless handle or declared -Checked-
		throw new InvalidPinCodeException("this pin is incorrect"); // -runtime-
//		throw new InsufficientFundsException("no money");  //-runtime-		
	}
}

class Atm {

	public static void insertCard(String cardType) throws InvalidCardException {
		if (!(cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")
				|| cardType.equalsIgnoreCase("american express"))) {
			throw new InvalidCardException("Invalid card type " + cardType);
		} else {
			System.out.println("card Accepted: " + cardType);
		}
	}
}

/*
 * create a custom check exception
 * 
 * 1. extend Exception class
 */
class InvalidCardException extends Exception { // <-checked exception

	public InvalidCardException() {
		super();
	}

	public InvalidCardException(String message) {
		super(message);
	}
}

class InvalidPinCodeException extends RuntimeException {

	public InvalidPinCodeException() {
		super();
	}

	public InvalidPinCodeException(String message) {
		super(message);
	}
}

class InsufficientFundsException extends RuntimeException {

	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}

class Element {
	public int getSymbol() throws InvalidCardException {
		return -1;
	}
	
	void roar(int level) {
		System.out.println("roar element");
	}
}

class Element2 extends Element {

	public int getSymbol() {
		return -1;
	}
	
	
	@Override
	void roar(int level) {
		System.out.println("roar element 2");
	}
}