package maratona.classesUtilitarias.string.teste;

public class StringPerformaceTeste {
	public static void main(String[] args) {
		long inicio, fim;
		
		inicio = System.currentTimeMillis();
		concatenarString(100_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo para concatenar strings da classe String: " + (fim-inicio) + "ms\n\n");

		inicio = System.currentTimeMillis();
		concatenarStringBuilder(100_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo para concatenar strings da classe StringBuilder: " + (fim-inicio) + "ms\n\n");

		inicio = System.currentTimeMillis();
		concatenarStringBuffer(100_000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo para concatenar strings da classe StringBuffer: " + (fim-inicio) + "ms\n\n");
	}
	
	private static void concatenarString(int tamanho) {
		String texto = "";
		for(int i = 0; i < tamanho; i++) {
			texto += i;
		}
	}
	
	private static void concatenarStringBuilder(int tamanho) {
		//String Builder é uma classe nova, utilizada para aumentar o desempenho das operações envolvendo um grande volume de string.
		//Não podemos atribuir valores literias diretamente na variável, é necessário instanciar um objeto.
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < tamanho; i++) {
			builder.append(i);
		}
	}
	
	private static void concatenarStringBuffer(int tamanho) {
		//String buffer é utilizada em ambientes de concorrência, onde os métodos desta classe evitam inconcistência nos dados
		//Entretanto, o processamento dos métodos é mais lento em comparação ao StringBuilder
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < tamanho; i++) {
			buffer.append(i);
		}
	}
}
