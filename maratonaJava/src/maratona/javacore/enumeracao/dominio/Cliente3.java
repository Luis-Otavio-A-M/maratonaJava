package maratona.javacore.enumeracao.dominio;

public class Cliente3 {
	// Podemos criar enum dentro de classes
	public enum TipoPagamento {
		DEBITO(1){
			@Override
			public double calcularDesconto(double valor) {
				return valor * 0.9;
			}
		}, CREDITO(2){
			@Override
			public double calcularDesconto(double valor) {
				return valor * 0.05;
			}
		};

		private int valor;

		private TipoPagamento(int valor) {
			this.valor = valor;
		}

		public int getValor() {
			return valor;
		}
		
		public abstract double calcularDesconto(double valor);
	}

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public Cliente3(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	public double calcularPagamento(double valor) {
		return tipoPagamento.calcularDesconto(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente3 [nome=" + nome + ", tipoCliente=" + tipoCliente + ", tipoPagamento=" + tipoPagamento
				+", tipoPagamento.VALOR=" + tipoPagamento.getValor() + "]";
	}

}
