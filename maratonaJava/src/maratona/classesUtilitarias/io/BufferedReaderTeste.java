package maratona.classesUtilitarias.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeste {
	public static void main(String[] args) {
		File file = new File("maratona\\classesUtilitarias\\io\\folder\\bufferedReader.txt");
		try (FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr)){
				String linha;
				while((linha = br.readLine()) != null ) {
					System.out.println(linha);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}
}
