package maratona.javacore.polimorfismo.servicos;

import maratona.javacore.polimorfismo.dominio.Computador;
import maratona.javacore.polimorfismo.dominio.Produto;
import maratona.javacore.polimorfismo.dominio.Smartphone;

public class CalculadoraImposto {
	
	public static void calcularImpostoComputador(Computador computador) {
		double imposto = computador.calcularImposto();
		System.out.println("Calculando o imposto do computador");
		System.out.println("Nome: " + computador.getNome());
		System.out.println("Valor: " + computador.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
	}
	
	public static void calcularImpostoSmartphone(Smartphone smartphone) {
		double imposto = smartphone.calcularImposto();
		System.out.println("Calculando o imposto do smartphone");
		System.out.println("Nome: " + smartphone.getNome());
		System.out.println("Valor: " + smartphone.getValor());
		System.out.println("Imposto a ser pago: " + imposto);	
	}
	
	//Usando polimorfismo na passagem de parâmetros
	public static void calcularImposto(Produto produto) {
		double imposto = produto.calcularImposto();
		System.out.println("Calculando o imposto do produto");
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Valor: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		
		//Verificando se é possível fazer o cast de uma classe mãe para uma classe filha.
		if(produto instanceof Smartphone) {
			Smartphone smartphone = (Smartphone) produto;
			System.out.println("Ano de lançamento: " + smartphone.getAnoLancamento());
		}
	}
}
