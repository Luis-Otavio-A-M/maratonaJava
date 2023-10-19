package maratona.javacore.construtores.teste;

import maratona.javacore.construtores.dominio.Anime;

public class AnimeTeste {
	public static void main(String[] args) {
		Anime anime = new Anime();
		Anime anime2 = new Anime("OPM", "TV", 24, "Shounen");
		Anime anime3 = new Anime("TTGL", "TV", 24, "Mecha", "Não sei o estúdio, mas acho que é Gainax");
		anime.init("Mob", "TV", 36, "Shounen");
		anime.imprimir();
		anime2.imprimir();
		anime3.imprimir();
	}
}
