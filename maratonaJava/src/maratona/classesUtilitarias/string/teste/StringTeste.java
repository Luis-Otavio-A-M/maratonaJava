package maratona.classesUtilitarias.string.teste;

public class StringTeste {
	public static void main(String[] args) {
		/*
		 * No Java, Strings são imutáveis, assim, criado uma String a mesma não pode ser mais alterada. 
		 * No exemplo abaixo, foi criado a String "Luis", que foi alocada
		 * no pool String (explicação sobre mais abaixo) o método toUpperCase foi
		 * invocado, mas por String serem imutáveis, é gerada uma nova String em um
		 * outro endereço de memório, que necessita se referenciada por uma variável
		 * para ser acessada.
		 */
		String nome = "Luis";
		nome.toUpperCase(); // Percebe que a partir de agora, existem 2 strings: "Luis" e "LUIS", as strings nunca são "destruídas".
		System.out.println(nome);
		nome = nome.toUpperCase();
		System.out.println(nome);

		/*
		 * String Constant Pool: no Java, as Strings literais ficam armazenadas no Pool String, que é um espaço criado no heap,
		 * que serve como um ambiente para encapsular todos literais strings.
		 * Essa estratégia de Pool String é utilizada para evitar a criação de objetos duplicados. (Como assim?)
		 * Quando é criado uma String, ela é armazenada no Pool String e a variável de referência receberá o
		 * endereço em memória da String.
		 * Caso seja criada uma segunda variável que iria receber uma String igual a primeira, invés de criar um novo objeto
		 * em memória, é retornado o valor do endereço da string já existente (Por isso a string deve ser imutável).
		 * 
		 */
		
		nome = "Luis";
		String nome2 = "Luis"; //é a mesma coisa de String nome2 = nome;
		System.out.println(nome == nome2);
		
		/*
		 * Agora, quando instaciamos uma string explicitamente, ocorre um processo diferente do anterior.
		 * Invés de apontar diretamente para o espaço em memória no Pool String, é criado um objeto no heap
		 * (fora do Pool String), e nesse objeto tem uma referência para o espaço em memória da String.
		 * Seria um processo análogo ao Wrapper dos tipos primitivos (não é uma afirmação técnica isso, só meramente ilustrativa),
		 * onde a referência a string é encapsulada em um objeto.
		 */
		
		String nome3 = new String(nome);
		//a linha abaixo retornará false, porque nome aponta para o valor literal no Pool String, enquanto nome3 aponta para um objeto 
		//no heap, e esse objeto que aponta para o valor no Pool String.
		System.out.println(nome == nome3); 
		//Para acessar o valor literal no Pool String, utilizamos o método intern
		System.out.println(nome == nome3.intern());
	}
}
