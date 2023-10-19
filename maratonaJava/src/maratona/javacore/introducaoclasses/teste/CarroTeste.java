package maratona.javacore.introducaoclasses.teste;

import maratona.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro ferrari = new Carro();
		Carro uninho = new Carro();
		
		ferrari.nome = "Ferrari";
		ferrari.modelo = "Roma";
		ferrari.ano = 2020;
		
		uninho.nome = "Diana";
		uninho.modelo = "Uno 94 quadradrão com escada";
		uninho.ano = 1993;
		
		System.out.println(ferrari.nome);
		System.out.println(ferrari.modelo);
		System.out.println(ferrari.ano);
		
		System.out.println("==========================");
		
		System.out.println(uninho.nome);
		System.out.println(uninho.modelo);
		System.out.println(uninho.ano);
	}
}
