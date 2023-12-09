package maratona.classesUtilitarias.serializacao.dominio;

import java.io.Serializable;

public class ObjetoSerializado extends ObjetoSerializadoPai implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private transient String password;
	
	public ObjetoSerializado(Long id, String nome, String password) {
		this.id = id;
		this.nome = nome;
		this.password = password;
	}
	
	public ObjetoSerializado() {
		super();
		System.out.println("Dentro da classe filha");
	}

	@Override
	public String toString() {
		return "ObjetoSerializado [id=" + id + ", nome=" + nome + ", password=" + password + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
