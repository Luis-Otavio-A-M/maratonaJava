package maratona.classesUtilitarias.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste {
	public static void main(String[] args) {
		File file = new File("maratona\\classesUtilitarias\\io\\folder\\bufferedWriter.txt");
		try(FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw)){
			for(int i = 1; i <= 100000; i++) {
				bw.write("Testando " + i + System.lineSeparator());				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
