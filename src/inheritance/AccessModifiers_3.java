package inheritance;

import inheritance_2.AccessModifiers;

public class AccessModifiers_3 extends AccessModifiers {

	public static void main(String[] args) {

		/*
		 * Only protected and public are accessible outside of the package. protected is
		 * accessible only if it is called from a sub-class. I do not need the class name to call
		 * my static fields because I am extending from parent class
		 */

//		System.out.println(privateItem); //compile error
//		System.out.println(defaultItem);//compile error
		System.out.println(protectedItem); 
		System.out.println(publicItem);
	}
}
