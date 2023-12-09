package maratona.classesUtilitarias.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste {
	public static void main(String[] args) {
		/*
		 * Path é uma interface que como o nome sugere representa um caminho para arquivo ou diretório o qual poderemos trabalhar,
		 * pelo que entendi ela é uma interface para abstrair os vários tipo de caminhos que existem, que variam entre os sistemas operacionais.
		 * 
		 * Paths pelo que entendi é uma classe que é usada para encapsular os vários tipos de implementações do Path.
		 */
		Path path = Paths.get("maratona\\classesUtilitarias\\nio\\teste\\pasta\\arquivo.txt");	
		Path path2 = Paths.get("maratona", "classesUtilitarias", "nio", "teste", "pasta", "arquivo.txt");	
		
		System.out.println(path.getFileName());
		System.out.println(path2.getFileName());
	}
}
