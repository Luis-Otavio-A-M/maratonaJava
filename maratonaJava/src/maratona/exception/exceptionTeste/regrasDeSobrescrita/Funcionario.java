package maratona.exception.exceptionTeste.regrasDeSobrescrita;

import java.io.IOException;
import java.sql.SQLException;

public class Funcionario extends Pessoa {

	@Override
	/*
	 * Não somos obrigado a lançar as mesmas exceções nos métodos que foram
	 * sobrescritos. Podemos remover as exceções ou adicionar unchecked exceptions.
	 * Entretanto, não podemos colocar classes checked que são mais genéricas do que
	 * as foram definidas no método da classe mãe. 
	 * Exemplo: O método na classe mãe
	 * lança uma FileNotFoundException, e a classe filha lança um IOException, como
	 * IOException é uma classe ascedente de FileNotFoundException, é lançado o
	 * erro. Não podemos adicionar checked exception nos métodos que irão sobrescrever.
	 */
	public void salvar() {
		System.out.println("Salvando funcionário.");
	}
}
