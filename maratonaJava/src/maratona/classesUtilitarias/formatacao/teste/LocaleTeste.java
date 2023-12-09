package maratona.classesUtilitarias.formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
	public static void main(String[] args) {
		/*
		 * A classe Locale represente, como o nome sugere
		 * uma localidade, que podemos passar como parâmetros 
		 * para diversos métodos e classes, para que os valores
		 * seja formatados, conforme o padrão da localidade.
		 * O construtor Locale(String language, String country) 
		 * segue as ISO 639 para language e 3166 para o country
		 */
		Locale localeItaly = new Locale("it", "IT");
		Locale localeSwitzerland = new Locale("it", "CH");
		Locale localeIndia = new Locale("hi", "IN");
		Locale localeJapan = new Locale("ja", "JP");
		Locale localeNetherland = new Locale("nl", "NL ");
		
		Calendar calendar = Calendar.getInstance();
		DateFormat dfItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
		DateFormat dfSwitzerland = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
		DateFormat dfIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
		DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
		DateFormat dfNetherland = DateFormat.getDateInstance(DateFormat.FULL, localeNetherland);
		
		System.out.println(dfItaly.format(calendar.getTime()));
		System.out.println(dfSwitzerland.format(calendar.getTime()));
		System.out.println(dfIndia.format(calendar.getTime()));
		System.out.println(dfJapan.format(calendar.getTime()));
		System.out.println(dfNetherland.format(calendar.getTime()));
		
		System.out.println("");
		
		//Retorna o nome da lingua associada ao locale, passando como parâmetro a localidade (língua)
		// em que deve ser feito o retorno.
		System.out.println(localeItaly.getDisplayLanguage(localeItaly));
		System.out.println(localeSwitzerland.getDisplayLanguage(localeSwitzerland));
		System.out.println(localeJapan.getDisplayLanguage(localeJapan));
		System.out.println(localeIndia.getDisplayLanguage(localeIndia));
		System.out.println(localeNetherland.getDisplayLanguage(localeNetherland));
	}
}
