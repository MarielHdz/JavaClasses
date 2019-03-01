package javaconcepts;

import java.util.Scanner;

public class Loops {

	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		splitTheString();
	}
		
	/*
	 * Separate given String by space
	 * Iterate over each word and count the characters on each word
	 */
	
	public static void  splitTheString () {
		String str = "  Today I learned  Java For   Each Loop. ";		
		String[] words = str.trim().split("\\s+");
		int count = 0;
		
		for(String word : words) {
			count = word.length();
			System.out.printf("\nThe word %8s have " + count + " characters.", word);
		}
	}
	
	/*
	 * for each loop
	 * You have array of 5 doubles
	 * get the sum of all the doubles using for each loop
	 */
	
	public static void  sumDoublesInArray () {
		double[] number = new double[] {12.476, 3.533, 8.9, 11.3, 20.2};
		double sum = 0;
		
		for (double num : number) {
			sum += num;
		}
		
		System.out.printf("\nThe sum of all the doubles in the number array is: %6.2f", sum);
	}
	
	
	/*
	 * Task: Remind user to enter a number when user enter a string instead of
	 * getting an error
	 */
	public static void verifyIntInputFromKeyboard2() {
		String input = "";
		
		System.out.println("Enter a number: ");
		while(! keyboard.hasNextInt()) {
			System.out.println("Try Again!\nRemember to enter an integer data type");
			input = keyboard.next();
		}
		System.out.println("well done you entered an integer");
	}
	
	/*
	 * Keep looping until user does not enter a number
	 */
	
	public static void verifyIntInputFromKeyboard() {
		int num = 0;
		
		System.out.println("Enter a number: ");
		while(keyboard.hasNextInt()) {
			num = keyboard.nextInt();
			System.out.println("enter next number");
		}
		System.out.println("program ended due to wrong data type from input\nExpected data type is integer");
	}
	
	/*
	 * for loop
	 * print a table
	 * Break out of the loop when it's the 3rd row
	 * Continue the loop when you are at column 1 and row 2
	 */
	
	public static void table2() {
		int rowNum = 5;
		int colNum = 3;
		for (int i = 1; i <= rowNum; i++) {
			if (i == 3) {
				break;
			}
			for (int j = 1; j <= colNum; j++) {
				if(i==2 && j==1) {
					System.out.print("\t\t");
					continue;
				}
				System.out.print("Cell(" + i + "," + j + ")\t");
			}
			System.out.println();
		}
	}
	
	/*
	 * for loop
	 * print a table
	 */
	
	public static void table() {
		int rowNum = 5;
		int colNum = 3;
		for(int i = 1; i <= rowNum; i++) {
			for(int j = 1; j <= colNum; j++) {
				System.out.print("Cell("+i + "," + j + ")\t");
			}System.out.println();
		}
	}
	
	/*
	 * for loop
	 * print a triangle	 * 
	 */
	
	public static void printTriangle() {
		int loopTimes = 25;
		int i,j,k;
		int odd = 0;
		int currentOdd = 0;
		
		for (i = 1; i <= loopTimes; i++) {
			for (j = loopTimes - 1; j > i; j--) {
				System.out.print(" ");
				if (j == i + 1) {

					for (int num = 1; num < odd + 100; num++) {
						if (num % 2 == 1) {
							currentOdd = num;
							if (currentOdd > odd) {
								break;
							}
						}
					}

					odd = currentOdd;

					while (currentOdd >= 1) {
						System.out.print("*");
						currentOdd--;
					}

				}
			}
			System.out.println();
		}
	}
	
	/*
	 * for loop
	 * print half a triangle
	 */
	
	public static void printHalfTriangle() {
		
		for (int i=1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * for loop
	 * print only odd numbers
	 */
	
	public static void printOddNumbers() {
		
		for (int i=0; i < 10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	/*
	 * for loop
	 * Get each letter from String str and print it 
	 * loop should break if there is a letter a present
	 */
	
	public static void breakWhenExpected() {
		String str = "Cybertek Java";
		System.out.println(str.indexOf("e", 5)); //gives me the index of the letter e starting from index 5
		
		for (int i=0; i<str.length(); i++) {
			if(str.substring(i,i+1).equalsIgnoreCase("a")) {
				break;
			}else if(str.substring(i,i+1).equalsIgnoreCase(" ")) {
				System.out.println();
			}else {
				System.out.println(str.charAt(i) + " is the index " + i);
			}
		}
	}	
	
	/*
	 * Nested loop
	 * Get each letter from your name and then print it and separate it with a comma
	 */
	
	public static void printName() {
		System.out.println("Enter a name: ");
		String name = keyboard.nextLine();
		
		for (int i=0; i<name.length(); i++) {
			char eachChar = name.charAt(i);
			System.out.print((i != name.length()-1)? eachChar+"," : eachChar);
		}
	}
	
	/*
	 * using break in a loop
	 */
	
	public static void breakInLoop() {
		int i = 10;
		int sum = 0;
		System.out.println("Enter the numbers you want to add up\n"
				+ "Separated by space.\nThen when you are done enter -1");
		while(true) {
			i = keyboard.nextInt();
			if(i == -1) break;
			sum += i;
		}
		System.out.println("The sum of your numbers is: " + sum);
	}
	
	/*
	 * Print a calendar
	 * start day can be any day of the week
	 * month can have 29, 30, 31 ... days etc
	 */
	
	public static void calendar() {
		int days = 30;
		int startDay = 3;
		System.out.println("S\tM\tT\tW\tT\tF\tS\t");
		for(int j = 1; j <= startDay; j++) {
			System.out.print("\t");
		}
		for (int i = 1; i < days; i++) {
			System.out.print(i + "\t");
			if((i+startDay)%7==0) {
				System.out.println();
			}

		}

	}
	
	/*
	 * Get the square from the numbers 1 to 10
	 */
	
	public static void squareTable() {
		System.out.println("Square Table");
		System.out.println("N\tSquare");
		for (int i = 1; i <= 10; i++) {
			int square = i * i;
			System.out.println(i +"\t"+ square);
		}
	}
	
	/*
	 * for loop
	 * enter x quantity of numbers
	 * if the current number is greater than the previous number then assign it to the int variable bigger
	 * then print the biggest number
	 */
	public static void printLargestNumberFromKeyboard() {

		System.out.println("How many numbers?");
		int size = keyboard.nextInt();
		int current = 0;
		int greater = 0;
		System.out.println("Enter " + size + " numbers separated by a space");
		for(int i = 1; i <= size; i++) {
			current = keyboard.nextInt();
			if(current > greater) {
				greater = current;
			}
		}
		System.out.println("The largest number is " + greater);
	}
	
	/*
	 * The difference between while and do while is that:
	 * while loop checks the condition first and then executes only if the condition is true
	 * whereas do while loop will execute first and then check the condition
	 */
	
	/*
	 * do while loop
	 */
	
	public static void doWhile() {
		int issmallerThan5 = 6;
		
		do {
			System.out.println("This line will be executed regardless the condition being false");
			issmallerThan5++;
		}while(issmallerThan5 < 5); 
	}
		
	/*
	 * do while loop
	 * Read and sum integers until the input is a negative number
	 */
	
	public static void sum3() {
		int input = 0;
		int sum = 0;
		
		System.out.println("Enter numbers separated by a space: ");

		do {  
			sum += input;   //the loop will keep running and the addition will be performed 
			input = keyboard.nextInt(); //for as long as the input is greater than 0
		} while(input > 0); //example enter 2, 3, 1, -1
		
		System.out.println("The sum is: " + sum); //prints -> The sum is: 6
		keyboard.close();
	}
	
	/*
	 * while loop
	 * Read and sum integers until the input is a negative number
	 */
	
	public static void sum2() {
		int input = 0;
		int sum = 0;
		
		System.out.println("Enter numbers separated by a space: ");

		while (input > 0) {  //this statement is false because we initialize the variable input as 0
			sum += input;    //for this reason the code inside the while loop won't be executed
			input = keyboard.nextInt(); 
		}
		System.out.println("The sum is: " + sum); //prints -> The sum is: 0
		keyboard.close();
	}
	
	/*
	 * while loop
	 * Read and sum integers until the input is -1 
	 */
	
	public static void sum() {
		int input = 0;
		int sum = 0;
		
		System.out.println("Enter numbers separated by a space: ");

		while (input != -1) {
			sum += input; //if we add this line after the keyboard input, we would subtract -1
			//from the sum and the output would be incorrect
			input = keyboard.nextInt();
		}
		System.out.println(sum);
		keyboard.close();
	}
	
	/*
	 * while loop
	 * the program should stay in the loop until user enters a number.
	 * 		//the reason we use next() method and not nextInt() method inside of the while loop 
			//is because with nextInt() method if the user enters for example a String then
			//nextInt() method would throw a InputMismatchException
			//and our program would end.
			//Whereas with next() method the user can enter anything and then the hasNextInt() method
			//will check if the input is an int or not 
			//if input is not an int then it will enter the loop
			//if input is an int then the program will continue as expected
	 */
	
	
	public static void checkIntWithScannerConditions() {
		int number = 0;
		
		System.out.println("Enter an integer:");
		while(! keyboard.hasNextInt()) {
			System.out.println("Enter a valid number");
			keyboard.next(); 			
		}
		number = keyboard.nextInt();
		System.out.println("Good! " + number + " is an integer.");
	}
}
