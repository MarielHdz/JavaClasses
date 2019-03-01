package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args){
		labeling();
		



	}
	
	
	/*
	 * create Array of String which has 5 names
	 * loop through each item 
	 * inside the loop get the char Array of each String using a String method
	 * loop through each character in that char array
	 */
	public static void warmUp() {
		
		String[] names = {"Alan", "Leno", "Karl", "Fab", "Gabo"}; 
		
		for (String name : names) {
			char[] chArr = name.toCharArray();
			for(char ch : chArr) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void warmUp2() {
		
		String[] names = {"Omar", "Loma", "Karl", "Fab", "pololo"}; 
		
		//print all characters except o
		for (String name : names) {
			char[] chArr = name.toCharArray();
			for(char ch : chArr) {
				if(ch=='o' || ch=='O') {
					continue;
				}
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Usually when we use break in a loop this break the closest loop. 
	 * when we have more than one loop and we need to break in a different loop than the closest 
	 * we can use a label
	 * continue = will ignore whatever mentioned in  the specified condition and then continue in the closes loop
	 * break = will take you out of the closes loop
	 * continue/break + label = will continue/brake the loop and then go to the specified loop
	 */
	public static void labeling() {
		
		String[] names = {"Luna", "Omar", "Loma", "Karl", "Fab", "pololo"}; 
		
		OUTERLOOP:
			for (String name : names) {
			char[] chArr = name.toCharArray();
			for(char ch : chArr) {
				if(ch=='o' || ch=='O') {
//					continue;        // L u n a   ...m a r   ...L m a   ...K a r l   ...F a b   ...p l l   ...
//					break;           // L u n a   ...  ...L   ...K a r l   ...F a b   ...p   ...
					break OUTERLOOP; // L u n a   ...
				}
				System.out.print(ch + " ");
			}
			System.out.print("  ...");
		}
	}
	
	/*
	 * Continue the outer loop whenever you see a letter "h"
	 * do not print words with letter h
	 */
	public static void continueOuterLoop() {
		
		String[] names = {"HLuna", "Aloha", "Loma", "Homer", "Fab", "leeh"}; 

		OUTERLOOP:
		for(String name : names) {			
			for(char ch : name.toCharArray()) {
				if(ch =='h' || ch == 'H') {
					continue OUTERLOOP;
				}
			}
			System.out.print(name + " "); //Loma Fab 
		}
	}
	

	public static void howManyLettersInANamer() {

	}
	
	// get words that contains letter a and print how many a's there are per word
	public static void howManyLettersInAName() {
		String[] fruits = new String[3];
		int i, count;

		System.out.println("Enter 3 names separated by a space");
		for (i = 0; i < fruits.length; i++) {
			count = 0;
			fruits[i] = keyboard.next();
			if (fruits[i].contains("a") || fruits[i].contains("A")) {
				for (char ch : fruits[i].toCharArray()) {
					if (ch == 'a' || ch == 'A') {
						count++;
					}
				}
				System.out.println(fruits[i] + " contains " + count + " letters a/A.");
			}
		}

	}
	
	//Get the sum of the items that are greater than 10
	public static void getSum() {
		int[] numbers = {4,65,8,4,7,3,11};
		int sum = 0;
		int multiplication = 1;
		Arrays.sort(numbers);
		int temp = numbers[0];
		int numbersInBetween = 0;
		
		for(int num : numbers) {
			if(num > 10) {
				sum += num;
				numbersInBetween = num - 10;
				System.out.println("There is " + numbersInBetween + " number between 10 and " + num );
			}
			
			if(num%2==0 || num%3==0) {
				multiplication *= num;
			}//expected: 4,8,4,3 =384
		
			if(num > temp) {
				temp = num;
			}
		}		
		
		System.out.println("The sum of all the numbers grater than 10 is: " + sum);
		System.out.println("When you multiply all numbers multiples of 2 or 3 then you get: " + multiplication );
		System.out.println("The max number from my array is: " + temp);
	}
	
	//get words that contains letter p or P and print the index
	public static void fruits() {
		String[] fruits = {"Plumb", "apple", "banana", "pear", "bread", "pie", "midpmid"};
		int index = 0;
		
		for (String fruit : fruits) {
			if(fruit.contains("p") || fruit.contains("P")) {
				System.out.println(fruit + " has index " + index);
			}
			index++;
		}
	}
	
	public static void bubbleSort() {
		int arr[] = {3, 2,0, 7,1,-4, 6, -6};
		int i, j, temp;
		
		for(i=0; i<arr.length-1; i++) {
			for(j=0; j<arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
	
	public static void bubbleSort2() { //from: https://www.geeksforgeeks.org/bubble-sort/
		//int arr[] = {64, 34, 25, 12,22,11, 90, 130};
		int arr[] = {2, 1, 5, 3};

		int i, j, temp;
		int arrayLength = arr.length;
		
		//get increase order --> arr[i] < arr[j]
		//get decrease order --> arr[i] > arr[j]
		for (i = 0; i < arrayLength-1; i++) {
			for (j = 0; j < arrayLength-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
	
	public static void bubbleSort2Explanation() //from: https://www.geeksforgeeks.org/bubble-sort/
	{
		//int arr[] = {64, 34, 25, 12,22,11, 90, 130};
		int arr[] = {2, 1, 5, 3};

		int i, j, temp;
		int arrayLength = arr.length;
		
		//get increase order --> arr[i] < arr[j]
		//get decrease order --> arr[i] > arr[j]
		System.out.println(Arrays.toString(arr) + " length-1 = " + (arrayLength-1));
		for (i = 0; i < arrayLength-1; i++) {
			for (j = 0; j < arrayLength-i-1; j++) {
				System.out.println("\ni is equal to " + i);
				System.out.println("j is equal to " + j);
				System.out.println("Loop j for as long as \nj<arreyLength-i-1 -> " + (arrayLength-i-1));
				System.out.println( j + "<" + arrayLength + "-" + i + "-" + 1 + "-->" + (arrayLength-i-1));
				if (arr[j] > arr[j+1]) {
					System.out.println("if Array(index " + j + ") > array(index " + j + "+1)");
					System.out.println(Arrays.toString(arr));
					System.out.println(arr[j] + " > " + arr[j+1] + " \nthen swapp. ");
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
	
	public static void mySort() { //this method seems to be more messy than bubbleSort
		int arr[] = {64, 34, 25,-5, 12,22,11, 90, 130};

		int i, j, temp;
		
		//get increase order --> arr[i] < arr[j]
		//get decrease order --> arr[i] > arr[j]
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void countingWeekends() {
		int[] days = new int[] {3,0,6,5,4,0,2,1};
		int weekenCount = 0;
		
		for(int day : days) {
			
			switch(day){
				case 0:
					System.out.println("day " + day + " is Sunday"); 
					weekenCount++;
					break;
				case 1:
					System.out.println("day " + day + " is Monday");
					break;
				case 2:
					System.out.println("day " + day + " is Tuesday");
					break;
				case 3:
					System.out.println("day " + day + " is Wednesday");
					break;
				case 4:
					System.out.println("day " + day + " is Thursday");
					break;
				case 5:
					System.out.println("day " + day + " is Friday");
					break;
				case 6:
					System.out.println("day " + day + " is Saturday");
					weekenCount++;
					break;
					default: 
						System.out.println("Not a valid day");
			}
		}
		System.out.println("\nThere are "+ weekenCount + " weekends.");
	}
	
	public static void sortStringArray() {

		String[] fruit = new String[] {"apple", "banana", "abel", "dan", "pear", "Banana", 
				"bread", "banana", "Apple", "Pie", "Abel", " banana", "abel", "1banana"};
		
		System.out.println("*****Before sort*****"); //binarySearch behaves strange when the search is performed in a unsorted array
		System.out.println(Arrays.toString(fruit)); //[apple, banana, abel, dan, pear, Banana, bread, banana, Apple, Pie, Abel,  banana, abel, 1banana]
		System.out.println(Arrays.binarySearch(fruit, "banana")); //Index is -4 minus means didn't find it and 4 means if added should be the 4th element in the array (Which doesn't make sense)
		System.out.println(Arrays.binarySearch(fruit, "abel")); //Index is 2
		System.out.println(Arrays.binarySearch(fruit, "d")); //Index is -15 minus means didn't find it and 15 means if added should be the 15th element in the array
		System.out.println("*****After sort*****");
		Arrays.sort(fruit);
		System.out.println(Arrays.toString(fruit));//[ banana, 1banana, Abel, Apple, Banana, Pie, abel, abel, apple, banana, banana, bread, dan, pear]
		System.out.println(Arrays.binarySearch(fruit, "banana")); //Index is 10
		System.out.println(Arrays.binarySearch(fruit, "abel")); //Index is 6
		System.out.println(Arrays.binarySearch(fruit, "d")); //Index is -13 minus means didn't find it and 13 means if added should be the 13th element in the array
		
	}
	
	public static void sortIntArray() {

		int[] num = new int[] { 23, 3, 6, 9, -2, 2, 11 };
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
	}
	
	/*
	 * declare int countNames and countA
	 * read 5 names from the keyboard
	 * if the name contains the letter a or A then countNames++ and
	 * iterate through each character of the name and count the letters a/A
	 * and assign the count to countA.
	 */
	public static void countRepeatedCharactersInArray() {

		String[] name = new String[5];
		char character;
		int i, j, countNames = 0, countA = 0;
		
		System.out.println("Enter 5 names. Hit enter after each name.");
		for(i = 0; i < name.length; i++) {
			name[i] = keyboard.next();
			if(name[i].contains("a") || name[i].contains("A") ) {
				countNames++;
				for(j = 0; j < name[i].length(); j++) {
					character = name[i].charAt(j);
					if(character=='a' || character=='A') {
						countA++;
					}
				}
			}
		}
		System.out.println("There are " + countNames + " names that contain "
				+ "the letter a/A in it. \nAnd there are " + countA + " letter A/a's"
						+ " in total. ");
	}
	
	public static void getTheMaxNumFromKeyboard() {

		int[] keyboardMaxNum = new int[5];
		int i, max = keyboardMaxNum[0];
		
		System.out.println("You will enter 5 numbers."
				+ "\nhit Enter after each number.");
		for(i = 0; i < keyboardMaxNum.length; i++) {			
			while(! keyboard.hasNextInt()) {
				keyboard.next();
				System.out.println("Enter a valid number");
			}
			keyboardMaxNum[i] = keyboard.nextInt();
			if(keyboardMaxNum[i] > max) {
				max = keyboardMaxNum[i];
			}
		}
		System.out.println("The biggest number you entered is: " + max);
	}
	
	public static void getTheMinNumber() {

		int[] num = new int[] { 23, 3, 6, 9, -2, 2, 11 };
		int i, min = num[0];

		for (i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
	
	public static void getTheMaxNumber() {

		int[] num = new int[] {-4,-6,-9,-1};
		int i, max = num[0];
		
		for(i = 1; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
	
	
	/*
	 * Find element in array
	 */
	
	public static void findingElementInsideArray() {
		String[] fruit = new String[] {"apple", "banana", "pear", "bread", "Pie"};
		int i;
		for(i = 0; i < fruit.length; i++) {
			if (fruit[i].startsWith("p") || fruit[i].startsWith("P") || fruit[i].contains("d") ) {
				System.out.println(fruit[i] + " is found in index: " + i);
			}
		}
	}
	
	/*
	 * Practice array, for loop and printf
	 * Grocery  shopping
	 */
	
	public static void groceryShopping() {
		String[] item = new String[]{"mouse", "pad", "monitor", "risers", "dock"};
		double[] price = new double[item.length];
		int i;
		double sum = 0.0;
		
		for(i = 0; i < item.length; i++) {
			System.out.println("What is the price of the " + item[i] + "?");
			while(! keyboard.hasNextDouble()) {
				System.out.println("Please enter a whole number or a decimal number");
				System.out.println("What is the price of the " + item[i] + "?");
				keyboard.next();
			}
			price[i] = keyboard.nextDouble();
			sum += price[i];
		}
		
		for (i = 0; i < item.length; i++) {
			System.out.printf("\nThe price of the " + item[i].toUpperCase() + " is $%6.2f dollars.", price[i]);
		}
		System.out.printf("\n\nYour total amount due is: $%6.2f dollars." , sum);
	}
	
	/*
	 * double value from array
	 */
	public static void doubleValuesFromOriginalArray() {
		double[] items = new double[] {1.2, 3.5, 7.87, 8.11, 1.0};
		for (int i = 0; i < items.length; i++) {
			items[i] = items[i] * 2;
			System.out.println(items[i]);
		}
	}
	
	/*
	 * some primitives have different default values
	 */
	
	public static void primitiveDefaultValues() {
		int enumeration = 1;;
		int index; 
		
		int[] arr = new int[3];
		arr[0] = 1; 
		//arr[1] = 2; //when we do not assign any value to a int index the default value will be "zero"
		arr[2] = 3;
		
		for(int num : arr) {
			index = enumeration - 1;
			
			System.out.println("The element number " + enumeration + 
					" from the array arr, has the index " + index + 
					" and the value is: " + num );
			enumeration++;
		}
		
		System.out.println();
		
		char[] charArray = new char[3];
		//charArray[0] = 's'; //when we do not assign any value to a char index the default value will be "Empty"
		charArray[1] = 'a';
		charArray[2] = 'd';
		
		enumeration = 1;
		for(char ch : charArray) {
			index = enumeration - 1;
			
			System.out.println("The element number " + enumeration + 
					" from the array charArray, has the index " + index + 
					" and the value is: " + ch );
			enumeration++;
		}
		
		System.out.println();
		
		String[] stringArray = new String[5];
		
		stringArray[0] = "Pepe";
		//stringArray[1] = "Paola"; //when we do not assign any value to a char index the default value will be "null"
		stringArray[2] = "Nena";
		stringArray[3] = "Juan";
		stringArray[4] = "Elena";
		
		enumeration = 1;
		for(String str : stringArray) {
			index = enumeration - 1;
			
			System.out.println("The element number " + enumeration + 
					" from the array stringArray, has the index " + index + 
					" and the value is: " + str );
			enumeration++;
		}
		
		System.out.println();
		
		enumeration = 1;
		for (String str : stringArray) {
			index = enumeration - 1;
			try {
				System.out.println(enumeration + ". The first charachter in " + str + " is " + str.charAt(0));
				enumeration++;
				
			}catch(Exception NullPointerException) {
				System.out.println("**The element number " + enumeration + 
						" from the array stringArray with index " + index + " is null.**");
			}


		}
		System.out.println("\nMy array has " + stringArray.length + " elements.");
	}
}
