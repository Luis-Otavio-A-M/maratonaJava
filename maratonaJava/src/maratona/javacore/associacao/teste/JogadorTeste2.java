package maratona.javacore.associacao.teste;

import maratona.javacore.associacao.dominio.Jogador;
import maratona.javacore.associacao.dominio.Time;

public class JogadorTeste2 {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Maradona");
		Time time = new Time("Nápolis");
		//Neste momento ocorre a associação
		jogador1.imprimir();
		jogador1.setTime(time);
		System.out.println();
		jogador1.imprimir();
		
	}
}
