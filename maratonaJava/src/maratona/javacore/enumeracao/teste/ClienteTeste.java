package maratona.javacore.enumeracao.teste;

import maratona.javacore.enumeracao.dominio.Cliente;
import maratona.javacore.enumeracao.dominio.Cliente2;
import maratona.javacore.enumeracao.dominio.TipoCliente;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Pedro", Cliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Paulo", Cliente.PESSOA_JURIDICA);
		Cliente cliente3 = new Cliente("Pereira", "teste");

		System.out.println(cliente);
		System.out.println(cliente2);
		System.out.println(cliente3);
		// Funciona a princípio, mas essa é a melhor solução?
		// Ainda é possível passar qualquer string, e o programa continua rodando sem
		// erros,
		// E se mais a frente a aplicação recebe esse objeto com atributos nulos
		// E como é obrigatório a passagem de nome e tipo, a app não esteja esperando
		// null e quebre mais a frente?
		// Para isso podemos usar Enums

		// No caso abaixo é diferente, criamos um enum que representa os valores que
		// aceitamos como valores válidos
		// para o atributo tipo, neste caso se for passado um valor inválido, ocorre uma
		// exceção de cara
		// e trava a aplicação.
		Cliente2 clienteUm = new Cliente2("Teste 1", TipoCliente.PESSOA_FISICA);
		Cliente2 clienteDois = new Cliente2("Teste 2", TipoCliente.PESSOA_JURIDICA);
		// Cliente2 clienteTres = new Cliente2("Teste 3", TipoCliente.QUALQUER_COISA);

		System.out.println(clienteUm);
		System.out.println(clienteDois);
	}
}
