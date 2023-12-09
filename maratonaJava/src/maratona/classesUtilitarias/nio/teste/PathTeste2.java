package maratona.classesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste2 {
	public static void main(String[] args) throws IOException {
		Path caminhoPasta = Paths.get("maratona\\classesUtilitarias\\nio\\teste\\folder");
		/*
		 * Pelo que entendi a classe Files é um classe utilitária criada para operar em
		 * cima do Path, separando assim a representação do Path das operações sobre o
		 * arquivo/pasta.
		 */

		if (Files.notExists(caminhoPasta)) { // verifica se o arquivo/pasta existe
			// Cria uma pasta caso ela não exista, caso ela exista lança uma exceção
			// (FileAlreadyExistsException)
			Path folderCreated = Files.createDirectory(caminhoPasta);
			System.out.println(folderCreated);
			// Mas esse cara só cria uma pasta, e se for necessário criar pastas aninhadas?
		}

		Path caminhoPasta2 = Paths.get("maratona\\classesUtilitarias\\nio\\teste\\folder\\subFolder\\subSubFolder");
		if (Files.notExists(caminhoPasta2)) {
			/*
			 * Para criar múltiplas pastas aninhadas usamos o método createDirectories que
			 * dá suporte a isso. Diferente do createDirectory, este método não lança
			 * exceção caso a pasta já exista.
			 */

			Path foldersCreated = Files.createDirectories(caminhoPasta2);
			System.out.println(foldersCreated);
		}
		
		/*
		 * Criando arquivos com a classe Files.
		 */
		
		Path caminhoArquivo = Paths.get(caminhoPasta.toString(), "arquivo.txt");
		if(Files.notExists(caminhoArquivo)) {
			//cria um arquivo, igual a classe File, e caso o arquivo exista, lança um FileAlreadyExistsException
			Path fileCreated = Files.createFile(caminhoArquivo);
			System.out.println(fileCreated);
		}
		
		/*
		 * Renomeando um arquivo
		 */
		
		Path origem = caminhoArquivo;
		Path destino = Paths.get(caminhoArquivo.getParent().toString(), "arquivo2.txt");
		/*
		 *  Neste caso, o arquivo é copiado, da origem para o destino,
		 *  mas se o destino já existir é lançada uma exceção.
		 */
		if(Files.notExists(destino)) {
			Files.copy(origem, destino); 			
		}
		
		Path destino2 = Paths.get(caminhoArquivo.getParent().toString(), "arquivo3.txt");
		/*
		 * Neste caso, passando a opção replace_existing, mesmo o arquivo existindo, é feito
		 * a cópia, substituindo o arquivo do destino original.
		 */
		Files.copy(origem, destino2, StandardCopyOption.REPLACE_EXISTING); 
	}
}
