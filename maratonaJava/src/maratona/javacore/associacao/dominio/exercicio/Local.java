package maratona.javacore.associacao.dominio.exercicio;

public class Local {
	private String endereco;

	public Local(String endereco) {
		this.endereco = endereco;
	}

	public void imprimir() {
		System.out.println(endereco);
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
