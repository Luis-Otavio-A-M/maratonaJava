package maratona.javacore.interfaces.dominio;

public interface DataLoader {
	//podemos criar variáveis nas interfaces
	public static final int VALOR = 10;
	//por default qualquer variável é public static final, logo as duas linhas são iguais
	int VALOR2 = 20;
	
	//isso é igual public abstract void load()
	void load();
	
	//podemos criar métodos static na interface também, e por serem static, eles não podem ser sobrescritos
	static void checkPermissao() {
		System.out.println("Checando a permissão");
	}
	
	
}
