package inheritance;

import inheritance_2.AccessModifiers;

public class AccessModifiers_4 {

	public static void main(String[] args) {

		/*
		 * Only public is accessible outside of the package.  
		 * Note:
		 * protected can be accessed from a sub-class outside the package.
		 */

//		System.out.println(AccessModifiers.privateItem); //compile error
//		System.out.println(AccessModifiers.defaultItem);//compile error
//		System.out.println(AccessModifiers.protectedItem); //compile error
		System.out.println(AccessModifiers.publicItem);
	}
}
