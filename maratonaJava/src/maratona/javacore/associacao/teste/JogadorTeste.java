package maratona.javacore.associacao.teste;

import maratona.javacore.associacao.dominio.Jogador;

public class JogadorTeste {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Gabigol Pescoço");
		Jogador jogador2 = new Jogador("Ribamar");
		Jogador jogador3 = new Jogador("Estagiário Craque da bola");
		//Os objetos são passados por referência para o array
		Jogador[] jogadores = {jogador1, jogador2, jogador3}; 
		
		for(Jogador jogador: jogadores) {
			jogador.imprimir();
		}
		
		//Alterando o jogador1, como o jogadores[0] aponta para o mesmo objeto, o primeiro elemente a ser impresso é "Zico é maior"
		jogador1.setNome("Zico é maior");
		for(Jogador jogador: jogadores) {
			jogador.imprimir();
		}
		
	}
}
