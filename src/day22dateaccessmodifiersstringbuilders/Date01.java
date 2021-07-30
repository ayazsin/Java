package day22dateaccessmodifiersstringbuilders;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		//how to create date object
		
		LocalDate currentDate1 = LocalDate.now();
		System.out.println(currentDate1);//2021-07-13 
		System.out.println(currentDate1.plusDays(8));//2021-07-21
		System.out.println(currentDate1.plusMonths(2));//2021-09-13
		System.out.println(currentDate1.plusYears(5));//2026-07-13
		System.out.println(currentDate1.plusDays(-11));//2021-07-02
		
		System.out.println(currentDate1.plusDays(4).plusMonths(3).plusYears(2));//2023-10-17
		
		System.out.println(currentDate1.getYear());//2021
		System.out.println(currentDate1.getMonth());//JULY
		System.out.println(currentDate1.getMonthValue());//7
		System.out.println(currentDate1.getDayOfMonth());//12
		System.out.println(currentDate1.getDayOfWeek());//TUESDAY
		
		System.out.println(currentDate1.plusWeeks(2));//2021-07-27
		System.out.println(currentDate1.minusDays(10));//2021-07-03
		
		LocalDate Date2 = LocalDate.of(2020,8,10);
		//2021-07-12 vs 2020, 8, 10
		System.out.println(currentDate1.isAfter(Date2));//true
		System.out.println(currentDate1.isBefore(Date2));//false
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1); //2021-07-13T14:19:28.675322
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);//2021-07-13
		
		DateTimeFormatter dtformat1= DateTimeFormatter.ofPattern("dd/MMM/yy");
		/*
		 * M=>Months (1 , 2 ..) , m=> minutes
		 * MM=> The number of month (0-)
		 * MMM=> First 3 Characters
		 * MMMM =>Full name
		 * 
		 */
		 
		
		System.out.println(dtformat1.format(currentDate2));//13/Jul/21
		
		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);//14:31:25.293534
		
		DateTimeFormatter dtformat2= DateTimeFormatter.ofPattern("HH:mm");
		
		/*hh=> am-pm format
		 * HH=> 24 -hour format
		 * 
		 */
		
		System.out.println(dtformat2.format(currentTime1));//14:34
		
		// How to find the difference of two dates
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(1995, 5, 25);
		Period age = Period.between(d1, d2);
		System.out.println(age);//P-26Y-1M-19D
		
		//if I want to get just the year
		
		int ageYear = Period.between(d1, d2).getYears();
		
		System.out.println(ageYear);//-26
		
		LocalDate currentDate = LocalDate.of(2020,10,8);
		

		System.out.println(currentDate.plusDays(3).minusMonths(4).plusYears(2));
		
		
		
		
	}

}
