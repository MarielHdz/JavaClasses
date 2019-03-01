package abstraction;

public class DebtCard extends BankCard{

	public DebtCard(String name, double cardNumber, double balance) {
		super(name, cardNumber, balance);
	}

	@Override
	public double withdraw(double withdraw) {
		return balance - withdraw;
	}

}
