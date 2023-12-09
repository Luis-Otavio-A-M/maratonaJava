package maratona.classesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAtributtesTeste {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("home/dos.txt");
		if(Files.deleteIfExists(path)) {
			Files.delete(path);
		}
		if(Files.notExists(path)) {
			Files.createFile(path);
			Files.setAttribute(path, "dos:hidden", true);	
			Files.setAttribute(path,"dos:readonly",true);
			
		}
		/*
		 * Utilizando o DosFileAtributtes para acessar os atributos em um sistema DOS
		 */
		DosFileAttributes dfa = Files.readAttributes(path, DosFileAttributes.class);
		System.out.println("Is hidden: " + dfa.isHidden());
		System.out.println("Is read only: " + dfa.isReadOnly());
		
		/*
		 * Utilizando o DosFileAtributtesView para alterar os atributos de um arquivo.
		 */
		
		DosFileAttributeView dfaw = Files.getFileAttributeView(path, DosFileAttributeView.class);
		dfaw.setHidden(false);
		dfaw.setReadOnly(false);
		
		dfa = Files.readAttributes(path, DosFileAttributes.class); //atualizando o dfa, após alteração dos atributos
		System.out.println("Is hidden: " + dfa.isHidden());
		System.out.println("Is read only: " + dfa.isReadOnly());
	}
}
