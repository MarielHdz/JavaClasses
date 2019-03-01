package javaconcepts;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class Algorithms {
	
	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOLUME = 0.002;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	

	
	/*
	 * Algorithm - Pseudocode
	 * Declare an array literal which contains a list of integers
	 * Declare a variable of type int to hold the count of odd numbers from the list of integers
	 * With a for loop, access each number from the list of integers
	 * With an if condition, check if any number from the list of integers is odd
	 * If  the number is odd then increase count by one
	 */
	
	public static void totalOddNumbers() {
		
		int[] randomNumbers = new int[] {1,2,3,4,5,8,7,7};
		int totalOddNumbers = 0;
		
			for (int x : randomNumbers) {
				if (x%2 != 0) {
					totalOddNumbers ++;
				}
			}
			
		System.out.println(totalOddNumbers);
	}
	
	/*
	 * Algorithm - Pseudocode
	 * int[] listOfValues = new int[] {x,y,z};
	 * for each integer from the list if the integer is greater than the integer before then 
	 * assign value to maxVal variable
	 * then print maxVal 
	 */
	
	public static void maxVal() {
		
		int maxVal = 0;
		int[] listOfValues = new int[] {2,1};
		for(int value : listOfValues ) {
			if (value > maxVal) {
				maxVal = value;
			}
		}
		
		System.out.println(maxVal);	
	}
	
	/*
	 * Read the weight in pounds into the variable pounds
	 * read the height in feet into the variable feet
	 * Read the additional height in inches into the variable inches 
	 * Set the variable heightMeters to the value ((feet * 12 ) + inches ) * 0.0254.
	 * Set the variable mass to the value pounds /  2.2.
	 * Set the variable BMI to the values mass / (heightMeters * heightMeters).
	 * Output BMI.
	 * If BMI < 18.5 then output "Underweight".
	 * else if BMI >= 25 and BMI < 30 then output "Overweight."
	 * Otherwise, output "Obese."
	 */
	
	public static void BmiCalculator() {
		int pounds, feet, inches;
		double heightMeters, mass, BMI;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your weight in pounds");
		pounds = sc.nextInt();
		System.out.println("Enter your height in feet follow by a space then enter inches");
		feet = sc.nextInt();
		inches = sc.nextInt();
		
		heightMeters = ((feet * 12 ) + inches) * 0.0254;
		mass = pounds / 2.2;
		BMI = mass / (heightMeters * heightMeters);
		
		System.out.printf("Your BMI is: " + "%.1f\n", BMI);
		
		if (BMI < 18.5) {
			System.out.println("you are underwight");
		}else if (BMI < 25) {
			System.out.println("you weight is normal");
		}else if (BMI < 30) {
			System.out.println("you are over weight");
		}else {
			System.out.println("you are obese");
		}
	}
}