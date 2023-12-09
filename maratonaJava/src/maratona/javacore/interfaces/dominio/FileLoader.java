package maratona.javacore.interfaces.dominio;

// uma classe pode implementar mais de uma interface, diferentemente do que ocorre no extends
public class FileLoader implements DataLoader, DataRemove {

	@Override
	public void load() {
		System.out.println("Carregando dados do arquivo");
	}

	@Override
	public void remove() {
		System.out.println("Removendo dados do arquivo");
	}
	
	@Override
	public void checkPermission() {
		System.out.println("Verificamdo permissão do arquivo");
	}

}
