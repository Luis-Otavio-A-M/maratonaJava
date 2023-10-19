package maratona.javacore.introducaometodos.teste;

import maratona.javacore.introducaometodos.dominio.Estudante;
import maratona.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
		
		estudante1.nome = "A";
		estudante1.idade = 20;
		estudante1.sexo = 'F';
		
		estudante2.nome = "O";
		estudante2.idade = 30;
		estudante2.sexo = 'M';
		
		impressoraEstudante.imprimirEstudante(estudante1);
		
		System.out.println();
		
		impressoraEstudante.imprimirEstudante(estudante2);
		System.out.println("========================");
		impressoraEstudante.imprimirEstudante(estudante1);
		
		System.out.println();
		
		impressoraEstudante.imprimirEstudante(estudante2);
		System.out.println("========================");
		
		estudante1.nome = "B";
		estudante2.nome = "P";
		
		estudante1.imprimirEstudante();
		estudante2.imprimirEstudante();
	}
}
