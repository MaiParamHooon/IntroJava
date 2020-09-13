package java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateNtimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate d = LocalDate.now();
//		LocalDate d = LocalDate.of(2000, Month.OCTOBER, 6);
//		System.out.println(d);
//		LocalTime t = LocalTime.now();
//		System.out.println(t);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		LocalTime t = LocalTime.now(ZoneId.of("America/Dominica"));
		System.out.println(t);
		
		
		Instant i = Instant.now();
		System.out.println(i);
	}
		
}
