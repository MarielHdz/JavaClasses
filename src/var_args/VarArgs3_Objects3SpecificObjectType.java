package var_args;

import overloading.Overloading;

public class VarArgs3_Objects3SpecificObjectType {
	// when passing a specific object
	public static void add(Overloading b, VarArgs1... args) {
		System.out.println("Calling method");
	}

	public static void main(String[] args) {
		VarArgs1 va = new VarArgs1();
		VarArgs1 va2 = new VarArgs1();
		Overloading zo = new Overloading();

		add(zo, va, va2);
		// add(va, zo, va2); //<-respect order the argument to avoid compile error

		// because is a specific object it will only accept a specific data
//	add("pao", "Juan", "Nena");
//	add(2.3, 3.7);
//	add(2.3f, 3.7f);

		// we can only pass arrays of the same object type
		
		add(zo, new VarArgs1[] { va, va2 });

//		add(new Object[] { zo, va, va2 });
//		add(new int[] { 2, 4, 6 });
//		add(new long[] { 2L, 4L, 6L });
//		add(new char[] { 's', 'd', 'c', 'o' });
	}
}
