package maratona.javacore.associacao.teste;

import maratona.javacore.associacao.dominio.Escola;
import maratona.javacore.associacao.dominio.Professor;

public class EscolaTeste {
	public static void main(String[] args) {
		Escola escola = new Escola("João XXIII");
		Professor professor1 = new Professor("Kaká");
		Professor professor2 = new Professor("Clóvis");
		Professor professor3 = new Professor("Breno");
		Professor[] professores = {professor1, professor2, professor3};
		escola.setProfessores(new Professor[] {professor1, professor2, professor3});
		
		escola.imprimir();
	}
}
