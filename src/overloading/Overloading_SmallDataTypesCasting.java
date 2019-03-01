package overloading;

/*
 * 	1. Should have same method name
	2. Different number of parameters or different type of each parameters
		A. Exact data type
		B. Larger data type
		C. Wrapper type
		D. Object
		E. varArg
	3. Return data type can be different
 */

public class Overloading_SmallDataTypesCasting {

	public static void method1(byte b) {
		System.out.println("calling byte method");
	}

	public static short anotherMethod(int number) {
		System.out.println("calling int method that returns short");
		return (short) number; // <- we need to cast number because we need to return a short
	}

	public static void add(Long item) {
		System.out.println("calling Long wrapper Object method");
	}

	public static void main(String[] args) {
		// method1(7); //<- has compile error because all whole numbers in java are int
		// unless explicitly specified
		method1((byte) 7); // casting is a good solution to this issue

		short val = anotherMethod(12);// <- method takes an int but returns a short that is why can be assigned to a
										// short variable
		int val2 = anotherMethod(12);// <- can also be assigned to int variable because is greater than short

		//add(Integer.valueOf(123)); //<- we can not convert from one wrapper type to another wrapper type in one step
		//add(123); // <- compile error because all whole numbers in java are int unless explicitly
					// specified and Long wrapper can not auto-box an int. In the background what needs to
					// happen is int need to be promoted to long and then long need to be
					// auto-boxed into Long wrapper class but compiler can not do that all that by itself
		
		//the solution for the above issue is to enter the value specifying the long type
		add(123L);
		add(new Long(123));
		add(new Long("123"));
		/*
		 * X.valueOf returns a wrapper object.
		 * X.parseX returns a primitive value
		 */
		add(Long.valueOf(123));


	}

}
