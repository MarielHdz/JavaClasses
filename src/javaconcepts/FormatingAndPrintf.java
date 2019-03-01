package javaconcepts;
/*
 * Escape characters
	\" Double quote.
	\' Single quote.
	\\ Backslash
	\n New line. Go to the beginning of the next line.
	\r Carriage return. Go to the beginning of the current line.
	\t Tab. Add whitespace up to the next tab stop.
 */

public class FormatingAndPrintf {

	public static void main (String[] args) {
		
	
		

	}
	
	/*
	 * Formatted Output with printf
	 */

		public static void ouputWithPrintfExample() {

		double price = 19.5;
		int quantity = 2;
		String item = "Widgets";
		System.out.printf("%8s sold:%4d at $%6.2f Total = $%1.1f\n", 
				          item, quantity, price, quantity * price);
		// ........... Widgets sold:   2 at $ 19.50 Total = $39.0
		// ...........12345678......1234.....123456 + 1f.....1234 + 2f
		// %8s -> 8 Strings
		// %4d -> 4 decimal integer number
		// $%6.2f -> 2f means that we should display only two floating point numbers
		// $%6.2f -> 6 means that if my double variable is less than 6 digits
		// then blank spaces will be added to the left side of my double variable
		// to complete the previously specified 6 digits format
		// $%1.1f -> 1f means that we should display only one floating point number
		// $%1.1f -> 1 means that if my total is less than 1 digit then blank
		// spaces will be added to the left side of my "total" to complete the 
		// previously specified 1 digit format. In this case my number is 39.0 which 
		// is 4 digits long hence there are not blank spaces in the left side.
	}
	
	/*
	 * another example of how to use printf
	 */
	
	public static void BmiFormattingExample() {
			
		double BMI = 25.4536;
		System.out.printf("Your BMI is: " + "%.1f\n", BMI); //prints: Your BMI is: 25.5
		System.out.println("print another line"); //this line is printed in the next line
		//  %  means that I'll give a format
		//  .1f means to print only one floating point
		//  \n  not sure of the  meaning but it starts my following print in the next line
	}
	
	/*
	 * what does the following statement displays
	 */
	
	public static void rAndNFormatting() {
		System.out.println("\"\tTest\\\\\rIt\'");
		System.out.println("\"\tTest\\\\\nIt\'");
	}
}
