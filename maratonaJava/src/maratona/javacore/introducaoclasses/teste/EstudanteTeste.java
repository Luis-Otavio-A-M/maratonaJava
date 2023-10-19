package maratona.javacore.introducaoclasses.teste;

import maratona.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		System.out.println(estudante);

		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);		
		
		estudante.nome = "Luis";
		estudante.idade = 21;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
	}
}
