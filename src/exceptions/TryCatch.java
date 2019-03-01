package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

	/*
	 * -If a line has error then the next line will not be reached because program
	 * will go to the catch block.
	 * 
	 * -NESTED BLOCK we can add a try catch inside another try catch when doing this
	 * we can not use same parameter name in our catch block.
	 * 
	 * -When we use a multi-catch block we must catch from more specific exception
	 * to more general exception otherwise the code will not compile.
	 * 
	 * -FINALLY BLOCK is usually used to cleanup. It will run either an exception is
	 * caught or not.
	 * 
	 * -The only way to stop finally block from running is to exit the program with
	 * System.exit(0);
	 * 
	 * -SWALLOWING AN EXCEPTION: -when there is more than one exception in a try
	 * catch block then only the last exception not handle will be thrown.
	 * 
	 * try-finally is valid but is not gonna handle any potential exception that may
	 * be thrown by the try block
	 * 
	 * Exception, RuntimeException, and Throwable classes belong to java.lang
	 * package that java compiler includes by default
	 * 
	 * IOException class and subclasses MUST call import from java.io
	 * 
	 * Checked exceptions CODE in try block Must throw the expected checked
	 * exception when catching a runtime exception
	 */

	public static void main(String[] args) {

		
		int[] arr = new int[4];
		Object o = new Object();

		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

//		try {
//			System.out.println(arr[4]); //if first line has error then the next line 
//			String s = (String)o;       //will not be reached because program will go to 
//		} catch (RuntimeException e) {  //the catch block
//			System.out.println(e.getMessage());
//		}

		System.out.println("\n****************************************************\n");

		/*
		 * IOException class and subclasses MUST call import from java.io
		 * 
		 * Checked exceptions CODE in try block Must throw the expected checked
		 * exception when catching a runtime exception
		 */

//		try {
//			System.out.println(arr[4]);
//		} catch (IOException e) { // <is not compiling because i'm trying to catch a checked exception that is not
//									// in the try block
//			System.out.println(e.getMessage());
//		}

		try {
			throw new FileNotFoundException(); // <-MUST call import from java.io.
		} catch (IOException e) { // <-MUST call import from java.io.
			System.out.println(e.getMessage());
		}

		// checked
		try {
			throw new InterruptedException(); // <-CODE in try block Must throw a InterruptedException for the catch
												// block to compile/ this example is explicitly throwing
												// the expected exception because i do not have a real life example on
												// hand
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		// runtime
		try {
			System.out.println("la"); // <-code in try block can have any code when catching a runtime exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n****************************************************\n");

		/*
		 * try-finally is valid but is not gonna handle any potential exception that may
		 * be thrown by the try block
		 */
//		try {
//			System.out.println(arr[4]);
//		} finally {
//			System.out.println("try-finally block");
//		}

		System.out.println("\n****************************************************\n");

		// NESTED TRY CATCH

//		try {
//			System.out.println(arr[4]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			try {
//				System.out.println(4 / 0);
//			} catch (ArithmeticException e) { // <-compile error duplicate parameter name
//				System.out.println(e.getMessage());
//			}
//			System.out.println(e.getMessage());
//		}

		System.out.println("\n****************************************************\n");

		/*
		 * multi catch block
		 */

//		try {
//			System.out.println(arr[4]); 
//			//String s = (String)o;
//		} catch (ClassCastException e) { 
//			System.out.println(e.getMessage());
//		} catch(IndexOutOfBoundsException r) {
//			System.out.println(r.getMessage());
//		}

		/*
		 * when we use a multi catch block we must catch from more specific exception to
		 * more general exception otherwise the code will not compile
		 */

//		String str = null;
//
//		try {
//			str.concat("concat");
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException");
//		} catch (RuntimeException e) {
//			e.getMessage();
//		} catch (Throwable e) {
//			e.getMessage();
//		} finally {
//			System.out.println("finally block is usually used to cleanup");
//		}

		System.out.println("\n****************************************************\n");

		/*
		 * FINALLY BLOCK-: -finally block is usually used to cleanup, -finally block
		 * will run either an exception is caught or not.
		 */

//		String str2 = null;
//
//		try {
//			System.out.println("this block doesn't  handle nullPointer Exception ");
//			str2.concat("concat");
//		} catch (ClassCastException e) {
//			e.getMessage();
//		} catch (ArithmeticException e) {
//			e.getMessage();
//		} finally {
//			System.out.println("finally block will run either an exception is caught or not");
//			System.out.println("if exception is not caught it will be thrown after finally block");
//		}

		System.out.println("\n****************************************************\n");

		/*
		 * The only way to stop finally block from running is to exit the program with
		 * System.exit(0); system.exit() -> will terminate the current program
		 */

//		String str3 = null;
//
//		try {
//			str3.concat("concat");
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException");
//			System.out.println("The only way  to stop finally block from run is to "
//					+ "exit the program with System.exit(0);");
//			System.exit(0);
//		} catch (RuntimeException e) {
//			e.getMessage();
//		} catch (Throwable e) {
//			e.getMessage();
//		} finally {
//			System.out.println("finally block is usually used to cleanup");
//		}

		System.out.println("\n****************************************************\n");

		/*
		 * SWALLOWING AN EXCEPTION: -when there is more than one exception in a try
		 * catch block then only the last exception not handle will be thrown.
		 */

		String str4 = null;
		int r = 0;

//		try {
//			str4.concat("concat"); //throws null pointer
//		} catch (NullPointerException e) {
//			System.out.println("catched NullPointerException");
//			r = 3 / 0; // <- this code is not handle hence it should throw an arithmetic exception but first program flow will
//						// go to finally block
//		} catch (ArithmeticException e) {
//			System.out.println("catched ArithmeticException");
//			System.out.println(arr[4]);
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("catched IndexOutrOfBoundException");
//			r = 4 / 0;
//		} finally {
//			System.out.println("reached finally block");
//			System.out.println(arr[4]); /*
//										 * once it reaches finally block if there is another code that throws an
//										 * exception that is not handle then the exception before the last one will be swallow and only the
//										 * last exception that is not handle will be thrown.
//										 */
//		}

//		try {
//			str4.concat("concat");
//		} catch (NullPointerException e) {
//			System.out.println("catched NullPointerException");
//			r = 3 / 0; // <- is not handle hence it should throw an arithmetic exception but first need
//						// to go to finally block
//		} catch (ArithmeticException e) {
//			System.out.println("catched ArithmeticException");
//			System.out.println(arr[4]);
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("catched IndexOutrOfBoundException");
//			r = 4 / 0;
//		} finally {
//			System.out.println("reached finally block");
//			try {
//				System.out.println(
//						arr[4]); /*
//									 * once it reaches finally block if there is another code that throws an
//									 * exception and is handle then the last exception not handle will be thrown.
//									 */
//			} catch (IndexOutOfBoundsException e) {
//				System.out.println("catched IndexOutrOfBoundException from finally block");
//			}
//		}

	}

}
