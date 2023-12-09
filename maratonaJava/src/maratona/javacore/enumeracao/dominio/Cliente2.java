package maratona.javacore.enumeracao.dominio;

public class Cliente2 {
	private String nome;
	private TipoCliente tipo;

	public Cliente2(String nome, TipoCliente tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente2 [nome=" + nome + ", tipo=" + tipo + "]";
	}

}
