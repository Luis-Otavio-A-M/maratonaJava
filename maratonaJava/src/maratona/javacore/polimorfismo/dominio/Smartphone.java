package maratona.javacore.polimorfismo.dominio;

public class Smartphone extends Produto{
	private static final double IMPOSTO_POR_CENTO = 0.1;
	private int anoLancamento;
	
	public Smartphone(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		return getValor() * IMPOSTO_POR_CENTO;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
}
