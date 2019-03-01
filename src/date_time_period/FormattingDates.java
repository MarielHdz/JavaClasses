package date_time_period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDates {
	
	/*
	 * DateTimeFormatter class has many useful methods
	 */
	
	/*
	 * DateTimeFormatter.ofPattern("MMMM/dd/yyyy"); - October/23/1987
	 */
	
	/*
	 * when using localized formatting
	 * localDate uses localizedDate, others will throw runtime exception 
	 * LocalTime uses LocalizedTime, others will throw runtime exception 
	 * LocalDateTime uses localizedDate, LocalizedTime, LocalizedDateTime
	 */
	public static void main(String[] args) {



	}
	
	public static void ofPatternMethod() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime myBday = LocalDateTime.of(1987,10,23, 0, 0);

		DateTimeFormatter formatToday = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss");
		System.out.println(formatToday.format(now)); //February 07, 2019,05:53
		
		DateTimeFormatter formatToday2 = DateTimeFormatter.ofPattern("MMM d, yyyy,hh:mm");
		System.out.println(formatToday2.format(now)); //Feb 7, 2019,05:53
		
		DateTimeFormatter formatToday3 = DateTimeFormatter.ofPattern("MM d, yy,hh:mm");
		System.out.println(formatToday3.format(now)); //02 7, 19,05:53
		
		DateTimeFormatter formatToday4 = DateTimeFormatter.ofPattern("M dd, yy,hh:mm");
		System.out.println(formatToday4.format(now)); //2 07, 19,05:53
		
		DateTimeFormatter formatToday5 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
		System.out.println(formatToday5.format(myBday)); //2 07, 19,05:53
	}
	
	public static void localizedFormatting() {
		LocalDate lDate = LocalDate.now();
		System.out.println(lDate); // 2019-02-07
		DateTimeFormatter format = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(format.format(lDate)); // 2019-038

		LocalTime lTime = LocalTime.now();
		System.out.println(lTime);// 2019-02-07T16:20:05.473

		LocalDateTime lDateTime = LocalDateTime.of(2019, 2, 7, 14, 23);
		System.out.println(lDateTime);// 2019-02-07T16:20:05.473
		DateTimeFormatter formatting = DateTimeFormatter.ISO_WEEK_DATE;
		System.out.println(formatting.format(lDateTime));// 2019-W06-4

		System.out.println("******************************************************************");
		DateTimeFormatter LD_shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter LD_mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter LD_longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

		DateTimeFormatter LDT_shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter LDT_mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter LDT_longFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

		DateTimeFormatter LT_shortFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter LT_mediumFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter LT_longFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);

		/*
		 * when using localized formatting
		 * localDate uses localizedDate, others will throw runtime exception 
		 * LocalTime uses LocalizedTime, others will throw runtime exception 
		 * LocalDateTime uses localizedDate, LocalizedTime, LocalizedDateTime
		 */
		System.out.println(LD_shortFormat.format(lDateTime));// 2/7/19
		System.out.println(LD_mediumFormat.format(lDateTime));// Feb 7, 2019
		System.out.println(LD_longFormat.format(lDateTime));// February 7, 2019
		System.out.println(LDT_shortFormat.format(lDateTime));// 2/7/19 2:23 PM
		System.out.println(LDT_mediumFormat.format(lDateTime));// Feb 7, 2019 2:23:00 PM
		// System.out.println(LDT_longFormat.format(lDateTime));// DateTimeException
		System.out.println(LT_shortFormat.format(lDateTime));// 2:23 PM
		System.out.println(LT_mediumFormat.format(lDateTime));// 2:23:00 PM
		// System.out.println(LT_longFormat.format(lDateTime));// DateTimeException

		System.out.println("******************************************************************");
		System.out.println(LD_shortFormat.format(lDate));// 2/7/19
		System.out.println(LD_mediumFormat.format(lDate));// Feb 7, 2019
		System.out.println(LD_longFormat.format(lDate));// February 7, 2019
		//System.out.println(LDT_shortFormat.format(lDate));// UnsupportedTemporalTypeException
		//System.out.println(LDT_mediumFormat.format(lDate));// UnsupportedTemporalTypeException
		//System.out.println(LDT_longFormat.format(lDate));// UnsupportedTemporalTypeException
		//System.out.println(LT_shortFormat.format(lDate));// UnsupportedTemporalTypeException
		//System.out.println(LT_mediumFormat.format(lDate));// UnsupportedTemporalTypeException
		//System.out.println(LT_longFormat.format(lDate));// UnsupportedTemporalTypeException

		System.out.println("******************************************************************");
		//System.out.println(LD_shortFormat.format(lTime));// UnsupportedTemporalTypeException
		//System.out.println(LD_mediumFormat.format(lTime));// UnsupportedTemporalTypeException
		//System.out.println(LD_longFormat.format(lTime));// UnsupportedTemporalTypeException
		//System.out.println(LDT_shortFormat.format(lTime));// UnsupportedTemporalTypeException
		//System.out.println(LDT_mediumFormat.format(lTime));// UnsupportedTemporalTypeException
		//System.out.println(LDT_longFormat.format(lTime));// UnsupportedTemporalTypeException
		System.out.println(LT_shortFormat.format(lTime));// 5:21 PM
		System.out.println(LT_mediumFormat.format(lTime));// 5:21:36 PM
		//System.out.println(LT_longFormat.format(lTime));// DateTimeException
	}
}
