package exercises;

public class Z4_Car {

	private String make;
	private String model;
	private int year;
	private String color;
	private double price;

	public Z4_Car() {
		this("Unknown", "ToBeDecided", 2020);

	}

	public Z4_Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Z4_Car(String make, String model, int year, String color, double price) {
		this(make, model, year);
		this.color = color;
		this.price = price;
	}
	
	public void display() {
		System.out.printf("%s %s %s %s %s.\n" , make, model, year, color, price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

}
