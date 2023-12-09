package maratona.exception.exceptionTeste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste {
	public static void main(String[] args) {
		criarArquivo();
	}
	
	private static void criarArquivo() {
		File file = new File("maratona\\exception\\exceptionTeste\\arquivo\\teste.txt");
		boolean isCriado = false;
		try {
			isCriado = file.createNewFile();
			System.out.println("Arquivo foi criado? " + isCriado);
			System.out.println("Dentro do try");
		}catch (IOException e) {
			System.out.println("Arquivo foi criado? " + isCriado);
			e.printStackTrace();
		}
	}
}
