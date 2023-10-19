package maratona.introducao;

public class Aula04OperadoresAritmeticos {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num2 - num1); //subtração
		System.out.println(num2 + num1); //adição
		
		//Sobrecarga do operador "+"
		System.out.println("Teste" + num1 + num2); // Teste1020
		System.out.println(  num1 + num2 + "Teste"); //30Teste
		
		/*
		 * No primeiro caso, como a expressão é avaliada da esquerda para direita, quando o compilador percebe que o operador "+"
		 * está operando sobre uma string, todas operações feitas por esse operador serão concatenação nesta expressão
		 * No segundo caso, como a primeira operação foi feita entre dois números, o operador se comporta como adição, só depois de 
		 * operar sobre a string que o mesmo se torna uma concatenação
		 * */
		
		System.out.println(num1 * num2); //multiplicação
		
		//Divisão
		System.out.println(num1 / num2); 
		/* 
		 * Resposta 0, por quê? Como são 2 números inteiros, a operação faz uma divisão de números com 
		 * resultado dentro do conjunto dos números inteiros (divisão inteira) 
		*/
		
		System.out.println(((float) num1 / num2));
		/*
		 * Resposta 0.5, neste caso, como um dos valores era um número real, toda a operação foi feita dentro do conjunto dos números reais 
		 */
		
		System.out.println(num1 % num2); // Resto da divisão
		
		/*
		 * Caso um dos números seja real, a resposta será o resto da divisão normalmente, só que como real, que seria equivalente
		 * a uma sequência de subtrações do segundo opereando no primeiro, até chegar a um número menor que o segundo operando.
		*/
		float num3 = 10.75f;
		float num4 = 10.25f;
		System.out.println(num3 % num4);
	}
}
