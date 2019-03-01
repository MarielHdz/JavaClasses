package exercises;

public class Z5_PhoneNumberManagement {

	private long phoneNumber;
	private String name;

	public Z5_PhoneNumberManagement(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Z5_PhoneNumberManagement(long phoneNumber, String name) {
		this(phoneNumber);
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String transformPhoneNumber() {
		String str = "";
		String temp1, temp2, temp3 = "";
		
		//convert phone into string		
		str = Long.toString(phoneNumber);
		
		//separate string with - and return
		str = str.substring(0, 3) + "-" + str.substring(3, 6) + "-" + str.substring(6);
		return str;
	}
	

}
