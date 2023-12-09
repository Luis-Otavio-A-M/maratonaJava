package maratona.javacore.sobrescrita.teste;

import maratona.javacore.sobrescrita.dominio.Anime;

public class AnimeTeste {
	public static void main(String[] args) {
		Anime anime = new Anime("Goku e a galera");
		//método toString é chamado implicitamente
		System.out.println(anime);
	}
}
