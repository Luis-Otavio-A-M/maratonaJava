package maratona.classesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)  {
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}
}

class ListAllFilesJava extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// minha solução
		String fileString = file.getFileName().toString();
		String fileStringArray[] = fileString.split("\\.");
		String extensaoFile = fileStringArray[fileStringArray.length - 1];
		if(extensaoFile.equals("java")) {
			System.out.println(fileString);
		}
		return FileVisitResult.SKIP_SUBTREE;
		
		/*
		 * Solução do curso seria:
		 * if(file.endsWith(".java"))
		 */
	}
}

public class SimpleFileVisitorTeste {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".");
		//Files.walkFileTree(path, new ListAllFiles());
		Files.walkFileTree(path, new ListAllFilesJava());
		
		Path path2 = Paths.get("home/arquivo.java");
		System.out.println(path2.endsWith("java")); //isso aqui retorna false
		System.out.println(path2.endsWith("arquivo.java")); //isso aqui retorna true, esse withEnds verifica final do caminho, ou seja, o nome da pasta/arquivo
	}
}
