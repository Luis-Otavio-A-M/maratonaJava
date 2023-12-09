package maratona.javacore.polimorfismo.teste;

import maratona.javacore.polimorfismo.dominio.Computador;
import maratona.javacore.polimorfismo.dominio.Smartphone;
import maratona.javacore.polimorfismo.dominio.Produto;
import maratona.javacore.polimorfismo.servicos.CalculadoraImposto;

public class ProdutoTeste {
	public static void main(String[] args) {
		Computador computador = new Computador("Accer Aspire 3 i3-11", 2999.99);
		Smartphone smartphone = new Smartphone("Samsung Galaxy A01 core", 799.99);
		
		//Utilizando polimorfismo em uma variável de referência
		Produto prod1 = new Computador("Accer Nitro 5", 4999.99);
		Produto prod2 = new Smartphone("Redmi Note 12", 1299.99);
		
		
		CalculadoraImposto.calcularImpostoComputador(computador);
		System.out.println("==========================================");
		
		CalculadoraImposto.calcularImpostoSmartphone(smartphone);
		System.out.println("==========================================");
		
		CalculadoraImposto.calcularImposto(prod1);
		System.out.println("==========================================");
		
		CalculadoraImposto.calcularImposto(prod2);
		System.out.println("==========================================");

	}
}
