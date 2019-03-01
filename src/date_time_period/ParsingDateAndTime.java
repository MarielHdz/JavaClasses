package date_time_period;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ParsingDateAndTime {

	public static void main(String[] args) {
		
		/*
		 * to parse a date we can:
		 */
		
		//1. specify the format that the text to be parsed should have
		//2. get the text (web element etc...)
		//3. parse it 
		//4. when parsing put the value in a variable of the desired type
		//5. after that you can keep modifying your java date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate today = LocalDate.parse("10/23/1987", formatter);
		System.out.println(today); //1987-10-23
		System.out.println(formatter.format(today)); //10/23/1987

		//calendar is not really used anymore
		LocalDate today2 = LocalDate.of(2019,Calendar.DECEMBER+1,21);
		System.out.println(today2);

		LocalDate today3 = LocalDate.of(2019,Month.JUNE,21);
		System.out.println(today3);
		
	}
}
