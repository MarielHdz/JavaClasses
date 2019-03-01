package inheritance_2;

/*
 * Access modifiers are only for class members like class fields, methods and constructors
 * can not have access modifiers: method arguments and local variables
 */

public class AccessModifiers { //<- outer classes can only be public, abstract and final.

	static private int privateItem = 5; //accessible only from the same class
	static int defaultItem = 6; // accessible from different classes in the same package
	static protected int protectedItem = 7; // accessible from sub-classes in different packages and in the same Project.
	static public int publicItem = 8; //accessible from different packages in the same Project
	
	public static void main(String[] args) {
		
		// All of the fields can be accessed inside of the same class
		System.out.println(privateItem);
		System.out.println(defaultItem);
		System.out.println(protectedItem);
		System.out.println(publicItem);

	}
}
