package maratona.classesUtilitarias.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste {
	public static void main(String[] args) {
		String caminhoArquivo = "maratona\\classesUtilitarias\\io\\folder\\fileReader.txt";
		try (FileReader fr = new FileReader(caminhoArquivo)) {
			// read() retorna um int representando o valor ascii. Esse método só lê um
			// caracter por vez.
			char primeiroCaracter = (char) fr.read();
			System.out.println(primeiroCaracter);

			/* read(char[] ) lê todos os dados e insere no array, obviamente o arquivo tem
			 mais caracteres que o array, estes caracteres a mais não serão aramazenados. */
			char[] bufferChar = new char[12];
			fr.skip(13); //pula uma quantidade de caracteres
			
			fr.read(bufferChar);
			System.out.println(bufferChar);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
