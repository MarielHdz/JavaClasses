package var_args;

import overloading.Overloading;

public class VarArgs3_Objects2Ambiguity {

	/**
	 * 
	 * @param args will take long values
	 * @print the sum of all the values
	 */
	public static void add(long... args) {
		long nums = 0;
		for (long num : args) {
			nums += num;
		}
		System.out.println(nums);
	}
	
	
	//BE CAREFUL when using varArgs object because may cause ambiguity when overloading
	//as explained below


	public static void add(Object... args) {
		Object items = 0;
		for (Object item : args) {
			items = item;
		}
		System.out.println(items);
	}

	public static void main(String[] args) {

//		add(42L, 5L, 10L, 2L); // <-compile error because if we have varArgs long method at the same time than
//								// varArgs object method then both can perform the task and compiler does not
//								// know which one to use
//
//		add(42, 5, 10, 2); // <- same from the above happens here because long method could take ints the
//									// same than object so there is ambiguity
//
//		add('s', 'd', 'c', 'o'); // <- same from the above happens here because long method could take chars the
//									// same than object so there is ambiguity. //short, int, long , float, double
//									// can take chars

		VarArgs1 va = new VarArgs1();
		VarArgs1 va2 = new VarArgs1();
		Overloading zo = new Overloading();
		VarArgs2_multipleDataTypeArguments mp = new VarArgs2_multipleDataTypeArguments();
		VarArgs2_multipleDataTypeArguments mp2 = new VarArgs2_multipleDataTypeArguments();

		//We can pass everything to a varArg of type Object just make sure to check for ambiguity
		add("pao", "Juan", "Nena");
		add(2.3, 3.7);
		add(2.3f, 3.7f);
		add(va, zo, va2);
		add(false, true, false);

		// array is an object so we can pass ints, longs and chars without causing
		// ambiguity
		add(new int[] { 2, 4, 6 });
		add(new long[] { 2L, 4L, 6L });
		add(new char[] { 's', 'd', 'c', 'o' });
		add(new VarArgs2_multipleDataTypeArguments[] { mp, mp2});

	}
}
