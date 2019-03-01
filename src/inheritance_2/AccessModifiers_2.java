package inheritance_2;

public class AccessModifiers_2 {

	public static void main(String[] args) {

		/*
		 * All of the fields except private can be accessed outside of the same class
		 * and in the same package
		 */
		
//		System.out.println(AccessModifiers.privateItem); //compile error
		System.out.println(AccessModifiers.defaultItem);
		System.out.println(AccessModifiers.protectedItem);
		System.out.println(AccessModifiers.publicItem);
	}
}
