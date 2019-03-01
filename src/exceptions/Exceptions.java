package exceptions;

public class Exceptions {

	/*
	 * A StackOverflowError occurs when a program recurses too deeply into an
	 * infinite loop. It is considered an error because the JVM often runs out of
	 * memory and cannot recover.
	 * 
	 * A NullPointerException occurs when an instance method or variable on a null
	 * reference is used.
	 * 
	 * A NoClassDefFoundError occurs when code available at compile time is not
	 * available at runtime.
	 * 
	 * A ClassCastException occurs when an object is cast to an incompatible
	 * reference type.
	 * 
	 * IllegalArgumentException occurs when invalid parameters are sent to a method.
	 */
	public static void main(String[] args) {

		// RUNTIME EXCEPTION/UNCHECKED EXCEPTION

//		System.out.println(8/0);//Arithmetic Exception: we can not divide by zero in java

//		int[] arr = new int[4];
//		System.out.println(arr[4]);//ArrayIndexOutOfBoundsException

//		Object o = new Object();
//		String s = (String)o; //ClassCastException

		// COMPILE TIME EXCEPTION/ CHECKED EXCEPTION

//		Thread.sleep(2000); //<-this code throws InterruptedException if it is not handle

		System.out.println(0/6);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
