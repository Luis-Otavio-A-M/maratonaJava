package maratona.javacore.modificadorfinal.dominio;

/*
 *  final relacionado a class impede que a classe seja herdada por outras classe
 *  assim, aquela se torna uma classe "final"
 */
public final class Ferrari extends Carro {
	public Ferrari(Comprador comprador) {
		super(comprador);
	}
	
	/*
	 * O final relacionado a métodos, impede que o método seja sobrescrito por uma
	 * classe filha, nesse caso não faz diferença, porque a classe já é final, 
	 * mas em uma classe não final, a classe filha não poderia sobrescrever este método.
	 * Logo a linha comentada abaixo daria erro
	 */
	
	//public final void teste() {}
	
	public final void teste2() {
		
	}
}
