package maratona.classesUtilitarias.date.teste;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste {
	public static void main(String[] args) {
		//Defindindo datas usando as classes do java.util
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(date);
		System.out.println(calendar);
		
		//Usando LocalDate
		LocalDate localDate = LocalDate.of(2023, Month.NOVEMBER, 22);
		
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.lengthOfMonth());
		System.out.println(localDate.isLeapYear()); //éBissexto
		System.out.println(localDate);
		
		//Pegando a data atual
		LocalDate localDate2 = LocalDate.now();
		System.out.println(localDate2);
	}
}
