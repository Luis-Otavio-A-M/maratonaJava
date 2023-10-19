package maratona.introducao;

public class Aula15Exercicio3 {
	public static void main(String[] args) {
		//imprimindo todos os números pares de 0 até 1.000.000.
		
		for(int i = 0; i <= 1000000; i+=2) {
			System.out.print(i + ",");
		}
		
		System.out.println();
		int i = 0;
		do {
			System.out.print(i + ",");
			i  += 2;
		}while(i <= 1000000);
		
	}
}
