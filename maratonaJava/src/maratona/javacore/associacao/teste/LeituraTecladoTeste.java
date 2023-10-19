package maratona.javacore.associacao.teste;

import java.util.Random;
import java.util.Scanner;

public class LeituraTecladoTeste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean resposta;
		Random random = new Random();
		System.out.println("Akineton 2");
		System.out.println("Digite sua pergunta e responderei se é verdade ou mentira.");
		System.out.print("Sua pergunta: ");
		scanner.next();
		resposta = random.nextBoolean();
		if(resposta) {
			System.out.println("É verdade!");
		} else {
			System.out.println("É mentira!");
		}
	}
}
