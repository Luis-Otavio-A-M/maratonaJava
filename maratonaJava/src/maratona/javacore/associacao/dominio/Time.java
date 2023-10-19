package maratona.javacore.associacao.dominio;

public class Time {
	private String nome;
	//Associacao N-1, onde várioes jogadores podem atuar por só um time
	//como há referência em ambos objetos, essa é uma associação bidimensional
	private Jogador[] jogadores;
 	public Time(String nome) {
		this.nome = nome;
	}
 	
 	public Time(String nome, Jogador[] jogadores) {
 		this(nome);
 		this.jogadores = jogadores;
 	}

 	public void imprimir() {
 		System.out.println("============================");
 		System.out.println(nome);
 		if(jogadores != null) {
 			for(Jogador jogador: jogadores) {
 				System.out.println(jogador.getNome());
 			}
 		}
 		System.out.println("============================\n");
 		
 	}
 	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
}
