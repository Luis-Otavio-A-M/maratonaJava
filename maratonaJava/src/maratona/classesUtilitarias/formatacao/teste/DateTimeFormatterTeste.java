package maratona.classesUtilitarias.formatacao.teste;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.*;
import java.util.Locale;

public class DateTimeFormatterTeste {
	public static void main(String[] args) {
		//Transformando de um date para string
		LocalDate date = LocalDate.now();
		//é necessário informar o padrão de data utilizado, tanto no parse,quanto no format
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); 
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		LocalDate parse1 = LocalDate.parse(s1, DateTimeFormatter.BASIC_ISO_DATE ); 
		LocalDate parse2 = LocalDate.parse(s2); //somente no caso do parse para o padrão "ISO_LOCAL_DATE" é permitido
		
		System.out.println(parse1);
		System.out.println(parse2
				);
		
		//Usando nossos próprios formatos
		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateFormartString = LocalDate.now().format(formatterBR);
		System.out.println(dateFormartString);
		
		LocalDate localDateBR = LocalDate.parse(dateFormartString, formatterBR);
		System.out.println(localDateBR);
		
		//Podemos associar localidades aos dateformatter
		DateTimeFormatter formatterUSA = DateTimeFormatter.ofPattern("MMMM.dd.yyyy", Locale.US);
		String formatedStringUSA = LocalDate.now().format(formatterUSA);
		System.out.println(formatedStringUSA);
		
		LocalDate parseUSA = LocalDate.parse(formatedStringUSA, formatterUSA);
		System.out.println(parseUSA);
		
	}
}
