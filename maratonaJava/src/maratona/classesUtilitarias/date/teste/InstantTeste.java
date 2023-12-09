package maratona.classesUtilitarias.date.teste;

import java.time.Instant;

public class InstantTeste {
	public static void main(String[] args) {
		/*
		 * Pelo que entendi, a classe Instant representa um valor no tempo, a partir de 01-01-1970
		 * Essa representação sempre é feita com baseada no horário da zona de greenwich, assim, independente
		 * da localidade do SO que registrou o instant, não impactará no registro.
		 * Pelo tamanho do número que seria necessário para registrar o instant em nanosegundos, 
		 * o mesmo é dividido em epochSecond, que representa os segundos que se passaram após a data inicial
		 * e nano, que representa os nanossegundo do segundo representado pelo epochSecond
		 */
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(instant.getEpochSecond());
		System.out.println(instant.getNano());
		
	}
}
