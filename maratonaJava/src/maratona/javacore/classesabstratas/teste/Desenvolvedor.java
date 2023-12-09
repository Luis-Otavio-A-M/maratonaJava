package maratona.javacore.classesabstratas.teste;

import maratona.javacore.classesabstratas.dominio.Funcionario;

public class Desenvolvedor extends Funcionario {
	private String linguagemFavotira;
	
	public Desenvolvedor(String nome, double salario, String linguagemFavotira) {
		super(nome, salario);
		this.linguagemFavotira = linguagemFavotira;
	}

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}
	
	public String getLinguagemFavotira() {
		return linguagemFavotira;
	}

	public void setLinguagemFavotira(String linguagemFavotira) {
		this.linguagemFavotira = linguagemFavotira;
	}

	@Override
	public String toString() {
		return "Desenvolvedor [nome()=" + getNome() + ", salario()=" + getSalario() + ", linguagemFavotira="
				+ linguagemFavotira + "]";
	}

	@Override
	public void reajustarSalario() {
		// TODO Auto-generated method stub
		
	}

	
}
