package maratona.javacore.modificadoresEstaticos.dominio;

public class Carro2 {
	private String nome;
	private double velocidadeMaxima;
	private double velocidadeLimite1 = 250;
	
	public Carro2(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void imprimirInfos() {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("Nome: " + nome);
		System.out.println("Velocidade Máxima: " + velocidadeMaxima);
		System.out.println("Velocidade Limite1: " + velocidadeLimite1);
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
	public double getVelocidadeLimite1() {
		return velocidadeLimite1;
	}
	public void setVelocidadeLimite1(double velocidadeLimite1) {
		this.velocidadeLimite1 = velocidadeLimite1;
	}
	
	
}
