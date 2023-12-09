package maratona.javacore.modificadorfinal.teste;

import maratona.javacore.modificadorfinal.dominio.Carro;
import maratona.javacore.modificadorfinal.dominio.Comprador;

public class CarroTeste {
	public static void main(String[] args) {
		System.out.println(Carro.VELOCIDADE_MAXIMA);
		Comprador comprador = new Comprador("Pedro");
		Carro carro = new Carro(comprador);
		
		
		System.out.println(carro.COMPRADOR);
		// carro.COMPRADOR = new Comprador() gera um erro, pois não podemos atribuir um novo valor a COMPRADOR, por ser uma constante
		
		// Mas é permitido alterar os atributos do objeto que é apontado, lembre-se, o que é constante é o valor de referência
		// que o ponteiro representa, o objeto em si ainda pode ser alterado
		carro.COMPRADOR.setNome("Henrique");
		System.out.println(carro.COMPRADOR);
		}
}
