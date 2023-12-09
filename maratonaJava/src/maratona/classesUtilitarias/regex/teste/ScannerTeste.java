package maratona.classesUtilitarias.regex.teste;

import java.util.Scanner;

public class ScannerTeste {
	public static void main(String[] args) {
		String texto = "Levi,Eren,Mikasa,true,200";
		String[] nomes = texto.split(",");
		for (String nome : nomes) {
			System.out.print(nome.trim() + " ");
		}
		System.out.println();

		/*
		 * No caso anterior, a string texto possui chars (obviamente), mas também possui
		 * valores que poderia ser convertidos para outros tipos (boolean, int), mas se
		 * nós quisessemos utilizar esses valores fazendo algum tipo de validação? Podemos
		 * utilizar a classe scanner
		 */
		
		Scanner scanner = new Scanner(texto); //Associamos o texto que deve ser scaniado.
		scanner.useDelimiter(","); //setamos o delimitador que é utilizado para separar os elementos da string (default é " ")
		while(scanner.hasNext()) {// verifico se há próximo elemento a ser percorrido
			if(scanner.hasNextInt()) { //verifica se o próximo elemento percorrido  é int
				System.out.println("Int: " + scanner.nextInt());
			} else if(scanner.hasNextBoolean()) {
				System.out.println("Boolean:" + scanner.nextBoolean());
			} else {
				System.out.println(scanner.next());
			}
		}	
	}
}
