package maratona.classesUtilitarias.formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormarTeste {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * DateFormat é uma classe abstrata, então não podemos instanciar um objeto
		 * diretamente dela. Para obter uma instância que seja compatível com a classe,
		 * usamos um dos métodos: getInstance, getDateInstance, getDateTimeInstance
		 * 
		 */
		DateFormat dateFormat = DateFormat.getInstance(); // formato igual ao do sistema operacional (30/10/2023 22:19)
		DateFormat dateFormatDate = DateFormat.getDateInstance(); // formato "dia nome do mês abreviado ano" (30 de out. de 2023)
		
		// mesmo formato do anterior com o acréscimo das horas:minutos:segundos (30 de out. de 2023 22:19:51)
		DateFormat dateFormatDateTime = DateFormat.getDateTimeInstance(); 

		System.out.println(dateFormat.format(calendar.getTime()));
		System.out.println(dateFormatDate.format(calendar.getTime()));
		System.out.println(dateFormatDateTime.format(calendar.getTime()));
		
		System.out.println("Podemos passar estilos para os métodos getInstanceDate");
		System.out.println("==========================");
		DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.SHORT); // 30/10/2023
		DateFormat dateFormatMedium = DateFormat.getDateInstance(DateFormat.MEDIUM); // 30 de out. de 2023
		DateFormat dateFormatLong = DateFormat.getDateInstance(DateFormat.LONG); // 30 de outubro de 2023
		DateFormat dateFormatFull = DateFormat.getDateInstance(DateFormat.FULL); // segunda-feira, 30 de outubro de 2023
		
		System.out.println(dateFormatShort.format(calendar.getTime()));	
		System.out.println(dateFormatMedium.format(calendar.getTime()));	
		System.out.println(dateFormatLong.format(calendar.getTime()));	
		System.out.println(dateFormatFull.format(calendar.getTime()));	

		System.out.println("Usando estilo no getInstanceDateTime também.");
		System.out.println("==========================");
		
		DateFormat dateFormatTimeShort = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT); // 30/10/2023 22:34
		DateFormat dateFormatTimeMedium = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM); // 30/10/2023 22:34:31
		DateFormat dateFormatTimeLong = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG); // 30/10/2023 22:34:31 BRT
		DateFormat dateFormatTimeFull = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL); // 30/10/2023 22:34:31 Horário Padrão de Brasília
		
		System.out.println(dateFormatTimeShort.format(calendar.getTime()));	
		System.out.println(dateFormatTimeMedium.format(calendar.getTime()));	
		System.out.println(dateFormatTimeLong.format(calendar.getTime()));	
		System.out.println(dateFormatTimeFull.format(calendar.getTime()));	
	}
}
