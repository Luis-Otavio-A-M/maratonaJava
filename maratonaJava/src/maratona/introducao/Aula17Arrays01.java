package maratona.introducao;

public class Aula17Arrays01 {
	public static void main(String[] args) {
		/*
		 * Declarando array:
		 * primeiro inicia com o tipo do array acompanhado do "[]" e o nome
		 * como arrays são variáveis de referência, então é necessário instanciar um objeto array e associar a variável a esse objeto
		 */
		int[] vetor = new int[5];
		
		vetor[0] = 2;
		vetor[1] = 5;
		
		
		System.out.println(vetor[0] + " , " + vetor[1] + " , " + vetor[2]);
		/*
		 * As posições dos array inicializam com um valor padrão, no caso dos tipos:
		 * byte, short, int, long, float, double o valor default é 0
		 * no caso char, o valor é '\u0000' é o char null
		 * no caso de boolean, o valor é false
		 * no caso de objetos, o valor é null 
		 */
		
		char[] vetorChar = new char[3];
		System.out.println(vetorChar[0] == '\u0000');
		
		boolean[] vetorBoolean = new boolean[3];
		System.out.println(vetorBoolean[0]);
		
		String[] vetorString = new String[5];
		System.out.println(vetorString[0] == null);
	}
}
