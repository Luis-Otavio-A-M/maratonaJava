package maratona.javacore.classesabstratas.dominio;

public class Gerente extends Funcionario{
	private String setor;
	
	public Gerente(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + getNome() + ", salario=" + getSalario() + ", setor=" + setor + "]";
	}

	@Override
	public void reajustarSalario() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
