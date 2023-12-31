package maratona.javacore.blocosDeInicializacao.dominio;

public class Anime2 {
	private String nome;
	private int[] episodios;

	public Anime2() {
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i+1;
		}
	}

	/*
	 * Neste caso, se for necessário que o array episodios fosse inicializado com o
	 * valor padrão de [1, 100] Teria que se feito o for para cada construtor que
	 * fosse criado. Poderia se utilizar uma função para não necessitar reescrever
	 * código (igual a função preencherArray), entretando, ainda sim, seria
	 * necessário invocar essa função em cada construtor.
	 * 
	 */
	public Anime2(String nome) {
		this.nome = nome;
	}

	public void preencherArray() {
		if (episodios == null) {
			episodios = new int[100];
		}
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i++;
		}
	}

	/**
	 * Nos casos onde é necessário que um determinado trecho de código seja
	 * executado na instanciação do objeto, independente do construtor, é possível
	 * usar um bloco de inicialização. Esse bloco é executado antes do construtor,
	 * independente do construtor que foi invocado, mesmo estando "abaixo" dos
	 * construtores, entretanto, a norma é deixar o bloco no início da classe.
	 */

	{
		if (episodios == null) {
			episodios = new int[100];
		}
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i+1;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}
	
}
