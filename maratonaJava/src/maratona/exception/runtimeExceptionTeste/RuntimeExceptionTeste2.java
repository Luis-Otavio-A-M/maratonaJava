package maratona.exception.runtimeExceptionTeste;

public class RuntimeExceptionTeste2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		 * RuntimeException X Exception: RuntimeException é uma subclasse de Exception,
		 * todas Exception's são checked (checadas em tempo de compilação), assim, caso
		 * um método lance uma Exception, ela deve ser tratada obrigatoriamente, se não
		 * o código não é compilado.
		 */

		/*
		 * Já uma RuntimeException, é uma exceção unchecked, isso significa que a mesma
		 * não é checada em tempo de compilação, então não é obrigatório que seja
		 * tratada a mesma para que o código seja compilado.
		 */

		// Essa é uma RuntimeException, mesmo estando implícito no código que essa
		// chamada gerara um nullPointerException, a JVM não faz esta verificação, então
		// esse código é "rodável", e a exceção só ocorrerá em tempo de execução
		Object object = null;
		System.out.println(object.toString());
		
		RuntimeExceptionTeste.dividir(0, 0);
		
	}
}
