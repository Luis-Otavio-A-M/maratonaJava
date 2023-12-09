package maratona.classesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilesAtributtesTeste {
	public static void main(String[] args) throws IOException {
		/*
		 * Essa classe não roda no windows, meu SO, só roda
		 * em ambientes Posix, por isso não execute o código.
		 */
		Path path = Paths.get("home/user/dev/temp.txt"); 
		PosixFileAttributes pfa = Files.readAttributes(path, PosixFileAttributes.class);
		System.out.println(pfa.permissions());
		String stringPermissions = "rw-rw-rw";
		Set<PosixFilePermission> newPermissions = PosixFilePermissions.fromString(stringPermissions);
		
		PosixFileAttributeView pfaw = Files.getFileAttributeView(path, PosixFileAttributeView.class);
		pfaw.setPermissions(newPermissions);
	}
}
