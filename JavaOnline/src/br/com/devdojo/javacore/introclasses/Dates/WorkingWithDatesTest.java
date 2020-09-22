package br.com.devdojo.javacore.introclasses.Dates;

import java.util.Calendar;
import java.util.Date;

public class WorkingWithDatesTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.getTime());
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Sunday is the first day of the week");
		}else {
			System.out.println("Sunday isn't the first day of the week");
		}
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		c.add(Calendar.HOUR, 2);
		
		Date date2 = c.getTime();
		
		System.out.println(date2);
		
		// NumberFormat,Locale,Calendar, Date, DateFormat
		
	}

}
