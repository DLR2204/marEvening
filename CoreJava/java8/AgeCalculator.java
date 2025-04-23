package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate bdate = LocalDate.of(1995,11,18);
		
		Period p = Period.between(bdate, today);
		
		System.out.printf("Your age is :- %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
		
	}

}
