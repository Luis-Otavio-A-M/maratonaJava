package maratona.javacore.enumeracao.dominio;

public class Cliente {
	private String nome;
	// Queremos que o tipo seja PESSOA_FISICA e PESSOA_JURIDICA
	// Como fazer essa validação, para que não seja passada qualquer String?
	private String tipo;

	// A resposta mais simples é, criar constantes contendo os valores que aceitamos
	public static final String PESSOA_FISICA = "PESSOA_FISICA";
	public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

	public Cliente(String nome, String tipo) {
		// E aqui validamos se o que foi passado está correto ou não
		if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA))
			return;
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		// validamos aqui também
		if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA))
			return;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo=" + tipo + "]";
	}

}
