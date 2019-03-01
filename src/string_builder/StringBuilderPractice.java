 package string_builder;

import java.util.Collection;
import java.util.Collections;

public class StringBuilderPractice {

	public static void main (String[]  args) {
		
		sbPractice2();
		
		Collections s;

	}
	
	/*
	 * given a word
	 * String = ABCD12312ADF123ADFF12CCBB321
	 * Task1: using String Builder store only letters A, B, C
	 * then replace character from index 4 to 6 with ZZZ
	 */
	
	/*
	 * ASCII. Pronounced ask-ee, ASCII is the acronym for the American Standard Code for 
	 * Information Interchange. It is a code for representing 128 English characters as 
	 * numbers, with each letter assigned a number from 0 to 127. For example, the ASCII 
	 * code for uppercase M is 77.
	 */
	
	public static void sbPractice() {
		
		StringBuilder sb = new StringBuilder();
		String word = "ABCD12312ADF123ADFF12CCBB321";		
		System.out.println("Orinal String is: " + word);

		
		for (int i=0; i<word.length();i++) {
			if(word.charAt(i)>= 'A' && word.charAt(i)<='C') { //here my if condition is checking for the characters position in the ASCII table 
				sb.append(word.charAt(i));
			}
		}
		
		sb.replace(4, 7, "ZZZ");
		System.out.println("After usiing StringBuilder to replace charaters \nthe new word is: " +sb);
	}
	
	/*
	 * Given Sting AZVFTDDTDD
	 * using StringBiuilder delete first and last occurrence of D
	 * from whatever is left in sb object change the first occurrence of D to K
	 * insert "ictory" after letter "V"
	 * find out the character at index 4
	 */
	public static void sbPractice2() {

		String str = "AZVFTDDTDD";
		String name = "paloma";
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		sb.append(str);
		System.out.println(sb); //AZVFTDDTDD
		System.out.println(sb.deleteCharAt(sb.indexOf("D"))); //AZVFTDTDD
		System.out.println(sb.deleteCharAt(sb.lastIndexOf("D"))); //AZVFTDTD
		sb.setCharAt(sb.indexOf("D"), 'K');
		System.out.println(sb); //AZVFTKTD
		System.out.println(sb.insert(sb.indexOf("V")+1, "ictory")); //AZVictoryFTKTD
		System.out.println("The character at index 4 is: " + sb.charAt(4)); //The character at index 4 is: c

		System.out.println(sb2.append(name)); //paloma
		sb2.replace(sb2.indexOf("l"), sb2.length(), "ola"); 
		System.out.println(sb2); //paola
	}
	
	/*
	 * program will accept a String
	 * and checks if String is a palindrome
	 */
	
	public static void isPalindrome() {
		String str1= "ana", reversedWord = "";
		
		//using StringBuilder reverse method
		StringBuilder sb =  new StringBuilder();
		sb.append(str1);		
		System.out.println(sb.reverse().toString().equalsIgnoreCase(str1)); //true
		
		//creating my own method
		for(int i=str1.length()-1; i>=0; i--) {
			reversedWord += str1.charAt(i);
		}
		System.out.println(reversedWord.equals(str1));//true
	}
}



























