package exercises;

import java.util.Scanner;

public class Z8_VendingMachine {
	public static void main(String[] args) {
		/*
		 * * Algorithm - Pseudocode
		 * 1. Read the amount into the variable amount. 
		 * 2. originalAmount = amount; 
		 * 3. Set the variable quarters equal to the maximum number of quarters in amount.
		 * 4. Reset amount to the change left after giving out that many quarters. 
		 * 5. Set the variable dimes equal to the maximum number of dimes in amount. 
		 * 6. Reset amount to the change left after giving out that many dimes. 
		 * 7. Set the variable nickels equal to the maximum number of nickels in amount. 
		 * 8. Reset amount to the change left after giving out that many nickels. 
		 * 9. pennies = amount; 
		 * 10. Display originalAmount and the numbers of each coin.
		 */

		int amount = 0;
		int originalAmount = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("I will find a combination of coins");
		System.out.println("that equals that amount of change.");
		amount = sc.nextInt();
		originalAmount = amount;
		System.out.println(originalAmount + " in coins can be given as: ");

		while (amount > 0) {
			if (amount >= 25) {
				quarters = amount / 25;
				amount = amount - 25 * quarters;
				if (quarters > 1) {
					System.out.println(quarters + " quarters");
				}else {
					System.out.println(quarters + " quarter");
				}
			}else if (amount >= 10) {
				dimes = amount / 10;
				amount = amount - (10 * dimes);
				if (dimes > 1) {
					System.out.println(dimes + " dimes");
				}else {
					System.out.println(dimes + " dime");
				}
			}else if (amount >= 5) {
				nickels = amount / 5;
				amount = amount - (5 * nickels);
				if (nickels > 1) {
					System.out.println(nickels + " nickels");
				}else {
					System.out.println(nickels + " nickel");
				}
			}else if (amount >= 1) {
				pennies = amount / 1;
				amount = amount - (1 * pennies);
				if (pennies > 1) {
					System.out.println(pennies + " pennies");
				}else {
					System.out.println(pennies + " penny");
				}
			}
		}
	}
}
