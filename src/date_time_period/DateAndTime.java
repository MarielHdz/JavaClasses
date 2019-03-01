package date_time_period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class DateAndTime {

	/*
	 * LocalDate,dateTime and Time classes are final.
	 * 
	 * their constructors are private hence we can not instantiate them
	 * 
	 * they are immutable
	 */
	public static void main(String[] args) {

		System.out.println(LocalDate.now()); // 2019-02-07
		System.out.println(LocalTime.now()); // 14:13:02.264
		System.out.println(LocalDateTime.now()); // 2019-02-07T14:13:29.395

		/*
		 * we can create local date and time by using the method of()
		 */

		LocalDate paoBday = LocalDate.of(1987, 10, 23);
		LocalDate paoBday2 = LocalDate.of(1987, Month.OCTOBER, 23);
		System.out.println(paoBday); // 1987-10-23
		System.out.println(paoBday2); // 1987-10-23

		LocalTime paoBdayTime = LocalTime.of(23, 20);
		System.out.println(paoBdayTime);// 23:20

		LocalDateTime paoWasBorn = LocalDateTime.of(paoBday, paoBdayTime);
		System.out.println(paoWasBorn); // 1987-10-23T23:20

		/*
		 * Manipulating Date an Time
		 */

		LocalDateTime juanBday = LocalDateTime.of(paoBday.minusDays(18).minusMonths(7).plusYears(5),
				paoBdayTime.minusHours(4));
		System.out.println(juanBday); //1992-03-05T19:20

		
		LocalDate ss = LocalDate.of(2018, Month.APRIL, 40);
		//System.out.println(ss); //DateTimeException - invalid value for day
	}
}
