package maratona.javacore.introducaoclasses.teste;

import maratona.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTeste {
	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.nome = "prof";
		prof.idade = 45;
		prof.sexo =  'M';
		prof.salario = 10000f;
		
		System.out.println(prof.nome + " " + prof.idade + " " + prof.sexo + " " +  prof.salario);
	}
}
