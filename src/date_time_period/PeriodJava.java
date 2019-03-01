package date_time_period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodJava {

	public static void main(String[] args) {

		/*
		 * period only deals with date
		 * 
		 * period can not be chained since is static
		 * 
		 * we have Period.of() method which accepts years, months and days.
		 * 
		 * can only be used with LocalDate and LocalDateTime
		 */

		Period vacation = Period.ofMonths(3);
		Period schoolReunion = Period.of(2, 3, 1);
		System.out.println(vacation);// P3M
		System.out.println(schoolReunion); // P2Y3M1D
		/*
		 * when we chain methods we will get a warning and will only get the last method
		 * called. the following period will only be 15 days.
		 */
		Period schoolReunion2 = Period.ofYears(2).ofMonths(3).ofDays(15); // chaining methods example
		System.out.println(schoolReunion2); // P15D

		LocalDate today = LocalDate.of(2019, 2, 7);
		Period programmingSurgery = Period.of(0, 2, 5);
		LocalDate surgeryDate = today.plus(programmingSurgery);
		System.out.println(today); // 2019-02-07
		System.out.println(programmingSurgery);// P2M5D
		System.out.println(surgeryDate);// 2019-04-12

		LocalDateTime dateTime = LocalDateTime.of(2019,2,7,15,0);
		LocalTime time = LocalTime.now();
		System.out.println(time); // 15:51:35.867
		System.out.println(time.plus(programmingSurgery)); // <-throws UnsupportedTemporalTypeException
		//System.out.println(today.plus(time)); //compile error
	}
}
