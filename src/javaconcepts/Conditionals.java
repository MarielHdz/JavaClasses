package javaconcepts;

import java.util.Scanner;

public class Conditionals {

	public static final double MIN_BONUS = 50;
	public static final double MIN_SALARY = 400;
	enum GRADE_RANGE {A, B, C, D, F}
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
	}	
	/*
	 * Suppossed salary and deductions are variables of type double that have been
	 * given values. Write an if-else statement that displays OK andF sets the
	 * variable net equal to salary minus deductions, provided that salary is at
	 * least as large as deductions. If, however, salary is less than deductions,
	 * the if-else statement should simply display the words No Way but not change
	 * the value of any variables.
	 */
	
	public static void salary(double salary, double deductions) {
		double net = salary - deductions;

		if (salary >= deductions) {
			System.out.println("OK your net is: $" + net);
		} else {
			System.out.println("No way");
		}
	}
	
	/*
	 * ternary operator is an if condition with a different format
	 * Be sure to note that a conditional expression always returns a value 
	 * and so is equivalent to only certain special kinds of if-else statements
	 */
	
	public static void salary2 (double salary, double deductions ) {
		double net = salary - deductions;

		 System.out.println((salary >= deductions) ? "OK your net is: $" + net : "No way");
	}
	
	/*
	 * ternary or conditional operator
	 * using the conditional operator
	 * set the String variable label to degree or degrees depending on the output
	 */
	
	public static void temperature (int degree) {
		String label = (degree == 1)? " degree" : " degrees";
		System.out.println("The temperature is " + degree + label);
	}

	/*
	 * Enter an int from 1-7 which represents a day
	 * print the day
	 */
	
	public static void intDayToStringDay(int dayNumber) {

		switch (dayNumber) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Other day");
		}
	}

	/*
	 *write a switch statement to convert a letter grade into an equivalent numeric
	 *value on a four-point scale. 
	 *Set the value of the variable gradeValue to 4.0 for an A
	 *3.0 for a B
	 *2.0 for a C
	 *1.0 for a D 
	 *0.0 for an F
	 *for any other value set the value to 0.0 and display an error message
	 */	
	
	public static void range (GRADE_RANGE range) {
		double gradeValue = 0;
		
		switch (range) {
		case A:
			gradeValue = 4.0;
			break;
		case B:
			gradeValue = 3.0;
			break;
		case C:
			gradeValue = 2.0;
			break;
		case D:
			gradeValue = 1.0;
			break;
		case F:
			gradeValue = 0.0;
			break;
		default:
			gradeValue = 0.0;
		}
	
		System.out.println("Your grade value is: " + gradeValue);
	}
	
	/*
	 * Consider the previous question, but include + or - letter grades. 
	 * A+ is 4.25, A- is 3.75, 
	 * B+ is 3.25, B- is 2.75,
	 * C+ is 2.25, C- is 1.75,
	 * D+ is 1.25, D- is 0.75,
	 * F is 0.0
	 */
	
	public static void range2 (String range) {
		double gradeValue = 0;
		
		switch (range) {
		case "A+":
			gradeValue = 4.25;
			break;
		case "A-":
			gradeValue = 3.75;
			break;
		case "B+":
			gradeValue = 3.25;
			break;
		case "B-":
			gradeValue = 2.75;
			break;
		case "C+":
			gradeValue = 2.25;
			break;
		case "C-":
			gradeValue = 1.75;
			break;
		case "D+":
			gradeValue = 1.25;
			break;
		case "D-":
			gradeValue = 0.0;
			break;
		case "F+":
			gradeValue = 0.0;
			break;
		default:
			gradeValue = 0.0;
		}
	
		System.out.println("Your grade value is: " + gradeValue);
	}
	
	/*
	 * write a program to compute the service charge for cashing a check
	 * Set variable int checkAmount to hold the check amount
	 * initialize the variable float charge to 0.0;
	 * with an if condition check
	 * if (checkAmount < 10) then charge = 1;
	 * else if ((checkAmount > 10) && (checkAmount < 100)) then charge = (checkAmount*(10.0/100.0f);
	 * else if ((checkAmount > 100) && (checkAmount < 1000)) then charge =  (5 + (checkAmount*(5.0/100.0f)));
	 * else if (checkAmount > 1000) then charge = (40 + (checkAmount*(1.0/100.0f)));
	 */
		
	public static void chargeForCashingACheck(int checkAmount) {

		int charge = 0;
		
		if (checkAmount < 10) {
			charge = 1;
			System.out.println("The charge to cash a $"+ checkAmount + " dollars check is: $" + charge + " dollar.");
		}else if ((checkAmount > 10) && (checkAmount < 100)) {
			charge = (int) (checkAmount*(10.0f/100.0f));
			System.out.println("The charge to cash a $"+ checkAmount + " dollars check is: $" + charge + " dollars.");
		}else if ((checkAmount > 100) && (checkAmount < 1000)) {
			charge =  (int) (5 + (checkAmount*(5.0f/100.0f)));
			System.out.println("The charge to cash a $"+ checkAmount + " dollars check is: $" + charge + " dollars.");
		}else if (checkAmount > 1000) {
			charge = (int) (40 + (checkAmount*(1.0f/100.0f)));
			System.out.println("The charge to cash a $"+ checkAmount + " dollars check is: $" + charge + " dollars.");
		}
	}
	
	/*
	 * write a program that returns the correct toll fee depending on the vehicle
	 */
	
	public static void tollCalculator(String vehicle) {

		int fee = 0;
		
		switch (vehicle.toLowerCase()) {		
		case "moto" :
			fee = 20; break;
		case "van" : 
			fee = 30; break;
		case "trailer" : 
			fee = 40; break;
		default :
			fee = 60; break;
		}

		System.out.println("The toll for a " + vehicle + " is " + fee + " dollars.");
	}	
	
}
