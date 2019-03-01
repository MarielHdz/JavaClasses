package exercises;

public class Z5_Runner {

	public static void main(String[] args) {
		
		Z5_PhoneNumberManagement pnm1 = new Z5_PhoneNumberManagement(123456789034L, "Adam");
		Z5_PhoneNumberManagement pnm2 = new Z5_PhoneNumberManagement(pnm1.getPhoneNumber());
				
		System.out.println(pnm1.getName() + " " + pnm1.transformPhoneNumber()); //Adam 123-456-789034
		System.out.println(pnm2.getName() + " " + pnm2.transformPhoneNumber()); //null 123-456-789034


	}
}
