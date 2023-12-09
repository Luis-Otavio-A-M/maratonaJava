package maratona.classesUtilitarias.date.teste;

import java.util.Calendar;

public class CalendarTeste {
	public static void main(String[] args) {
		//Calendar trabalha com o padrão singleton, não é necessário criar uma nova instância, somente pegar a instância já criada.
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		//podemos usar o get, associado a uma constante que representa o campo que desejamos obter.
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.AM_PM));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.MILLISECOND));
		
		//Alterando a data na classe Calendar
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(calendar.get(Calendar.MONTH));
		//Alterando apenar o campo relacionado ao DAY_OF_MONTH, todos os outros campos foram atualizados
		//Para que não haja essa alteração em cascata, usamos o método roll.
		//Usando o método roll, quando chegará na mudança da data, por exemplo o dia chegar a 00:00 e trocar para o próximo dia,
		//o valor fica 00:00 e fica no mesmo dia.
		
		calendar.roll(Calendar.HOUR_OF_DAY, 12);
		System.out.println(calendar.getTime());
	}
}
