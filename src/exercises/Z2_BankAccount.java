package exercises;

public class Z2_BankAccount {

	String name;
	long accountNumber;
	double balance;
	private int pin;
	
	public void displayCardInfo() {
		System.out.println("Card name: " + name +
				"\nAccount number: " + accountNumber +
				"\nBalance: " + balance);
	}
	
	public void deposit(double amount) {
		balance += amount;		
	}
	
	public void withdraw(double amount) {
		balance -= amount;		
	}
	
	public void getBalance() {
		System.out.printf("Your new balance is: $%6.2f dollars.", balance);
	}
	
	public boolean lowBalance(double balance) {
		if (balance < 1000) {
			return true;
		}else {
			return true;
		}
	}
}
