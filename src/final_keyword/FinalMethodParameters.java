package final_keyword;

public class FinalMethodParameters {

	public static void add(final int num) {
		//we can not reassign a new value to the method parameter
		//num = 7; //<- compile error
		System.out.println("int add method" + num);
	}
}
