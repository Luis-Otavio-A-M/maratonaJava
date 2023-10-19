package maratona.javacore.associacao.teste;

import maratona.javacore.associacao.dominio.Jogador;
import maratona.javacore.associacao.dominio.Time;

public class JogadorTeste3 {
	public static void main(String[] args) {
		Time time = new Time("Flamengo");
		Jogador jogador1 = new Jogador("Gabigol Pescoço", time);
		Jogador jogador2 = new Jogador("Pedro Queixada", time);
		Jogador jogador3 = new Jogador("David Luiz, a alegria do povo", time);
		Jogador[] jogadores = { jogador1, jogador2, jogador3 };
		time.setJogadores(jogadores);
		
		time.imprimir();
		
	}
}
