package maratona.classesUtilitarias.date.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(23, 59, 59); //Hora entre 00 - 23
		LocalTime now = LocalTime.now();
		System.out.println(time);
		System.out.println(now);
		System.out.println();
	
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getSecond());
		System.out.println();

		System.out.println(now.get(ChronoField.AMPM_OF_DAY)); //Retorna se o horário é AM (0) ou PM (1)
		System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_AMPM)); // Retornar horas em formato am/pm (1 - 12)
		System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_DAY)); //Retora horas do dia (1 - 24)
	}
}
