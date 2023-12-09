package maratona.classesUtilitarias.io;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTeste {
	public static void main(String[] args) {
		File diretorio = new File("maratona\\classesUtilitarias\\io\\folder\\subFolder");
		if(!diretorio.exists()) {
			//criando uma pasta
			diretorio.mkdir();
		}
		
		// Criando arquivos no diretório:
		File arquivo = new File(diretorio.getAbsolutePath() + File.separator + "arquivo.txt");
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File arquivo2 = new File(diretorio,"arquivo2.txt");
		if(!arquivo2.exists()) {
			try {
				arquivo2.createNewFile();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Renomeando arquivos (so renomeia se o arquivo não existir anteriormente):
		File arquivoRenomeado = new File(diretorio, "arquivoRenomeado.txt");
		arquivo.renameTo(arquivo2);
	}
}
