package var_args;

public class VarArgs1 {

	// varArg arguments can be accessed same way than you will do with an array
	
	/*
	 * we can have multiple data types in our varArgs method.
	 * RULES: 
	 * 1. varArgs argument should come last when specified
	 * 2. we can NOT have two or more varArs arguments in same method. compile error
	 * 3. dots should come after the data type and not before
	 */
	
	
	/**
	 * 
	 * @param args will take long values
	 * @print the sum of all the values
	 */

	public static void adding(long... args) {
		long nums = 0;
		for (long num : args) {
			nums += num;
		}
		System.out.println(nums);
	}

	// there will be a compile error (the adding methods will be underlined in red) if we have
	// varArgs long and a long array at the
	// same time. because they both do the same

//	public static void adding(long[] args) {
//		long nums = 0;
//		for (long num : args) {
//			nums += num;
//		}
//		System.out.println(nums);
//	}
	
//	public static void example(String str, ...int nums) { //<-   ...  should be specified after the data type and NOT before
//		
//	}
	
	
	
	

	public static void main(String[] args) {

		adding(); //0
		adding(3L, 5L, 7L); //15
		adding(3, 5, 7); //15
		adding(new long[] { 3L, 5L, 7L }); //15

//		adding(new int[] {3,5,7}); //<can NOT take array of other type than the specified
//		adding(new Long[] {3L,5L,7L}); //<can NOT take wrappers
//		adding(new Integer[] {3,5,7}); //<can NOT take wrappers

	}
}
