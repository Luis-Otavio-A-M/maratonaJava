package maratona.javacore.associacao.teste.exercicio;

import maratona.javacore.associacao.dominio.exercicio.Seminario;

public class Professor {
	private String nome;
	private String especializacao;
	private Seminario[] seminarios;
	
	public Professor(String nome, String especializacao, Seminario[] seminarios) {
		this.nome = nome;
		this.especializacao = especializacao;
		this.seminarios = seminarios;
	}

	public Professor(String nome, String especializacao) {
		this.nome = nome;
		this.especializacao = especializacao;
	}
	
	public void imprimir() {
		System.out.println(nome);
		System.out.println(especializacao);
		if(seminarios != null) {
			for(Seminario seminario: seminarios) {
				System.out.println(seminario.getTitulo());
			}
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
}
