package exercises;

import java.util.Scanner;

public class Z2_BankAccountTest {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Z2_BankAccount acc1 = new Z2_BankAccount();
		int transaction;
		double amount;

		acc1.name = "Ana Diaz";
		acc1.accountNumber = 12345;
		acc1.balance = 120.50;

		System.out.println("Welcome to Sunset\n" + "If you need to make a deposit press 1\n"
				+ "If you need to make a withdraw press 2.");

		transaction = keyboard.nextInt();
		while (!(transaction == 1 || transaction == 2)) {
			System.out.println("Not a valid transaction try again.\n" + "If you need to make a deposit press 1\n"
					+ "If you need to make a withdraw press 2.");
			transaction = keyboard.nextInt();
		}

		switch (transaction) {
		case 1:
			acc1.displayCardInfo();
			System.out.println("Please enter the amount you wish to deposit.");
			amount = keyboard.nextDouble();
			acc1.deposit(amount);
			acc1.getBalance();
			break;

		case 2:
			acc1.displayCardInfo();
			System.out.println("Please enter the amount you wish to withdraw.");
			amount = keyboard.nextDouble();
			acc1.withdraw(amount);
			acc1.getBalance();
			break;

		default:
			System.out.println("Not a valid transaction.");
		}
	}
}
