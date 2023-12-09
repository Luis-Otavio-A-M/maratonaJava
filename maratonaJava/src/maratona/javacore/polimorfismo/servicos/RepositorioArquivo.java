package maratona.javacore.polimorfismo.servicos;

import maratona.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo.");
	}

}
