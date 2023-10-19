package maratona.introducao;

public class Aula19ArraysMultiDimensionais {
	public static void main(String[] args) {
		int[][] matriz = new int[3][];

		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = new int[(i + 1) * 2];
		}

		int cont = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = cont++;
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("========================================");

		// usando o for each em um array multidimensional
		for (int[] vetor : matriz) {
			for (int celula : vetor) {
				System.out.print(celula + " ");
			}
			System.out.println();
		}

		// Inicializando arrays multidimensionais
		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] matriz3 = new int[][] { { 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		System.out.println("========================================");

		for (int[] vetor : matriz2) {
			for (int celula : vetor) {
				System.out.print(celula + " ");
			}
			System.out.println();
		}
		System.out.println("========================================");
		for (int[] vetor : matriz3) {
			for (int celula : vetor) {
				System.out.print(celula + " ");
			}
			System.out.println();
		}
	}
}
