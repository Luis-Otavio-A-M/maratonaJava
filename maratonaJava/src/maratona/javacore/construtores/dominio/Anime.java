package maratona.javacore.construtores.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;
	
	public Anime() {
		
	}
	
	public Anime(String nome, String tipo, int episodios, String genero) {
		this();
		init(nome, tipo, episodios, genero);
	}
	
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);
		this.estudio = estudio;
	}
	
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
	}
	
	public void init(String nome, String tipo, int episodios, String genero) {
		init(nome, tipo, episodios);
		this.genero = genero;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Episódios: " + episodios);
		System.out.println("Gênero: " + genero);
		System.out.println("Estúdio: " + estudio);
		System.out.println("============================");
	}

}
