package maratona.javacore.associacao.dominio;

public class Jogador {
	// Associação 1-N, onde um time é composto por vários jogadores, mas um jogador pertence a somente um time
	private Time time; 
	private String nome;

	public Jogador(String nome, Time time) {
		this.nome = nome;
		this.time = time;
	}
	
	public Jogador(String name) {
		this.nome = name;
	}
	public void imprimir() {
		System.out.println("===================================");
		System.out.println(nome);
		if(time != null) {
			System.out.println(time.getNome());			
		}
		System.out.println("===================================\n");
	}
	

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
