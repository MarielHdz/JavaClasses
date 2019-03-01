package string_class;

import java.util.ArrayList;

public class StringEquality {

	public static void main(String... args) {

		arrayEquality();
	}	
	
	public static void stringIsAnObject() {
		/*
		 * Any String is an object. we can create a String object by using new keyword
		 * String s4 = new String("Hello"); 
		 * or by using a literal String s1 = "Hello";
		 */

		String stringObjectUsingALiteral = "created String Object by using a literal"; //<-points to String Pool
		String StringObjectUsingNewKeyword = new String("created String Object by using new Keyword"); //<- points to the Heap

		String s1 = "Hello";
		String s2 = s1;
		System.out.println(s1 == s2); // true - because s2 is copying the reference (location) of s1 and pointing to
										// the same object

		String s3 = "Hello";
		System.out.println(s3 == s1); // true - s3 literal goes to the string pool and looks if there is a "Hello"
										// already there

		String s4 = new String("Hello");
		System.out.println(s1 == s4); // false - is pointing to a different object
		System.out.println(s1.equals(s4)); // true - this happens because String class has a equals method that compares content

		
		StringBuilder sb1 = new StringBuilder("Hello"); //<-StringBuilder object
		StringBuilder sb2 = new StringBuilder("Hello"); //<-StringBuilder object
		

		System.out.println(sb1 == sb2); // false <-they are 2 different StringBuilder objects
		System.out.println(sb1.equals(sb2)); //false  <-this happens because StringBuilder class does NOT have an equals method. When a class does not have an equals method java calls 
		//the equals method from the object class which only compares location (==)
		
		System.out.println(sb1.toString().equals(sb2.toString())); //true <-because i converted my StringBuilder objects to String and now I have
		//access to the equals() method from String class which compares content.		
	}
	
	public static void stringPoolBehavior() {
		
	/*
	 * When we have 2 string literals with same value then
	 * these literals point to the same object within the
	 *  String pool inside the Heap
	 */
	
	String str1 = new String("Java5");  //here we are creating a new object in the heap
	String str2 = "Java5";  //<-This is a String literal that will go to the String pool
	String str3 = new String("Java5");  //here we are creating a new object in the heap
	String str4 = "Java5";  //<-here str4 will go to the String pool and look if there is already a  java5 string there
	String str5 = new String("Java6");  //here we are creating a new object in the heap
	String str6 = "Java6";  //<-here str6 will go to the String pool and look if there is already a  java6 string there
	String str7 = "Ja"; //<-This is a String literal that will go to the String pool
	String str8 = "va6"; //<-This is a String literal that will go to the String pool
	
	/*
	 * equals->  checks alphabetical order
	 */
	
	System.out.println(str2.equals(str1));  //true
	System.out.println(str1.equals(str3));  //true
	System.out.println(str2.equals(str4));  //true
	System.out.println(str2.equals(str5));  //false
	System.out.println(str1.equals(str5));  //false
	System.out.println(str2.equals(str6));  //false

	/*
	 * ==  checks if the objects are pointing to the same location
	 */
	System.out.println(str2 == str1);  //false
	System.out.println(str1 == str3);  //false
	System.out.println(str2 == str4);  //true
	System.out.println(str2 == str5);  //false
	System.out.println(str1 == str5);  //false
	System.out.println(str2 == str6);  //false


	/*
	 * String literals are formed when you create a String variable and assign a value eg. String str6 = "Java6";
	 * In the following example:
	 * str7+str8 is not a String literal. It is a new object in the heap.
	 * "Java" + "6"   -> Java6 String is created 
	 */
	System.out.println(str6==str7+str8); // false
	System.out.println(str6.equals(str7+str8)); // true
	System.out.println(str6=="Java" + "6"); // true

	}
	
	public static void arrayEquality() {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(22);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(22);
		
		System.out.println(arr1.equals(arr2)); //true <-because ArrayList class has its own equals() method that compares content
	}
}
