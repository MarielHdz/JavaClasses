package exercises;

public class Z4_CarShow {

	public static void main(String[] args) {
		Z4_Car car1 = new Z4_Car();
		Z4_Car car2 = new Z4_Car("Porsche", "Cayenne", 2019);
		Z4_Car car3 = new Z4_Car("Land Rover", "Range Rover", 2019, "black", 94000);
		Z4_Car car4 = new Z4_Car("Mercedes_Benz", "G-Class", 2019, "white", 124000);
//		U_Car car5 = new U_Car("BMW", "M3", 2019, null, 124000); 
		Z4_Car car5 = new Z4_Car("BMW", "M3", 2019);
		car5.setPrice(45000);
		
		Z4_Car[] Cars = {car1, car2, car3, car4, car5};
		
		for (Z4_Car car : Cars) {
			car.display();
		}
	}
}
