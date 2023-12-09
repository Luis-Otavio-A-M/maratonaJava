package maratona.classesUtilitarias.date.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		now = now.withDayOfMonth(30); //with seta o campo sem ocorrer a possibilidade de ocorrer a rolagem da data.
		System.out.println(now);
		
		//Usando o temporalAdjuster
		now = LocalDate.now();
		now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY)); //pegando o próximo ou atual quinta-feira
		System.out.println(now);
		
		now = LocalDate.now();
		now = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)); //pega a proxima quinta.
		System.out.println(now);
		
		now = LocalDate.now();
		now = now.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)); //pega o dia da semana informado anterior
		System.out.println(now);
		
		now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(now);
		
		now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(now);
	}
}
