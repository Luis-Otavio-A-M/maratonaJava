package maratona.javacore.introducaometodos.dominio;

public class ImpressoraEstudante {
	public void imprimirEstudante(Estudante e) {
		System.out.println(e.nome);
		System.out.println(e.idade);
		System.out.println(e.sexo);
		e.nome = "Alterando o atributo da referencia";
	}
}
