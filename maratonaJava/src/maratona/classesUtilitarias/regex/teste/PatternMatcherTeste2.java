package maratona.classesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste2 {
	public static void main(String[] args) {
		//Usando metacaracteres
		
		// O char "\\d" representa 1 dígito
		String texto = "1a2b3c4d5e6F7G8H9I0J";
		Pattern digito = Pattern.compile("\\d");
		Matcher matcherDigito = digito.matcher(texto);
		imprimirMatcher(matcherDigito, 1);
		
		// o char "\\D" é o oposto do "\\d" e representa todos caracteres que não são dígitos
		texto = texto.concat("!?:");
		Pattern naoDigito = Pattern.compile("\\D");
		Matcher matcherNaoDigito = naoDigito.matcher(texto);
		imprimirMatcher(matcherNaoDigito, 1);
		
		// o char \\S representa qualquer caracter de espaço, que no Java são: \t, \r, \f, \n
		texto = "a\taa  aa\fa\raaa\n";
		Pattern espaco = Pattern.compile("\\s");
		Matcher matcherEspaco = espaco.matcher(texto);
		imprimirMatcher(matcherEspaco, 2);
		
		// o char \\S é o inverso do \\s e representa os caracteres que não são espaços em branco
		Pattern naoEspaco = Pattern.compile("\\S");
		Matcher matcherNaoEspaco = naoEspaco.matcher(texto);
		imprimirMatcher(matcherNaoEspaco, 2);
		
		
		// o char \\w representa o alfabeto maiúsculo/minúsculo, os dígitos e o "_"
		//correção, não são todos os caracteres alfabéticos, somente o intervalo [a:z] U [A:Z]
		texto = "aáBçc 122_!@#";
		Pattern alfaNumericoUnderScore = Pattern.compile("\\w", Pattern.UNICODE_CASE);
		Matcher matcherAlfaNumerico = alfaNumericoUnderScore.matcher(texto);
		imprimirMatcher(matcherAlfaNumerico, 1);
		
		// o char \\W é basicamente o contrário do \\w, asim representando os caracterer não alfanumério e nem o "_"
		
		Pattern naoAlfaNumericoUnderScore = Pattern.compile("\\W");
		Matcher matcherNaoAlfaNumerico = naoAlfaNumericoUnderScore.matcher(texto);
		imprimirMatcher(matcherNaoAlfaNumerico, 1);
		
	}
	
	private static void imprimirMatcher(Matcher matcher, int tipo) {
		while(matcher.find()) {
			if(tipo == 1) {
				System.out.print(matcher.group() + ", ");
			} else if(tipo == 2) {
				System.out.print("\"" + matcher.start() + "\", ");
			}
		}
		System.out.println();
	}
}
