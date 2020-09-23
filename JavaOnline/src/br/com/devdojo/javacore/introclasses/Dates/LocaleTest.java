package br.com.devdojo.javacore.introclasses.Dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// ISO 639
		Locale localeItaly = new Locale("it", "IT");
		Locale localeSwitzerland = new Locale("it","CH");
		Locale localeJapan = new Locale("ja");
		Locale localeIndia = new Locale("hi","IN");
		
		
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER ,23);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
		
		System.out.println("Italy :" + df.format(c.getTime()));
		System.out.println("Switzerland : " + df2.format(c.getTime()));
		System.out.println("Japan :" + df3.format(c.getTime()));
		System.out.println("India :" + df4.format(c.getTime()));
		
		System.out.println(localeItaly.getDisplayLanguage());
		System.out.println(localeSwitzerland.getDisplayLanguage());
		System.out.println(localeJapan.getDisplayLanguage());
		System.out.println(localeIndia.getDisplayLanguage());
	}

}
