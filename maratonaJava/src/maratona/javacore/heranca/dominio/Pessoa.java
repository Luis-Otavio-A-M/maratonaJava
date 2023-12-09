package maratona.javacore.heranca.dominio;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	static{
		System.out.println("Dentro do bloco de inicialização estático de pessoa");
	}
	
	{
		System.out.println("Dentro do bloco de inicialização de pessoa");
	}
	
	public Pessoa(String nome) {
		System.out.println("Dentro do construtor de pessoa");
		this.nome = nome;
	}
	
	public void imprimir() {
		String[] aux = getClass().getName().split("\\.");
		String nomeClasse = aux[aux.length-1];
		System.out.println("=== " + nomeClasse + " ===");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		if(endereco != null)
			endereco.imprimir();
		System.out.println("==================");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
