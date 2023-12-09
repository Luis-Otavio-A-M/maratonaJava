package maratona.javacore.classesabstratas.dominio;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	// Métdos abstracts são métodos que não possuem implementação
	// sendo responsabilidade das classes filhas implementá-lo (obrigatoriamente)
	//Obviamente um método abstract só pode ser criado em uma classe abstract, 
	//pois se não, uma classe concreta poderia chamar o método, o que não faria sentido semântico
	public abstract void reajustarSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
