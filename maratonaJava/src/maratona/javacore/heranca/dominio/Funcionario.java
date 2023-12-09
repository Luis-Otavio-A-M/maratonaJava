package maratona.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
	private double salario;

	static{
		System.out.println("Dentro do bloco de inicialização estático de funcionário");
	}
	
	{
		System.out.println("Dentro do bloco de inicialização de funcionário");
	}
	
	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcionário");
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Salário: " + salario);
		System.out.println("===================");
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
