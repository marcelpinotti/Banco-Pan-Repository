package datas;

import java.util.Calendar;
import java.util.TimeZone;

public class Fusos {

	public static void main(String[] args) {
			
			Calendar calendar = Calendar.getInstance();
			TimeZone zona_local = calendar.getTimeZone();
			System.out.println(zona_local);
			

			
			String[] fusinho = TimeZone.getAvailableIDs();
			for (String fuso: fusinho) {
				System.out.println(fuso);
			}
			

	}

}
