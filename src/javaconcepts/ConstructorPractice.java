package javaconcepts;

/*
 * I have more constructor examples inside inheritance package and blocks package
 */

public class ConstructorPractice {

	private String type;
	private int houseNumber;
	private double price;
	static String neighborhood;

	public ConstructorPractice() {
		System.out.println("Creatinf empty house");
	}

	public ConstructorPractice(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public ConstructorPractice(String type, int houseNumber, double price) {
		this(houseNumber); // <- when you call a constructor inside another constructor it has to come in
							// the first line or it will not compile.
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public double getPrice() {
		return price;
	}

}
