package maratona.classesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste {
	public static void main(String[] args) {
		/*
		 * Para trabalhar com regex no Java usamos 2 classes, Pattern que representa o
		 * padrão da regex e o Matcher que representa os encontros do padrão.
		 */
		String regex1 = "ab";
		String texto1 = "abaaba";

		Pattern pattern1 = Pattern.compile(regex1); // Usamos o compile para compilar o padrão
		Matcher matcher1 = pattern1.matcher(texto1);

		System.out.println(regex1);
		System.out.println(texto1);
		System.out.println(pattern1);
		System.out.println();

		/*
		 * pelo que entendi o find retorna true ou false se existe o padrãp e caso
		 * exista, os apontadores de first e last são movidos para os valores
		 * encontrados, então podemos ir "percorrendo" os matcher usando um laço.
		 */
		while (matcher1.find()) {
			System.out.println(matcher1.start() + ", " + matcher1.end() + ", " + matcher1.group());
		}

		System.out.println();
		String regex2 = "aaa";
		String texto2 = "aaaaa";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(texto2);

		while (matcher2.find()) {
			/*
			 * Esse método de percorrer o matcher para encontrar o padrão possui um problema
			 * nos casos onde a uma sobreposição de ocorrências. Como assim? No caso, se o
			 * início da próxima ocorrência estiver dentro do intervalo da ocorrência atual,
			 * o mesmo não será pego pelo durante a iteração
			 */
			System.out.println(matcher2.start());
		}
	}
}
