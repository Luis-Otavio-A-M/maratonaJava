package maratona.classesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste {
	public static void main(String[] args) {
		Path path = Paths.get("./");
		try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
			for(Path caminho:directoryStream) {
				System.out.println(caminho);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
