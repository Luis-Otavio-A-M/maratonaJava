package maratona.exception.multiExceptionTeste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

public class MultiCatchExceptionTeste {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
			// podemos encadear uma série de catch's, onde colocamos mais acima as classes
			// filhas e irmãs, e mais abaixo as classes mães
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("Dentro do ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}

		// Trabalhando com o tratamento de múltiplas exceções checked's
		// Como neste caso, SQLException e FileNotFoundException não estão na mesma
		// linha hierárquica, não faz diferença a ordem em que as exceções serão
		// tratadas nos catch's
		try {
			lancarExcecao();
		} catch (SQLException e) {
			System.out.println("Lançando uma SQLException");
		} catch (FileNotFoundException e) {
			System.out.println("Lançando uma FileNotFoundException");
		}

		/*
		 * Também podemos usar múltiplas exceções dentro de um catch, entretanto, não
		 * podemos colocar dentro de um mesmo catch, tipos de exceções que estejam na
		 * mesma linha hierárquica, como no caso, foi preciso tratar a IOException em um
		 * novo catch. Poderíamos ter removido o FileNotFoundException e ter tratado
		 * dentro do mesmo catch o SQLException e o IOException, mas nesse caso, não
		 * poderíamos dar um tratamento específico para o FileNotFoundException.
		 */
		try {
			lancarMaisExcecoes();
		} catch (SQLException | FileNotFoundException e) {
			System.out.println("Dentro do SQLException | FileNotFoundException");
		} catch (IOException e) {
			System.out.println("Dentro do IOException");
		}
	}

	private static void lancarExcecao() throws SQLException, FileNotFoundException {
		boolean throwSQLException = RANDOM.nextBoolean();
		if (throwSQLException) {
			throw new SQLException();
		} else {
			throw new FileNotFoundException();
		}

	}

	private static void lancarMaisExcecoes() throws SQLException, FileNotFoundException, IOException {
		boolean throwsIOException = RANDOM.nextBoolean();
		if (throwsIOException) {
			throw new IOException();
		} else {
			lancarExcecao();
		}
	}

	private static final Random RANDOM = new Random();
}
