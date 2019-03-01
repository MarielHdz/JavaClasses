package staticMembers;

public class Static1_ {

	static String species;
	String name;
	int age;
	

	/* 
	 * you can access anything inside instance method	 * 
	 */
	
	void instanceMethod1() {
		Static1_.staticMethod1();
		staticMethod2();
		//Static1_.instanceMethod2(); //non-static method can not be called in a static way
	}
	
	/* 
	 * only static members can access static methods
	 */
	static void staticMethod1() {
		staticMethod1();
		Static1_.staticMethod1();
//		instanceMethod1(); //can not make a non-static reference to a non-static method
//		Static1_.instanceMethod1(); //can not make a non-static reference to a non-static method
	}

	 void instanceMethod2() {
		instanceMethod1();
		staticMethod1();
		//Static1_.instanceMethod1();  //non-static method can not be called in a static way
	}
	
	static void staticMethod2() {
		
	}
}
