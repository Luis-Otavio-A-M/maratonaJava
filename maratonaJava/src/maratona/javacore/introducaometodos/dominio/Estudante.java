package maratona.javacore.introducaometodos.dominio;

public class Estudante {
	public String nome;
	public int idade;
	public char sexo;
	
	public void imprimirEstudante() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(sexo);
		System.out.println("====================");
	}
}
