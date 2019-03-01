package staticMembers;

public class Static4_MethodsRunner {

	public static void main(String[] args) {

		/*
		 * differences between a static method and a non-Static method		 * 
		 */
		
		Static4_Methods.staticMethod(); //can call a static method directly by using the class name.
		//Static_Methods.nonStaticMethod(); // compile error: Cannot make a static reference to a non-static method.
		
		
		Static4_Methods sm = new Static4_Methods(); 
		sm.staticMethod();  //possible but not recommended. • Can create an instance of the class to call a static method. 
		sm.nonStaticMethod(); //• must create an instance of the class to call a non-static method. 

		
		Static4_Methods nullInstance = null; //< created an empty object
		nullInstance.staticMethod(); //will perform action because it does not depend of the object //not recomended to call static method like this
		nullInstance.nonStaticMethod(); //throws a null pointer exception because is pointing to an empty object		
	
		}
}
