package maratona.javacore.introducaometodos.dominio;

/*
 * modificadores de acesso e métodos de acesso (get, set)
*/
public class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade < 0) {
			return;
		}
		this.idade = idade;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: "+idade);
	}
}
