package maratona.javacore.sobrescrita.dominio;

public class Anime {
	private String nome;
	
	public Anime(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Sobrescrevendo o método toString
	@Override
	public String toString() {
		return "Anime [nome=" + nome + "]";
	}
	
	
}
