package maratona.javacore.enumeracao.dominio;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"), 
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	private int valor;
	private String nome;
	
	private TipoCliente(int valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	public static TipoCliente getTipoClienteByValor(int valor) {
		for(TipoCliente tipoCliente: TipoCliente.values()) {
			if(tipoCliente.getValor() == valor) {
				return tipoCliente;
			}
		}
		return null;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
