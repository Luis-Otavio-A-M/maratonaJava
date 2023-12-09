package maratona.javacore.interfaces.teste;

import maratona.javacore.interfaces.dominio.DataBaseLoader;
import maratona.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTeste {
	public static void main(String[] args) {
		DataBaseLoader dbLoader = new DataBaseLoader();
		FileLoader fileLoader = new FileLoader();
		dbLoader.load();
		fileLoader.load();

		dbLoader.remove();
		fileLoader.remove();
		
		dbLoader.checkPermission();
		fileLoader.checkPermission();
	}
}
