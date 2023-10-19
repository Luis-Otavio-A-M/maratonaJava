package maratona.javacore.introducaometodos.teste;

import maratona.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somar();
		calculadora.subtrair();
		calculadora.multiplicar(5, 7);
		double quociente = calculadora.dividir(6, 9);
		System.out.println(quociente);
		System.out.println(calculadora.dividir(3, 0));
		calculadora.imprimirDivisao(10, 6);
		calculadora.imprimirDivisao(10, 0);
		
		int n1 = 10, n2 = 20;
		calculadora.alterarNumeros(n1, n2);
		System.out.println("Fora do método alterarNumeros n1: " + n1 + " n2: " + n2);
		
		int[] numeros = {1,2,3,4,5};
		calculadora.imprimirSomaArray(numeros);
		calculadora.imprimirSomaVarArgs(numeros);
		calculadora.imprimirSomaVarArgs(1,2,3,4,5,6);
	}
}
