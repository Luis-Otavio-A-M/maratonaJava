package maratona.classesUtilitarias.string.teste;

public class StringTeste2 {
	public static void main(String[] args) {
		// principais métodos
		String nome = "Otávio";
		// retorna o char na posição informada. Caso o valor informado seja >= lenght,
		// será lançado a falha StringIndexOutBoundsException
		System.out.println(nome.charAt(0));
		
		//retorna o tamanho da string
		System.out.println(nome.length());
		
		//substitui a aparição de um char por outro
		System.out.println(nome.replace('v', 'r'));
		
		//Maiúsculo e minúsculo
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
		//Fatiamento de string
		System.out.println(nome.substring(0, 3)); //onde o primeiro índice é inclusivo e o segundo é exclusivo.
		
		//Removendo espaços em branco no começo e final da string
		nome = "           Luis      " + nome + "                ";
		System.out.println(nome.trim());
	}
}
