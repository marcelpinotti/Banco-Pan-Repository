package datas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TZone {

	public static void main(String[] args) {
	
		Calendar euroCa1 = new GregorianCalendar(TimeZone.getTimeZone("Europe/Tiraspol"));

		System.out.println(euroCa1.HOUR);
}
	
}
