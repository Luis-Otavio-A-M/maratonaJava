package maratona.javacore.interfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove  {

	@Override
	public void load() {
		System.out.println("carregando dados do banco de dados");
	}

	@Override
	public void remove() {
		System.out.println("Removendo dados do banco de dados");
	}

}
