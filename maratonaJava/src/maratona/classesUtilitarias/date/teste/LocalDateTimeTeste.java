package maratona.classesUtilitarias.date.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date = LocalDate.parse("2023-11-28");
		LocalTime time = LocalTime.parse("08:45");
		
		//Associando objetos date e time
		LocalDateTime ldt1 = date.atTime(time);
		LocalDateTime ldt2 = time.atDate(date);
		
		System.out.println(localDateTime);
		System.out.println(ldt1);
		System.out.println(ldt2);
		
	}
}
