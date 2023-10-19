package maratona.introducao;

public class Aula14EstruturasDeRepeticao {
	public static void main(String[] args) {
		int cont = 0;
		
		while(cont < 10) {
			System.out.println(cont++);
		}
		
		System.out.println("============================");
		
		do {
			System.out.println(cont++);
		}while(cont < 10);

		System.out.println("============================");
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i);
		}
	}
}
