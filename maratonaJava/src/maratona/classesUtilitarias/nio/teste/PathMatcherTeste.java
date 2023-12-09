package maratona.classesUtilitarias.nio.teste;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste {
	public static void main(String[] args) {
		Path pathBkp = Paths.get("pasta/subPasta/file.bkp");
		Path pathTxt = Paths.get("pasta/subPasta/file.txt");
		Path pathJava = Paths.get("pasta/subPasta/file.java");
		
		matches(pathBkp, "glob:*.bkp");
		matches(pathBkp, "glob:**.bkp");
		System.out.println();
		
		matches(pathBkp, "glob:**.{bkp,txt,java}");
		matches(pathTxt, "glob:**.{bkp,txt,java}");
		matches(pathJava, "glob:**.{bkp,txt,java}");
		System.out.println();
		
		matches(pathBkp, "glob:**.???");
		matches(pathJava, "glob:**.???");
		matches(pathTxt, "glob:**.???");
		System.out.println();
		
		matches(pathBkp, "glob:**/file.*");
		matches(pathJava, "glob:**/file.*");
		matches(pathTxt, "glob:**/file.*");
	}
	
	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(glob + ": " + matcher.matches(path));
	}
}