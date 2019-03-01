package var_args;

import overloading.Overloading;

public class VarArgs3_Objects {

	public static void add(Object... args) {
		Object items = 0;
		for (Object item : args) {
			items = item;
		}
		System.out.println(items);
	}
	
	public static void multipleArgs(int num, boolean boo, Object... args) {

		System.out.println("do something");
	}

	public static void main(String[] args) {
		VarArgs1 va = new VarArgs1();
		VarArgs1 va2 = new VarArgs1();
		Overloading zo = new Overloading();
		VarArgs2_multipleDataTypeArguments mp = new VarArgs2_multipleDataTypeArguments();
		VarArgs2_multipleDataTypeArguments mp2 = new VarArgs2_multipleDataTypeArguments();

		//We can pass everything to a varArg of type Object
		add(42L, 5L, 10L, 2L);
		add(42, 5, 10, 2, 3, 15);
		add('s', 'd', 'c', 'o');
		add("pao", "Juan", "Nena");
		add(2.3, 3.7);
		add(2.3f, 3.7f);
		add(va, zo, va2);
		add(va, va2);

		add(new VarArgs2_multipleDataTypeArguments[] { mp, mp2 });
		add(new int[] { 2, 4, 6 });
		add(new long[] { 2L, 4L, 6L });
		add(new char[] { 's', 'd', 'c', 'o' });
		
		multipleArgs(2,false,zo);
		//multipleArgs(false,2,zo); //<-we need to respect the order of the arguments to avoid compile error

	}
}
