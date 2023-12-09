package maratona.classesUtilitarias.date.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste {
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2021, 11, 30);
		Period period = Period.between(localDate1, localDate2);
		System.out.println(period);
		
		//A classe Period trabalha com dias, meses e anos
		Period p1 = Period.ofDays(10);
		Period p2 = Period.ofWeeks(10);
		Period p3 = Period.ofMonths(10);
		Period p4 = Period.ofYears(10);
		
		System.out.println(p1);
		System.out.println(p2); //Único a ser convertido a dias, pois, a classe não trabalha os valores representando semanas
		System.out.println(p3);
		System.out.println(p4);
		
		
		//Neste caso, se eu precisa pegar o mês de p1 e p2, ou o dia em p4, retornará 0, pois a representação dos dias, meses e anos são
		//"separadas", assim, p4 que possui o valor de 10 referente aos anos que ele representa, não tem valor nenhum (0) representando
		// os dias e meses que se passaram
		System.out.println(p4.getMonths());
		
		//podemos usar o método until junto à classe ChronoUnit (Fazendo p4.getMonthys)
		System.out.println(LocalDate.now().until(LocalDate.now().plusYears(10), ChronoUnit.MONTHS));
		
	}
}
