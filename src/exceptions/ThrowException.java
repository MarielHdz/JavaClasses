package exceptions;

import java.io.FileNotFoundException;

public class ThrowException {

	public static void main(String[] args) {

		System.out.println(reverse("Juan"));
		System.out.println(reverse(null));

//		reverse2(null); /*
//						 * <-when throwing a run time exception the code will compile even if exception
//						 * is not handle. then it will throw the exception.
//						 */

		try {
			System.out.println(reverse2(null));
		} catch (NullPointerException e) { // <-we can handle with a catch block
			System.out.println("catched NullPointerException");
		}

		//System.out.println(reverse2(null)); // it will compile if we do not handle but will throw NullPointerException

//		System.out.println(reverse3(null)); //<- must be handle

		try {
			playWithBoth();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("catched FileNotFoundException");
			} else {
				System.out.println("catched ClassNotFoundException");
			}
		}

		System.out.println("end of program");
	}

	public static void playWithBoth() throws FileNotFoundException, ClassNotFoundException {
		playWithClass();
		playWithFile();
	}

	public static void playWithClass() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

	public static void playWithFile() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static String reverse3(String word) throws Exception {
		String reversedWord = "";

		if (word == null) {
			reversedWord = "0";
			throw new NullPointerException();
		} else {
			StringBuilder sb = new StringBuilder(word);
			reversedWord = sb.reverse().toString();
		}
		return reversedWord;
	}

	public static String reverse2(String word) throws NullPointerException {
		String reversedWord = "";

		if (word == null) {
			reversedWord = "0";
			throw new NullPointerException();
		} else {
			StringBuilder sb = new StringBuilder(word);
			reversedWord = sb.reverse().toString();
		}
		return reversedWord;
	}

	/*
	 * create a method called reverse take one String as a parameter return reverse
	 * String
	 * 
	 * inside method first check whether the argument passes is null if it is null
	 * programmatically throw a NullPointerException reverse the String and return
	 * it from the method put the code in a try catch block call your method with
	 * valid String and null 2 times
	 */

	public static String reverse(String word) {
		String reversedWord = "";

		try {
			if (word == null) {
				throw new NullPointerException();
			} else {
				StringBuilder sb = new StringBuilder(word);
				reversedWord = sb.reverse().toString();
			}
		} catch (NullPointerException e) {
			reversedWord = "0";
		}
		return reversedWord;
	}
}
