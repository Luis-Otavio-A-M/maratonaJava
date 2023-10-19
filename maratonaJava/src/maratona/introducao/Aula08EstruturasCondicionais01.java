package maratona.introducao;

public class Aula08EstruturasCondicionais01 {
	public static void main(String[] args) {
		int idade = 20;
		/*
		 * A estrutura condicional if está é associada a um bloco ,"{}", 
		 * que somente é executado se a expressão lógica presenta na invocação da estrutura seja true
		 * */
		if(idade >= 18) { 
			System.out.println("Maior de idade");
		}
		
		// Operador de negação, inverte o resultado lógico, logo, !true == false e !false == true
		if(! (idade >= 18)) {
			System.out.println("Menor de idade");
		}
		
		// Dica, a atribuição tem uma precedência maior caso ela seja usada em uma operação lógica
		boolean verdade = true; 
		boolean falso = false;
		boolean uniao = verdade = false || falso;
		if(!uniao)
			System.out.println("Deu certo");
		
		/*
		 * O bloco else é uma estrutura complementar ao bloco if, onde caso a condição do bloco if seja false, o bloco else é executado
		 */
		if(idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
