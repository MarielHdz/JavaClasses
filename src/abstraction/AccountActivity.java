package abstraction;

public class AccountActivity{

	public static void main(String[] args) {

//		BankCard bc = new BankCard("Paola", 123, 100); //<-can not instantiate an abstract class
		CreditCard cc = new CreditCard("Paola", 123, 100);
		DebtCard dc = new DebtCard("Nena", 456, 100);

		System.out.println(cc.balance);
		cc.deposit(50);
		System.out.println(cc.balance);
		cc.withdraw(20);
		System.out.println(cc.balance);
		
		System.out.println(dc.balance);
		dc.deposit(50);
		System.out.println(dc.balance);
		dc.withdraw(20);
		System.out.println(dc.balance);
	}
}
