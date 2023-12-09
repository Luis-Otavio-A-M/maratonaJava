package maratona.exception.exceptionTeste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste2 {
	private static final String PATH_FILE = "maratona\\exception\\exceptionTeste\\arquivo\\teste.txt";

	public static void main(String[] args) {
		try {
			// Como foi lançada uma checked exception, o método que recebe a exceção é
			// obrigado a tratá-la, ou pelo menos repassá-la.
			criarArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Neste caso, como o tratamento da checked exception foi feito dentro do método
		// e posteriormente foi lançado uma runtimeException, isso dá uma liberdade a
		// quem está usando o método de decidir se irá tratar aquela exceção lançada ou
		// não.
		criarArquivo2();
	}

	// Lançando uma checked exception em um método.
	private static void criarArquivo() throws IOException {
		File file = new File(PATH_FILE);
		boolean isCriado = file.createNewFile();
		System.out.println("Arquivo foi criado? " + isCriado);
		System.out.println("Dentro do try");
	}

	// Tratando uma exceção e ao mesmo tempo lançando uma
	private static void criarArquivo2() {
		boolean isCriado = false;
		File file = new File(PATH_FILE);
		try {
			isCriado = file.createNewFile();
			System.out.println("Arquivo foi criado? " + isCriado);
			System.out.println("Dentro do try");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Arquivo foi criado? " + isCriado);
			throw new RuntimeException(e.getMessage());
		}
	}
}
