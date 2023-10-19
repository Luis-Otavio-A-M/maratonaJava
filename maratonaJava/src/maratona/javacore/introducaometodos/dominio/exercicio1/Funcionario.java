package maratona.javacore.introducaometodos.dominio.exercicio1;

public class Funcionario {
	private String nome;
	private int idade;
	private float[] salarios;
	private float media = -1;
	
	public void imprimirSalarios() {
		if(salarios == null) {			
			System.out.println("Sem salário");	
			return;
		} 
		
		for(int i = 0; i < salarios.length; i++) {
			if(i == salarios.length - 1) {
				System.out.println(salarios[i]);
			} else {
				System.out.print(salarios[i] + ", ");
			}
		}
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.print("Salários: ");
		imprimirSalarios();
		System.out.println("===========================");	
	}
	
	public void calcularMediaSalarial() {
		if(salarios == null)
			media = -1;
		media = 0;
		for(float salario: salarios) {
			media += salario;
		}
		media /= salarios.length;
	}
	
	public void imprimirMedia() {
		System.out.println("Media salarial: " + (media == -1 ?  "Sem salário" : "R$ " + media));
		System.out.println("===========================");
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
		if(idade < 0)
			return;
		this.idade = idade;
	}

	public float[] getSalarios() {
		return salarios;
	}

	public void setSalarios(float[] salarios) {
		if(salarios.length > 3)
			return;
		this.salarios = salarios;
		calcularMediaSalarial();
	}

	public float getMedia() {
		return media;
	}
	
	
}
