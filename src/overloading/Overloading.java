package overloading;

public class Overloading {
	
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

	/*
	 * overloaded Calculator create 3 overloaded methods called add 1: int and
	 * return int -logic: add any number you pass to itself1 2: 2 parameters as
	 * double and float it will return nothing. logic: add 2 numbers and print
	 * result 3: have one int array as a parameter and return sum of array
	 */

	public Integer  method() {
		return null;
	}
	
	
	public int add(int num) {
		return num += num;
	}

	public void add(double num, float num2) {
		System.out.println(num + num2);
	}

	public int add(int[] num) {

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	

	public static void main(String[] args) {

		Overloading me = new Overloading();
		
		System.out.println(me.add(2));
		
		me.add(2.5, 2.5f);
		
		int [] nums = {1,2,3};
		System.out.println(me.add(nums));
	}
}
