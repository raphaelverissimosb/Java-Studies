package br.com.devdojo.javacore.introclasses.Dates;

import java.text.DateFormat;
import java.util.Calendar;


public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		DateFormat[] dta = new DateFormat[6];
		
		dta[0] = DateFormat.getDateInstance();
		dta[1] = DateFormat.getDateInstance(DateFormat.SHORT);
		dta[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dta[3] = DateFormat.getDateInstance(DateFormat.LONG);
		dta[4] = DateFormat.getDateInstance(DateFormat.FULL);
		
		
		for(DateFormat df : dta) {
			System.out.println(df.format(c.getTime()));
		}
		
		
	}
	

}
