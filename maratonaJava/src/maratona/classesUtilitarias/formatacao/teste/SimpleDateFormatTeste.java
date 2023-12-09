package maratona.classesUtilitarias.formatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTeste {
	public static void main(String[] args) {
		String mascara = "hh:mm:ss aa EEEE dd/MMMM/yy";
		SimpleDateFormat sdf = new SimpleDateFormat(mascara);
		Calendar calendar = Calendar.getInstance();
		System.out.println(sdf.format(calendar.getTime()));
		
		try {
			//Para realizar o parse, é necessário que a String informada siga o padrão definido a risca.
			//Aparentemente, a exceção é mudar o formato do ano de 2 para 4caracteres, isso não causará uma exceção
			System.out.println(sdf.parse("05:28:31 PM quarta-feira 22/novembro/2023"));
			System.out.println(sdf.parse("05:28:31 PM quarta-feira 22/novembro/23"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
