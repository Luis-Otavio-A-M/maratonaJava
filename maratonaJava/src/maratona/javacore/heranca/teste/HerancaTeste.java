package maratona.javacore.heranca.teste;

import maratona.javacore.heranca.dominio.Endereco;
import maratona.javacore.heranca.dominio.Funcionario;
import maratona.javacore.heranca.dominio.Pessoa;

public class HerancaTeste {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Pessoa pessoa = new Pessoa("Nome");
		
		endereco.setRua("Rua ABC");
		endereco.setCep("49100-000");
		
		pessoa.setCpf("000.000.000-00");
		pessoa.setEndereco(endereco);
		
		pessoa.imprimir();
		
		Funcionario funcionario = new Funcionario("Nome 2");
		funcionario.setCpf("111.111.111-11");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(0);
		
		funcionario.imprimir();
	}
}
