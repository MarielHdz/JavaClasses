package overriding;

/*
 * 	--Override is when we  give a different implementation to a method inherited from super class.
 *  1. We can only override if there is a inheritance relationship. (when overloading we do not need inheritance relationship)
	2. To override, the overriding method must have same method signature (name and parameters) than the overridden method
	3. We can only override what is visible in super class. eg. if I have a private method in super class then this 
		method is only visible in the same class therefore it can NOT be inherited.
	4. The overriding method must be same or  more visible that the overridden method from super class. 
		public --> protected --> default --> private
	5. The method in child class must have same or co-variant return type. 
	   *for primitive type: has to be the same return type. 
	   *for reference type: can be co-variant type:
	   	 -eg: a method that return a person can be	overridden as a method that return student since student is a Person.
	6. To specify an overriding method is recommended to use: @Override annotation
	7. We can reuse the functionality of the overridden super method and then add something extra when overriding. 
		This can happen by using super.overriddenMethodFromSuperClass .
	8. We can NOT override static methods:
	 	a. we can only hide them.
	 	b. We can NOT use the tag @Override with static methods. 
	 	c. when we hide a static method We MUST add static to it for it to compile (because static method can not override a
	 		non-static method and vice versa).
 	9. We can Not override fields instead we can hide them:
 	 	a. When we hide a field then the field from super class is completely invisible.
	  	  therefore we can change anything we need to change.
	 	  in a sub-class the field semester besides being an int can also be double, short or object
	      eg. double semester = 3; 
	    b. the only way to call a hidden field from super class is by using the super keyword.
	    c. when trying to access a field then the closest one is the one that will be called.
	10. We can NOT override private methods because they are not visible to our class so when we extend another class we 
		do not get the parent private members but we can copy paste them without using @Override tag and code will compile.
 */

/*
 * 1) Parent class constructor runs before child class constructor 
 * 2) Depending of the object the last Overridden version of a method will always be call.
 */

public class Student { //<-this is the parent class of LocalStudent

	/*
	 * 1. When we hide a field then the field from super class is completely invisible.
	  	  therefore we can change anything we need to change.
	 	  in a sub-class the field semester besides being an int can also be double, short or object
	      eg. double semester = 3; 
	   2. the only way to call a hidden field from super class is by using the super keyword.
	   3. when trying to access a field then the closest one is the one that will be called.
	 */
	int semester = 2;
	private String name;
	private int studentId;
	public final double room = 2;
	
	public void testingFieldHidingMethodInSuperClass() {
		System.out.println(semester);
	}

	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
		myMethod();
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void attendClass() {
		System.out.println("attending class method from Student parent class");		
	}
	
	public void makingFriends() {
		System.out.println("Making friends in the class");		
	}
	
	public int othrExamle() {
		return 10;
	}
	
	public void myMethod() {
		System.out.println("myMethod from Student super class");
	}
	
	/*
	 * 1. We can NOT use the tag @Override with static methods because we can not override static methods.
	 * 2. We can hide static methods
	 */
	public static void staticMethod() {
		System.out.println("static method");
	}
	
	/*
	 * we can NOT override private methods because they are not visible to our class
	 * but we can copy paste them without using @Override tag and code will compile
	 */
	private void privateMethod() {
		System.out.println("private method form parent");
	}
}
