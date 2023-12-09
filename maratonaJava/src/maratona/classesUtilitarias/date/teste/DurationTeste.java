package maratona.classesUtilitarias.date.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste {
	public static void main(String[] args) {
		// Duration é focada na duranção em nanossegundos de 2 objetos diferentes, que deem suporte a medição em nanossegundos.
		// Para comparação que necessitem envolver os dias, meses e anos, a classe adequada é a Period
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
		
		LocalTime timeNow = LocalTime.now();
		LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7).plusMinutes(15);
		
		Instant nowInstant = Instant.now();
		Instant instantAfterOneSecond = Instant.now().plusSeconds(1);  
		
		Duration duration = Duration.between(now, nowAfterTwoYears);
		Duration duration2 = Duration.between(timeNow, timeMinusSevenHours);
		Duration duration3 = Duration.between(nowInstant, instantAfterOneSecond);
		
		
		
		System.out.println(duration);
		System.out.println(duration2);
		System.out.println(duration3);
	}
}
