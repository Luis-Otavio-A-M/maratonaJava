package maratona.exception.runtimeExceptionTeste;

public class RuntimeExceptionTeste {
	public static void main(String[] args) {
		int a = dividir(10, 5);
		System.out.println(a);
		int b = dividir(3, 0);
		System.out.println(b);
	}

	public static int dividir(int a, int b) throws IllegalArgumentException{
		/**
		 * Isso é um javadoc
		 * @param a: qualquer número inteiro.
		 * @param b: qualquer número inteiro, exceto o 0.
		 * @throws IllegalArgumentException
		 */
		
		// Lançando uma RuntimeException em um método
		// Por ser uma RuntimeException, não é obrigatório usar o throws na assinatura
		// do método, mas eu acho melhor, pois sinaliza a outras pessoas que a exceção
		// pode ser lançada.
		if (b == 0) {
			throw new IllegalArgumentException("O denominador não pode ser 0");
		}
		return a / b;
	}
}
