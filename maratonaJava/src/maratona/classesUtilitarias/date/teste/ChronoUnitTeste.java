package maratona.classesUtilitarias.date.teste;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste {
	public static void main(String[] args) {
		LocalDate aniversario = LocalDate.of(2022, 10, 27);
		LocalDate date = LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(aniversario, date);
		System.out.println(daysBetween);
	}
}
