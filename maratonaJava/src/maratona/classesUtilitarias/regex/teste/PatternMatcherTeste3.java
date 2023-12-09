package maratona.classesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste3 {
	public static void main(String[] args) {
		// O metachar [] representa um conjunto/intervalo em que aquele padrão pode dar
		// match.
		// (Difícil? Veja o exemplo)
		String texto = "a,b,c";
		Pattern abcSemConjunto = Pattern.compile("abc");
		Pattern abcComConjunto = Pattern.compile("[abc]");

		Matcher matcher1 = abcSemConjunto.matcher(texto);
		Matcher matcher2 = abcComConjunto.matcher(texto);

		// aqui não vai imprimir nada, pois o matcher vai procurar exatamente bater com
		// a string "abc"
		imprimirMatcher(matcher1, 1);

		// já aqui os 3 caracteres do texto serão impressos, pois ele vai bater com cada
		// valor individual do conjunto, tratando cada elemento do conjunto
		// individualmente
		imprimirMatcher(matcher2, 1);

		// Para não ser necessário escrever todos elementos do conjunto, podemos
		// utilizar o caracter "-" para representar uma continuidade do conjunto, como
		// se fosse reticências da matemática.
		Pattern letrasMinusc = Pattern.compile("[a-z]");
		texto = "AbCdEfGhIj";
		Matcher matcherMinusc = letrasMinusc.matcher(texto);
		imprimirMatcher(matcherMinusc, 1);
		
		//Desafio: desenvolver um pattern que reconheça números hexadecimais
		Pattern hexaDecimal = Pattern.compile("0[xX][0-9A-Fa-f]++");
		texto = "0X 12 0X111 1111 abc 0X123HI 0XFF" ;
		Matcher matcherHexaDecimal = hexaDecimal.matcher(texto);
		int numeroDecimal;
		while(matcherHexaDecimal.find()) {
			//numeroDecimal = Integer.parseInt(matcherHexaDecimal.group().substring(2), 16);
			System.out.println(matcherHexaDecimal.group());
		}
		
		
		
	}

	private static void imprimirMatcher(Matcher matcher, int tipo) {
		while (matcher.find()) {
			if (tipo == 1) {
				System.out.print(matcher.group() + ", ");
			} else if (tipo == 2) {
				System.out.print("\"" + matcher.start() + "\", ");
			}
		}
		System.out.println();
	}
}
