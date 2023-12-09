package maratona.exception.finallyTeste;

import java.io.IOException;
import java.util.Random;

public class Finally {
	private static final Random RANDOM = new Random();
	public static void main(String[] args) {
		try {
			abrirArquivo();		
			System.out.println("Escrevendo no arquivo");
		}catch (Exception e) {
			e.printStackTrace();
			//mesmo com o return, o finally é executado
			return;
		}finally {
			System.out.println("Fechando arquivo");
		}
	
		//Também podemos criar um bloco try/finally
		try {
			escreverArquivo();
		} finally {
			System.out.println("Executando qualquer coisa");
		}
	}
	
	private static void abrirArquivo() throws IOException {
		boolean abriuArquivo = RANDOM.nextBoolean();
		if(abriuArquivo) {
			System.out.println("Abriu arquivo");
		} else {
			throw new IOException("Não abriu arquivo");
		}
	}
	
	private static void escreverArquivo() {
		boolean conseguiuEscrever = RANDOM.nextBoolean();
		if(conseguiuEscrever) {
			System.out.println("Escreveu");
		} else {
			throw new RuntimeException("Não escreveu");
		}
	}
}
