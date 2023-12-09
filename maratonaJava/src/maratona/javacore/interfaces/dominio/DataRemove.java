package maratona.javacore.interfaces.dominio;

public interface DataRemove {
	void remove();
	//A parti do java 8 é possível implementar métodos concretos em uma inteface
	default void checkPermission() {
		System.out.println("Verificando permissão");
	}
}
