package maratona.classesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste4 {
	public static void main(String[] args) {
		/*
		 * Quantificadores em regex:
		 * ?: representa zero ou um do caracter/conjunto associado.
		 * *: representa zero ou muito do caracter/conjunto associado.
		 * +? representa 1 ou muito do caracter/conjunto associado.
		 * {n, m}: representa uma quantidade no intervalo n até m de ocorrência associado ao caracter/conjunto.
		 * () : representa um agrupamento (igual na matemática, utilizamos para alterar o grau de precedência).
		 * | : representa um ou
		 * $: representa final de linha
		 * .: representa qualquer cadeia de caracter.
		 */
		//Desafio: desenvolver um pattern que reconheça números hexadecimais
		Pattern hexaDecimal = Pattern.compile("0[xX][\\dA-Fa-f]+(\\s|$)");
		String texto = "0X 12 0X111 1111 abc 0X123HI 0XFF" ;
		Matcher matcherHexaDecimal = hexaDecimal.matcher(texto);
		while(matcherHexaDecimal.find()) {
			//numeroDecimal = Integer.parseInt(matcherHexaDecimal.group().substring(2), 16);
			System.out.println(matcherHexaDecimal.group());
		}
	}
}
