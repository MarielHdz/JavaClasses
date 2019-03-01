package exercises;

import java.util.ArrayList;

public class Z6_TruckShow {

	public static void main(String[] args) {
		Z6_Truck t1 = new Z6_Truck("MonsterTruck 1",2018,100000);
		Z6_Truck t2 = new Z6_Truck("MonsterTruck 2",2000,190000);
		Z6_Truck t3 = new Z6_Truck("MonsterTruck 3",2008,110000);
		Z6_Truck t4 = new Z6_Truck("MonsterTruck 4",1999,130000);
		Z6_Truck t5 = new Z6_Truck("MonsterTruck 5",2017,150000);		
		
		ArrayList<Z6_Truck> trucks = new ArrayList<>();
		trucks.add(t1);
		trucks.add(t2);
		trucks.add(t3);
		trucks.add(t4);
		trucks.add(t5);

		/*
		 * Increase the price by 10%
		 * you can convert percentage into decimal 10% = 0.1 then multiply by price. eg: $20*0.1 = 2.0 then add the result to the original price IncreasedPrice = 20+2 = 22
		 * another way is multiply percent time price then divide by 100. eg: 10*20/100=2.0 then add the result to the original price IncreasedPrice = 20+2 = 22
		 */
		for(Z6_Truck truck : trucks) {
			double price = truck.getPrice();
			double increase = 10*price/100;
			double increasedPrice = price+increase;
			System.out.println(truck.getName() + " original price is: " + price + " and the increased price is: " + increasedPrice);
		}
	}
}
