package maratona.javacore.modificadorfinal.dominio;

public class Carro {
	private String nome;
	public static final double VELOCIDADE_MAXIMA = 250;
	public static final double VELOCIDADE_MINIMA;
	public final Comprador COMPRADOR;
	public final boolean TRUE;
	public final boolean FALSE;
	
	// uma constante estática pode ser inicializada em um bloco estático
	static{
		VELOCIDADE_MINIMA = 0;
	}
	
	{
		// uma constante não estática pode ser inicializada pelo bloco de inicialização ou no construtor
		TRUE = true;
	}
	
	public Carro(Comprador comprador) {
		FALSE = false;
		//Para constante de objetos, como foi mencionado, é possível defini-la no construtor;
		COMPRADOR = comprador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public final void teste() {
		
	}
}
