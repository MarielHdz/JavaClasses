package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingAndExceptions {

	/*
	 * Overriding method can not throw new or broader CHECKED exception in sub class
	 */
	public static void main(String[] args) {

	}
}

class Super {
	
	void playWithFire() throws IOException {} //checked/compile exception
	void playWithWater() throws NullPointerException {} //unchecked/runtime exception
	void playing() throws RuntimeException {} //unchecked/runtime exception
}

class Subclass extends Super {
	
	//OVERRIDING checked/compile exception
//	void playWithFire() throws Exception{ }//illegal: can't override with broader checked exception
//	void playWithFire() throws ClassNotFoundException{ }//illegal: can't override with new checked exception
	void playWithFire(){} // legal: not throwing any exception
//	void playWithFire() throws FileNotFoundException{} // legal: throw a subclass 
//	void playWithFire() throws RuntimeException{} // legal: throw any runtime exception
	
	//OVERRIDING unchecked/runtime exception
//	void playWithWater() {} //legal: not throwing any exception
	void playWithWater() throws NullPointerException {} //legal: we can override with same unchecked exception
//	void playWithWater() throws ArithmeticException {} //legal:  we can override with new runtime exception
//	void playWithWater() throws RuntimeException {} //legal:  we can override with broader exception as long as broader is also unchecked/runtime exception.
//	void playWithWater() throws ClassNotFoundException {} //illegal: can't override with any checked exception

	void playing() throws ArithmeticException {} //legal: we can override with less broader runtime exception
}

