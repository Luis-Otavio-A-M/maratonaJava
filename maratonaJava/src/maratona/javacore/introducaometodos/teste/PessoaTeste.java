package maratona.javacore.introducaometodos.teste;

import maratona.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		p.setNome("Luis");
		p.setIdade(21);
		
		p.imprimirDados();
		
		System.out.println("\n\n" + p.getNome());
		System.out.println(p.getIdade() + "\n\n");
		
		p2.setNome("Pedro");
		p2.setIdade(-14);
		p2.imprimirDados();
	}
}
