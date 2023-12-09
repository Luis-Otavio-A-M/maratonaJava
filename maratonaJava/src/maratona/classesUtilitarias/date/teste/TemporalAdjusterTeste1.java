package maratona.classesUtilitarias.date.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterTeste1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 11, 23);
		date = date.with(new ObterProximoDiaUtil());
		System.out.println(date);
	}
}

class ObterProximoDiaUtil implements TemporalAdjuster{
	@Override
	public Temporal adjustInto(Temporal temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		int addDays = 1;
		switch(dayOfWeek) {
			case FRIDAY:
				addDays = 3;
				break;
			case SATURDAY:
				addDays = 2;
		}
		return temporal.plus(addDays, ChronoUnit.DAYS);
	}
	
}
