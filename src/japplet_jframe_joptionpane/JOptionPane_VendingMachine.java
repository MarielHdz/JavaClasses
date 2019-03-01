package japplet_jframe_joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane_VendingMachine {

	public static void main(String[] args) {

		dateFormat();
		
	}
	
	/*
	 * create a yes-or-no dialog to answer Are you in college question
	 */
	
	public static void areYouInCollege() {
		JOptionPane.showConfirmDialog(null, "Are you in college?", "click button", JOptionPane.YES_NO_OPTION);		
		System.exit(0); //Always exit your program
	}
	
	/*
	 * With JOptionPane call showConfirmDialog method
	 * ask "Are you  18 or older?"
	 * if user is 18 or older then adult variable is set to true
	 * if user is younger than 18 then adult is set to false
	 */
	
	public static void areYou18OrOlder() {
		boolean adult = false;
		int is18YearsOld = JOptionPane.showConfirmDialog(null, "Are you 18 or older?", "Click a button:", JOptionPane.YES_NO_OPTION);
		if (is18YearsOld== JOptionPane.YES_OPTION) {
			adult = true;
		}else if (is18YearsOld==JOptionPane.NO_OPTION){
			adult = false;
		}		
		System.out.println(adult);		
		System.exit(0); //Always exit your program
	}
	
	/*
	 * Dialog box for Yes-or-No questions
	 */
	
	public static void done() {
		
		int answer = JOptionPane.showConfirmDialog(null, "Done?", "Click a button:", JOptionPane.YES_NO_OPTION);
		if (answer==JOptionPane.YES_OPTION) {
			System.exit(0);
		}else if (answer==JOptionPane.NO_OPTION) {
			System.out.println("One more time");
		}
	}
	
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
	
	public static void vendingMachine() {
		String amountString = JOptionPane.showInputDialog("Enter a whole number from 1 to 999\n"
				+ "I will output a combination of coins\n" + "that equals that amount of change.");

		int amount, originalAmount, dollar, fiftyCents, quarters, dimes, nickels, pennies;
		
		amount = Integer.parseInt(amountString);
		originalAmount = amount;
		
		dollar = amount / 100;
		amount =  amount % 100;
		fiftyCents = amount / 50;
		amount = amount % 50;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
		
		JOptionPane.showMessageDialog(null, originalAmount + " cents in coins can be given as: \n" 
		+ dollar + " dollars\n"
		+ fiftyCents + " fifty cents\n"
		+ quarters + " quarters\n"
		+ dimes + " dimes\n"
		+ nickels + " nickels\n"
		+ pennies + " pennies.");
	}
	
	/*
	 * Write a program that reads a String for a date in the format month/ day/ year and 
	 * displays it in the format day. month. year
	 */
	
	public static void dateFormat() {
		
		String inputDate = JOptionPane.showInputDialog("Enter a date in the following format: mm/dd/yy");
		String splitDate[] =  inputDate.split("/");
		String month = splitDate[0];
		String day = splitDate[1];
		String year = splitDate[2];
		
		JOptionPane.showMessageDialog(null, "in Europe same date would be displayed as: " + day + "." + month + "." + year);
	}
}
