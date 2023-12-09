package maratona.javacore.classesabstratas.teste;

import maratona.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTeste {
	public static void main(String[] args) {
		//Como a classe Funcionario é abstract, não podemos criar um objeto a partir do seu construtor
		//Assim, é necessário implementar subclasses que as herde, como no caso Gerente e Desenvolvedor
		
		Gerente gerente = new Gerente("João", 10000, "RH");
		Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 2000, "JavaScript");
		
		System.out.println(gerente.toString());
		System.out.println(desenvolvedor.toString());
	}
}
