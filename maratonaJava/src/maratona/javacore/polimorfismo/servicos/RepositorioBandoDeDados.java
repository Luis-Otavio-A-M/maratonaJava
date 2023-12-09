package maratona.javacore.polimorfismo.servicos;

import maratona.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBandoDeDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados.");
	}

}
