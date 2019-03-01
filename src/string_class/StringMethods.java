package string_class;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
	
	static Scanner sc = new Scanner(System.in);

	public static void main (String[] arguments) {
		
		countWords();
		
	}	

	
	public static void replaceMethod() {
		
		String wrongStatement = "String is not immutabli";
		String rightStatement = "";
		
		rightStatement = wrongStatement.replace("not", "");
		rightStatement = rightStatement.replace("immutabli", "IMMUTABLE").toUpperCase();

		System.out.println(rightStatement);
	}
	
	public static void arrayCharToString() {
				
		char[] arr = new char[] {'P', 'a', 'o', 'l', 'a'};
		
		String str = new String(arr);
		System.out.println(str); //Paola
	}
	
	public static void stringToCharArray() {
		
		String s1 = "Paola";
		
		char[] arr = s1.toCharArray();
		System.out.println(Arrays.toString(arr)); //[P, a, o, l, a]
		
		String str = new String(arr);
		System.out.println(str); //Paola
	}
	
	public static void startsAndEndsWithMethods() {
		
		String s1 = "Paola";		

		boolean startsWith = s1.startsWith("P");
		boolean endsWith = s1.endsWith("a");
		
		System.out.println(s1 + " starts with P " + startsWith); //Paola starts with P true
		System.out.println(s1 + " ends with a " + endsWith); //Paola ends with a true

	}
	
	//Count the number of words in a text by using trim and split
	public static void  countWords () {
		String str = "  Today I learned  Java For   Each Loop. ";
		//2 spaces at the beggining.
		//2 spaces after learned
		//3 spaces after For
		// 1 space at the ended
		// the rest is separated by one space
		
		String[] wordsArray1 = str.split(" "); //splits by spaces
		//"--Today-I-learned--Java-For---Each-Loop.-"
		// 12  3   4   5     6  7   8 910 11   12
		
		String[] wordsArray2 = str.trim().split(" "); //trim the beggining and the end of a sentence and then split the sentence by space
		//"--Today-I-learned--Java-For---Each-Loop.-"
		//     1   2   3     4  5   6  78  9   10
		
		String[] wordsArray3 = str.split("\\s+"); //split by one or more spaces
		//"--Today-I-learned--Java-For---Each-Loop.-"
		// 1   2   3    4       5   6      7   8
		
		String[] wordsArray4 = str.trim().split("\\s+"); //trim the beggining and the end of a sentence and then split the sentence by one or more spaces
		//"--Today-I-learned--Java-For---Each-Loop.-"
		//     1   2    3       4   5      6   7
		
		String[] wordsArray5 = str.trim().split(" +"); //trim beggining and end of sentence and then split by one or more spaces
		//"--Today-I-learned--Java-For---Each-Loop.-"
		//     1   2    3       4   5      6   7		
		
		System.out.println("The used method divided the String in: " + wordsArray1.length + " parts."); //The used method divided the String in: 12 parts.
		System.out.println("The used method divided the String in: " + wordsArray2.length + " parts."); //The used method divided the String in: 10 parts.
		System.out.println("The used method divided the String in: " + wordsArray3.length + " parts."); //The used method divided the String in: 8  parts.
		System.out.println("The used method divided the String in: " + wordsArray4.length + " parts."); //The used method divided the String in: 7  parts.
		System.out.println("The used method divided the String in: " + wordsArray5.length + " parts."); //The used method divided the String in: 7  parts.

		/*
		 * when we have more the one space between words we can use the replaceAll() method to fix that
		 */
		String expected = " My   expected  String ";
		System.out.println(expected.replaceAll("\\s+"," ").trim()); //My expected String
		
		
		int count = 0;
		
		for(String word : wordsArray5) {
			count = word.length();
			System.out.println(word + " have " + count + " characters.");
		}
	}
	
	/*
	 * Count characters from a string
	 */
	
	public static void countCharactersInAString() {
		String word = "CyberTek";
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			String find = String.valueOf(word.charAt(i));
			if(find.equalsIgnoreCase("e")) {
				count++;
			}
		}
		System.out.println(word + " contains " + count + " letters e/E");
	}
	
	/*
	 * Change string "Nice Day" to "NicE DaY"
	 */
	public static void niceDay() {
		String niceDay = "Nice Day";
		char[] arr = niceDay.toCharArray();
		int length = niceDay.length();
		String letter; 
		for(char ch : arr ) {
			letter=String.valueOf(ch);
			if (letter.equals("e") || letter.equals("y")) {
				System.out.print(letter.toUpperCase());
			}else {
				System.out.print(ch);
			}
		}
		System.out.println();
		//or
		int substringOfE = niceDay.indexOf("e", 1);
		int substringOfY = niceDay.indexOf("y", 1);
		
		String sentencePart1 = niceDay.substring(0, substringOfE);
		String sentencePart2 = niceDay.substring(substringOfE, substringOfE+1).toUpperCase();
		String sentencePart3 = niceDay.substring(substringOfE + 1, substringOfY);
		String sentencePart4 = niceDay.substring(substringOfY, substringOfY+1).toUpperCase();
		
		System.out.println(sentencePart1 + sentencePart2 + sentencePart3 + sentencePart4);
		
		//or
		
		System.out.println(niceDay.replace('e', 'E').replace('y', 'Y'));
	}
	
	/*
	 * To compare Strings we should use compareTo method. 
	 * compareTo compares the lexicograph ordering of the two strings and returns
	 * -A negative number if s1 comes before s2
	 * -Zero if the two strings are equal
	 * -A positive number if s1 comes after s2
	 * --Remember: capitals come before lowercase
	 */
	
	public static void compareLexicograpicOrder() {
		
		String s1 = "Paola";
		String s2 = "paola";
		
		if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " comes before " + s2);
		}else if (s1.compareTo(s2) > 0) {
			System.out.println(s1 + " comes after " + s2);
		}else if (s1.compareTo(s2) == 0) {
			System.out.println(s1 + " is equals to " + s2);
		}//Paola comes before paola
	}
	
	/*
	 * Write a program that read 3 strings from the keyboard in no particular order 
	 * and display the string that would be second in lexicographical order
	 */
	
	public static void compareLexicograpicOrder2() {
		String s1, s2, s3, temp;
		System.out.println("Enter 3 words separated by enter");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		temp = "";
		
		if(s2.compareTo(s1) < 0 ) { //A negative number come if s2 comes before s1 based in lexicographical order
			temp = s2;
			s2 = s1;
			s1 = temp;
		}
		if (s3.compareTo(s2) < 0) {
			temp = s3;
			s3 = s2;
			s2 = temp;
		}
		
		if(s2.compareTo(s1) < 0) {
			temp = s2;
			s2 = s1;
			s1 = temp;
		}
		
		System.out.println(s2);

	}
	
	/*
	 * Remember: capitals come before lowercase if I want to 
	 * compare alphabetical order instead of lexicograph order 
	 * then convert strings to upper or lowecase with toLowerCase() or toUpperCase()
	 * also you can use compareToIgnoreCase() method 
	 * */
	
	public static void compareAlphabeticalOrder() {
		
		String s1 = "Paola";
		String s2 = "paola";
		
		if (s1.compareToIgnoreCase(s2) < 0) {
			System.out.println(s1 + " comes before " + s2);
		}else if (s1.compareToIgnoreCase(s2) > 0) {
			System.out.println(s1 + " comes after " + s2);
		}else if (s1.compareToIgnoreCase(s2) == 0) {
			System.out.println(s1 + " is equals to " + s2);
		}//Paola is equals to paola
	}
}
