package maratona.classesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class JavaClassFileVisitor extends SimpleFileVisitor<Path>{ 
	private PathMatcher pathMatcher;
	
	public JavaClassFileVisitor() {
		String glob = "glob:**/*Teste**.{java,class}";
		pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
	}
	
	public JavaClassFileVisitor(String glob) {
		pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
		
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(pathMatcher.matches(file)) {
			System.out.println(file.getFileName());			
		}
		return FileVisitResult.CONTINUE;
	}
}

public class PathMatcherTeste2 {
	public static void main(String[] args) {
		Path path = Paths.get(".\\");
		try {
			Files.walkFileTree(path, new JavaClassFileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
