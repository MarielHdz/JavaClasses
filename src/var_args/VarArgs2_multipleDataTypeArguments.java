package var_args;

import java.util.Arrays;

public class VarArgs2_multipleDataTypeArguments {

	/*
	 * we can have multiple data types in our varArgs method.
	 * RULES: 
	 * 1. varArgs argument should come last when specified
	 * 2. we can NOT have two or more varArs arguments in same method. compile error
	 */


	//we can NOT have to varArs arguments in same method. compile error
//	public static void adding(int numbers, boolean... boo, long... args) {
//		long nums = 0;
//		for (long arg : args) {
//			nums += numbers + arg;
//		}
//		System.out.println(nums);
//	}
	
	// we can have multiple data types in our varArgs method.
	public static void adding(int numbers, long... args) {
		long nums = 0;
		for (long arg : args) {
			nums += numbers + arg;
		}
		System.out.println(nums);
	}
	
	public static void name(int currentYear, boolean affiliated, String... str) {
		String newSentence = "";
		for (String word : str) {
			newSentence += word + " ";
		}
		System.out.println(currentYear +" " + affiliated + " " + newSentence);
	}
	
	public static void main(String[] args) {
		adding(2,3,6); //3
		adding(2,3,6L);//3
		adding(2,3L,6L);//3
		//adding(2L,3,6); <-compile error first argument must be int
		name(2019, true, "paola","Mariel"); //2019 true paola Mariel 
	}
	
}
