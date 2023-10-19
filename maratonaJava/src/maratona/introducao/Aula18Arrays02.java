package maratona.introducao;

public class Aula18Arrays02 {
	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "A";
		nomes[1] = "B";
		nomes[2] = "C";
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		// inicializando um vetor com valores
		int[] numeros = {1,2,3};
		int[] numeros2 = new int[] {1,2,3};
		
		//for each em array
		
		for(int numero: numeros) {
			System.out.println(numero);
		}		
	}
}
