package maratona.classesUtilitarias.nio.teste;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTeste {
	public static void main(String[] args) {
		/*
		 * Neste ponto, onde possuimos dois caminhos que se completam, como poderiamos uni-los
		 * para chegarmos ao arquivo final.
		 */
		Path caminhoDir = Paths.get("home/user");
		Path caminhoArquivo = Paths.get("dev/arquivo.txt");
		Path caminhoFinal1 = Paths.get(caminhoDir.toString(), caminhoArquivo.toString());
		System.out.println(caminhoFinal1); //Podemos fazer assim, ou podemos utilizar o resolve, que pelo que entendi, concatena os caminhos
		
		Path caminhoFinal2 = caminhoDir.resolve(caminhoArquivo);
		System.out.println(caminhoFinal2 + "\n\n");
		
		/*
		 * Características da normalização:
		 */
		
		/*
		 * Caminho absoluto é representado pelo primeiro caracter ser o '\',
		 * No caso caminho absoluto é aquele que será utilizado independente
		 * da pasta em que a ação foi executada, ou seja, a ação é feita da raiz
		 * em diante.
		 */
		Path caminhoAbsoluto = Paths.get("/home/user");
		Path caminhoAbsoluto2 = Paths.get("/home/user2");
		Path caminhoRelativo = Paths.get("dev");
		Path caminhoRelativoFile = Paths.get("arquivo.txt");
		
		/*
		 * A normalização de um caminho absoluto seguindo por um caminho relativo 
		 * não apresenta falhas, ocorre a concatenação sem problemas.
		*/
		System.out.println(caminhoAbsoluto.resolve(caminhoRelativo));
		System.out.println(caminhoAbsoluto.resolve(caminhoRelativoFile));
		
		/*
		 * Nestes 3 casos, como o parâmetro do método foi uma caminho absoluto
		 * não ocorre concatenação, e os Path passado no método é retornado
		 */
		System.out.println(caminhoAbsoluto.resolve(caminhoAbsoluto2));
		System.out.println(caminhoRelativo.resolve(caminhoAbsoluto));
		System.out.println(caminhoRelativoFile.resolve(caminhoAbsoluto));
		
		/*
		 * Normalização de caminhos relativos ocorre sem falhas também,
		 * igual aos 2 primeiros casos.
		 */
		System.out.println(caminhoRelativo.resolve(caminhoRelativoFile));
		
	}
}
