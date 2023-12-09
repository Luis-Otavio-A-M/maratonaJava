package maratona.classesUtilitarias.string.teste;

public class StringBuilderTeste {
	public static void main(String[] args) {
		//podemos criar um objeto a partir de um construtor sem parâmetros, onde será alocado 16 posições para a String que será armazenada.
		StringBuilder nome = new StringBuilder(); 
		
		//diferente da String, podemos usar métodos que alterar o valor da StringBuilder, não sendo criado uma nova String na String Constant Pool
		nome.append("Luís Otávio");
		System.out.println(nome);
		nome.reverse();
		System.out.println(nome);
		nome.reverse();
		
		//Mas há alguns métodos onde a string original não é alterada. 
		// No geral, os métodos que retorna String não alteram o valor da String original.
		// Os que retornam StringBuilder alteram a própria String.
		nome.substring(0, 4);
		System.out.println(nome);
	}
}
