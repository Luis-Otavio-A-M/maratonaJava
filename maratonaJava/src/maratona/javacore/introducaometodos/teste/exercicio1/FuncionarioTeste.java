package maratona.javacore.introducaometodos.teste.exercicio1;

import maratona.javacore.introducaometodos.dominio.exercicio1.Funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Beto"); 
		f1.setIdade(25);
		f1.setSalarios(new float[] {1000f, 2000f, 3000f});

		f2.setNome("Bel");
		f2.setIdade(45);
		
	
		f1.imprimirMedia();
		f1.imprimirDados();
		f1.imprimirMedia();
		
		System.out.println();
		
		f2.imprimirDados();
		f2.imprimirMedia();
		
	}
}
