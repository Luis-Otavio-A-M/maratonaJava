package maratona.javacore.associacao.teste.exercicio;

import maratona.javacore.associacao.dominio.exercicio.Aluno;
import maratona.javacore.associacao.dominio.exercicio.Local;
import maratona.javacore.associacao.dominio.exercicio.Seminario;

public class ExercicioTeste {
	public static void main(String[] args) {
		Local local = new Local("Rua ABC, nº 123");
		
		Seminario seminario = new Seminario("Estudos de Algoritmos Avançados", local);
		Seminario seminario2 = new Seminario("Gestão de Projetos com Metodologias Ágeis", local);
		
		Aluno aluno1 = new Aluno("Luis Otavio", 22, seminario);
		Aluno aluno2 = new Aluno("William Kevin", 23, seminario);
		Aluno aluno3 = new Aluno("Welison de Jesus", 23, seminario2);
		
		seminario.setAlunos(new Aluno[] {aluno1, aluno2});
		seminario2.setAlunos(new Aluno[] {aluno3});
		
		Professor professor = new Professor("Breno Piva", "Autómatas e Teoria da Computação");
		professor.setSeminarios(new Seminario[] {seminario, seminario2});
		
		System.out.println("======== Local ==========");
		local.imprimir();
		
		System.out.println("======== Alunos ==========");
		aluno1.imprimir();
		aluno2.imprimir();
		aluno3.imprimir();
		
		System.out.println("======== Seminários ==========");
		seminario.imprimir();
		seminario2.imprimir();
		
		System.out.println("======== Professor ==========");
		professor.imprimir();
	}
}
