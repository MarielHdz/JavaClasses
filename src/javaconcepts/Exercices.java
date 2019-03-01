package javaconcepts;

import java.util.Scanner;

public class Exercices {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		getDigits(45634564);

	}
	
	/*
	 * Count the number of digits in a number
	 * then print each digit 
	 * 		//explanation of my getDigits(int num) method:
	 * 		//Integer.valueOf(num).toString() method is needed to access length method from the String class
	 * 		//String.valueOf(num) method is used to parse my int num to a String and use the chartAt() method 
	 * 		//within the Character.digit() method
	 * 		//chartAt(int index) method get the char value at the specified index 
			//Character.digit(char ch, int radix) -> returns the numeric value of the character in the specified radix 
			//in this case I chose radix 10.
			//you will get different answers depending on whether the radix (base) is binary (2), decimal (10), 
			//octal (8), hex (16), or any other base.
	 */
	
	public static void getDigits(int num) {
		int length = Integer.valueOf(num).toString().length(); 
		String number = String.valueOf(num); 
		
		System.out.println("The number " + num + " has " + length + " digits.");
		
		for (int i = 0; i < length; i++) {
			int j = Character.digit(number.charAt(i), 10);
			System.out.println(j);
		}
	}
	
	/*
	 * Read a one-line sentence input from the keyboard
	 * set int sentenceLength to the length of the sentence
	 * if the sentenceLength is an even number && sentence ends with a ?
	 * then print "Yes"
	 * if the sentenceLength is not an even number && sentence ends with a ?
	 * then print "No"
	 * if the sentence ends with a !
	 * then print "Wow"
	 * In all other cases display the word "you always say followed by the
	 * input string followed by quotes
	 */
	
	public static void findingMarks() {

		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		int sentenceLength = sentence.length();
		sentence = sentence.trim();
		
		if(sentenceLength % 2 == 0 && sentence.substring(sentence.length() - 1).equals("?")) {
			System.out.println("Yes");
		}else if(sentenceLength % 2 != 0 && sentence.substring(sentence.length() - 1).equals("?")) {
			System.out.println("No");			
		}else if(sentence.substring(sentence.length() - 1).equals("!")) {
			System.out.println("Wow");
		}else {
			System.out.println("You always say " + "\"" + sentence + "\"");
		}
	}
	
	
	/*
	 * write a program that reads 3 non negative int from the keyboard
	 * display the integers in increasing order
	 */
	
	public static void increasingOrder() {
		
		int num1, num2, num3;
		System.out.println("Enter 3 numbers separated by a space: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int temp;
		
		if(num2 < num1) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		if(num3 < num2) {
			temp = num3;
			num3 = num2;
			num2 = num3;
		}
		
		if(num2 < num1) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

	/*
	 * Write a program that tests whether one number is divisible by another number.
	 */

	public static void isDivisible() {
		System.out.println("Enter 2 positive numbers one after another separeted by a space");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		if (number1 % number2 == 0) {
			System.out.println(number1 + " is divisible by " + number2);
		} else {
			System.out.println(number1 + " is not divisible by " + number2);
		}
	}

	/*
	 * Write a program that determines the change to be dispensed from a vending
	 * machine. An item machine can cost between 25 cents and a dollar in 5 cent
	 * increments. And the machine only accepts a single dollar bill to pay for the
	 * item.
	 */

	public static void changeFromVendingMachine() {

		System.out.println("Enter price of item");
		int itemPrice = 0;
		itemPrice = sc.nextInt();
		while (itemPrice % 5 != 0 || itemPrice > 100 || itemPrice < 0) {
			System.out.println("Enter a quantiity in 5-cents increment.");
			itemPrice = sc.nextInt();
		}

		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		int changeCount = 100 - itemPrice;
		int change = changeCount;

		quarter = changeCount / 25;
		changeCount = changeCount % 25;
		dime = changeCount / 10;
		changeCount = changeCount % 10;
		nickel = changeCount / 5;
		changeCount = changeCount % 5;
		penny = changeCount;

		System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar, so your change is "
				+ change + " cents: ");
		System.out.println(quarter + " quarters.");
		System.out.println(dime + " dimes.");
		System.out.println(nickel + " nickels.");
		System.out.println(penny + " pennies.");
	}

	/*
	 * write a program that will read a line of text as input and then display the
	 * line with the first word moved to the end of the line
	 */

	public static void changeWordsOrder() {

		System.out.println("what is Java?");
		String s = sc.nextLine();
		String input = s;
		String a[] = input.split(" ");
		String word1 = a[0].toString();
		String word2 = a[1].toString();
		int indexWord2 = input.indexOf(word2);
		int indexToCompletSentence = indexWord2 + word2.length();
		String sentence = input.substring(indexToCompletSentence);
		System.out.println(word2 + sentence + " " + word1);
	}

	/*
	 * Write a program that asks the user to give a yes-or-no response. if the
	 * response is yes or y or Yes or Y set the boolean variable accept to true
	 */

	public static void yesNoQuestion() {

		System.out.println("Do you like fish?");
		String answer = sc.nextLine();
		boolean accept = false;
		String y = "y";
		String yes = "yes";
		if (answer.toLowerCase().equals(y) | answer.toLowerCase().equals(yes)) {
			accept = true;
		} else {
			accept = false;
		}
		System.out.println(accept);

	}

	/*
	 * Write statements that can be used in a Java program to read two integers and
	 * display the number of integers that lie between them, including the integers
	 * themselves. For example, four integers are between 3 and 6: 3, 4, 5, and 6.
	 */

	public static void itegersInBetween() {

		System.out.println("Enter first random number ");
		int int1 = sc.nextInt();
		System.out.println("Enter second random number ");
		int int2 = sc.nextInt();

		if (int1 > int2) {
			while (int1 > int2) {
				System.out.print(int2++ + ",");
				if (int1 == int2) {
					System.out.print(int1);
				}
			}
		} else {
			while (int1 < int2) {
				System.out.print(int1++ + ",");
				if (int1 == int2) {
					System.out.print(int2);
				}
			}
		}
	}
}
