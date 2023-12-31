package maratona.javacore.modificadoresEstaticos.dominio;

public class Carro3 {

	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite2 = 250;
	
	public Carro3(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void imprimirInfos() {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("Nome: " + nome);
		System.out.println("Velocidade Máxima: " + velocidadeMaxima);
		System.out.println("Velocidade Limite2: " + velocidadeLimite2);
		System.out.println("++++++++++++++++++++++++++");
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
		return Carro3.velocidadeLimite2;
	}
	public static void setVelocidadeLimite2(double velocidadeLimite2) {
		Carro3.velocidadeLimite2 = velocidadeLimite2;
	}
	
}
