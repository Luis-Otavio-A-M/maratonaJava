package maratona.javacore.polimorfismo.dominio;

public class Computador extends Produto {
	private static final double IMPOSTO_POR_CENTO = 0.20;
	
	
	public Computador(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		return getValor() * IMPOSTO_POR_CENTO;
	}
	
	
	

}
