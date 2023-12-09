package maratona.classesUtilitarias.formatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste2 {
	public static void main(String[] args) {
		Locale localeUS = new Locale("en", "US");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getCurrencyInstance();
		nfa[1] = NumberFormat.getCurrencyInstance(localeUS);
		nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
		nfa[3] = NumberFormat.getCurrencyInstance(localeJP);
		
		double valor = 9_999.99;
		
		for(NumberFormat nf: nfa) {
			System.out.println(nf.format(valor));
		}
		
		//Parse de valores monetários são diferentes do parse de nuúmeros
		
		String valorString = "1000";
		String valorString2 = "R$ 1.000,00"; 
		
		try {
			//Para realizar o parse de uma moeda específica, é necessário que o valor esteja dentro 
			//do formato da moeda que o numberFormat está representando.
			System.out.println(nfa[0].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			//O valor da moeda passada como parâmetro está conforme o padrão no objeto do tipo NumberFormat
			System.out.println(nfa[0].parse(valorString2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			//Nesse caso, o valor parâmetro está em um padrão de uma moeda, mas não da moeda que o NumberFormat representa,
			//gerando uma exceção.
			System.out.println(nfa[1].parse(valorString2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
