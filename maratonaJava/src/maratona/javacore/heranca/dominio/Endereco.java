package maratona.javacore.heranca.dominio;

public class Endereco {
	private String rua;
	private String cep;
	
	public void imprimir() {
		System.out.println("==== Endereço ====");
		System.out.println("Rua: " + rua);
		System.out.println("CEP: " + cep);
		System.out.println("==================");
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
