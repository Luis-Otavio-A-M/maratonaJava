package maratona.javacore.blocosDeInicializacao.teste;

import maratona.javacore.blocosDeInicializacao.dominio.Anime2;

public class AnimeTeste2 {
	public static void main(String[] args) {
		// funcionava sem o bloco de inicialização
		Anime2 anime = new Anime2();
		for(int episodio: anime.getEpisodios()) {
			System.out.print(episodio + ", ");
		}
		System.out.println();
		// teste para verificar se o inicializador funcionou
		Anime2 anime2 = new Anime2("Teste");
		for(int episodio: anime2.getEpisodios()) {
			System.out.print(episodio + ", ");
		}
	}
}
