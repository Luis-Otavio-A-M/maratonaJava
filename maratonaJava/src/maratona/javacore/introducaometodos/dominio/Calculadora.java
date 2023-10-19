package maratona.javacore.introducaometodos.dominio;

public class Calculadora {
	public void somar() {
		System.out.println(10 + 10);
	}
	
	public void subtrair() {
		System.out.println(30 - 5);
	}
	
	public void multiplicar(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double dividir(double n1, double n2) {
		if(n2 == 0)
			return 0;
		return n1 / n2;
	}
	
	public void imprimirDivisao(double n1, double n2) {
		if(n2 == 0) {
			System.out.println("Nao existe divisão por zero");
			return ;
		}
		System.out.println(n1/n2);
	}
	
	public void alterarNumeros(int n1, int n2) {
		n1 = 1;
		n2 = 2;
		System.out.println("Dentro do alterarNumeros: n1: " + n1 + " n2: " + n2);
	}
	
	public void imprimirSomaArray(int[] array) {
		int soma = 0;
		for(int num: array) {
			soma += num;
		}
		System.out.println(soma);
	}
	
	public void imprimirSomaVarArgs(int ...numeros) {
		int count = 0;
		for(int numero:numeros) {
			count += numero;
		}
		
		System.out.println(count);
	}
}
