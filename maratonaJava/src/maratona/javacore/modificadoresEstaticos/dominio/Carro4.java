package maratona.javacore.modificadoresEstaticos.dominio;

public class Carro4 {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite2 = 250;
	private static double[] viagens;

	/*
	 * Bloco de inicialização estático: Igual ao bloco de inicialização, entretanto,
	 * o mesmo só é executado uma única vez, quando a JVM carrega a classe, não
	 * sendo necessário processar o trecho de código múltiplas vezes. Caso haja mais
	 * de um bloco de inicialização estático, a execução ocorre na ordem que foi
	 * definida no código(up-down).
	 */
	{
		System.out.println("Teste 0");
		/*
		 * Pode ser usado blocos de inicialização não estáticos também, mas é importante
		 * lembra que eles são executados após os blocos estáticos, mesmo sendo
		 * definidos antes no código.
		 */
	}
	static {
		System.out.println("Teste 1");
		viagens = new double[10];
		for (int i = 0; i < viagens.length; i++) {
			viagens[i] = i;
		}
	}
	static {
		System.out.println("Teste 2");
	}

	public Carro4(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static double getVelocidadeLimite2() {
		return velocidadeLimite2;
	}

	public static void setVelocidadeLimite2(double velocidadeLimite2) {
		Carro4.velocidadeLimite2 = velocidadeLimite2;
	}

}
