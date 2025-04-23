package java8;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Check {
	
	public static void main(String[] args) {
		
//		Set set = ZoneId.getAvailableZoneIds();
//		
//		for(Object obj:set) {
//			
//			System.out.println(obj);
//		}
		
		ZoneId zone = ZoneId.of("Canada/Eastern");
		
		ZonedDateTime time = ZonedDateTime.now(zone);
		
		System.out.println(time);
		
	}

}
