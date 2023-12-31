package maratona.javacore.associacao.dominio.exercicio;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno(String nome, int idade, Seminario seminario) {
		this.nome = nome;
		this.idade = idade;
		this.seminario = seminario;
	}

	public void imprimri() {
		System.out.println("==================");
		System.out.println(nome);
		System.out.println(idade);
		if(seminario != null) {
			System.out.println(seminario.getTitulo());			
		}
		System.out.println();
	}

	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		if(seminario != null) {
			System.out.println("Semináio: " + seminario.getTitulo());			
		}
		System.out.println();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	
	
}
