package final_keyword;

public class FinalInSwitch {


	public static void main(String[] args) {

		/*
		 * when using switch statement the only way to use a variable as a case is if
		 * the variable is final.
		 */

		/*
		 * Data types to use in switch statement
		 * Good: byte, short, int, String, char, enum, Wrapper (of the types just mentioned)
		 * Bad: long, float, double, boolean
		 */
		
		int num = 10;
//		int caseVariable = 10; // <- this line will make "case caseVariable:" line to show compile error
//								// because is not final i fixed it by making this variable final
		 final int caseVariable = 10;

		switch (num) {
		case caseVariable:
			System.out.println("10");
			break;
		case 11:
			System.out.println("11");
			break;

		default:
			System.out.println("out of range");
			break;
		}	
	
	
	}
	
	public static int method(String firstName, final String lastName) {
		String middleName =  "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		switch(firstName) { // my  switch statement is checking for a string(firstName) therefore all cases should be String
		case "Test": return 52;
//		case middleName: id=5; break; //this case is a String variable but is not final and that is why we get a compile error.
		case suffix: id =0; break;
//		case lastName: id=8; break; // lastName case is specified as final in the method argument  but a method argument can not be used as a case in the switch statement
//		case 5: id=7; break;   //<- compile errors because case is NOT a String 
//		case 'J': id=10; break;  //<- compile errors because case is NOT a String 
//		case java.time.DayOfWeek.SUNDAY: id = 15; break;	 //<- compile errors because case is NOT a String 	
		}
		return id;
	}
}
