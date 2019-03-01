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

public class LocalStudent extends Student {

	/*
	 * 1. When we hide a field then the field from super class is completely
	 * invisible. therefore we can change anting we need to change. besides int
	 * semester can also be double, short or object eg. double semester = 3; 2. the
	 * only way to call the hidden field from super class is by using the super
	 * keyword. 3. when trying to access a field then the closest one is the one
	 * that will be called.
	 */
	short semester = 3; // field hiding
	private int seatId; // we can NOT hide a private field because hide concept is related to
						// inheritance and only
						// visible members can be inherited.
	public final double room = 4;

	public void testingFieldHiding() {
		System.out.println(semester); // 3
		System.out.println(this.semester); // 3
		System.out.println(super.semester); // 2
	}

	public LocalStudent() {
		super("Unknown", -1);
	}

	public LocalStudent(String name, int studentId, int seatId) {

		super(name, studentId);
		this.seatId = seatId;
	}

	@Override
	public void attendClass() {
		System.out.println("attending class method from LocalStudent sub-class");
		super.attendClass(); // if we are calling the overridden method we must use super keyword otherwise
								// we will get stackOverFlow error

		/*
		 * for any other visible member in super class we can call them by
		 * name||this.||super keyword
		 */
		// makingFriends();
		// this.makingFriends();
		super.makingFriends();
	}

//	@Override
//	public short othrExamle() { //We can NOT change return type. eg. from int to short
//		return 16;
//	}

	@Override
	public int othrExamle() {
		return (short) 16; // we can return a smaller data Type: eg. int can return short
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod from LocalStudent sub-class");
	}

	/*
	 * 1. We can NOT use the tag @Override with static methods because we can not
	 * override static methods. 2. We can hide static methods. 3. We MUST add static
	 * to it for it to compile (because static method can not override non-static
	 * method and vice versa).
	 */
	public static void staticMethod() {
		System.out.println("do something different");
	}

	/*
	 * we can NOT override private methods because they are not visible to our class
	 * but we can copy paste them without using @Override tag and code will compile
	 */
	private void privateMethod() {
		System.out.println("private method from subClass");
	}

//	private int privateMethod() {  //<- we can reuse the method name and change anything we want because the one from parent is not visible to us
//		System.out.println("private method from subClass");
//		return 1;
//	}

	public static void main(String[] args) {
		LocalStudent ls3 = new LocalStudent("Juan", 2, 22);
		/*
		 * when trying to access a field then the closest one is the one that will be
		 * called.
		 * 
		 */
		ls3.testingFieldHidingMethodInSuperClass(); // 2
	}
}
