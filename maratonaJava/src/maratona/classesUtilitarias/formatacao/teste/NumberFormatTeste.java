package maratona.classesUtilitarias.formatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste {
	public static void main(String[] args) {
		Locale localeUS = new Locale("en", "US");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localeUS);
		nfa[2] = NumberFormat.getInstance(localeIT);
		nfa[3] = NumberFormat.getInstance(localeJP);
		
		double valor = 9_999.99;
		
		for(NumberFormat nf: nfa) {
			//Informa, como o nome sugere, o número máximo de dígitos fracionais que será representando no numberFormat
			System.out.println(nf.getMaximumFractionDigits());
			
			//Podemos setar um novo valor máximo
			nf.setMaximumFractionDigits(1);
			System.out.println(nf.format(valor));
		}
		
		String valorString = "9_999,99"; 
		String valorString2 = "9999,99"; 
		try {
			//Nesse caso só sera impresso o valor 9, porque o caracter "_" não é interpretado, nesse caso de parse, como um 
			//separador de unidade, e sim como um caracter inválido, que interrompe o parse. Caso isso ocorra antes que qualquer
			//número seja convertido, é lançado uma exceção
			System.out.println(nfa[0].parse(valorString));
			
			//aqui o parse ocorre normalmente
			System.out.println(nfa[0].parse(valorString2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
