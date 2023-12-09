package maratona.classesUtilitarias.nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class BasisFileAtributtesTeste {
	public static void main(String[] args) throws IOException {
		/*
		 * BasicFileAtributtes: Uma interface que dar suporte para alterar atributos de um arquivo
		 * independete do sistema operacional.
		 * 
		 * DosFileAtributtes: Um classe que implementa o BasicFilesAtributtes, para os sistemas operacionais
		 * baseados em DOS.
		 * 
		 * PosixFileAtributtes: Uma classe que implementa o BasicFileAtributtes, para sistemas operacionais baseados em Posix.
		 */

		
		/*
		 * Alterando a última modificação de um arquivo utilizando o pacote io
		 */
		File file = new File("home/nome.txt");
		LocalDateTime date = LocalDateTime.now().minusDays(10);
		boolean isCreated = file.createNewFile();
		System.out.println("Arquivo foi criado: " + isCreated);
		boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
		System.out.println("A data da última alteração foi alterada: " + isModified);

		/*
		 * Alterando a última modificação de um arquivo utilizando o pacote nio
		 */
		Path path = Paths.get("home/novo.txt");
		if (Files.notExists(path)) {
			Files.createFile(path);
		}
		// Para alteramos a data da modificação, podemos utilizar uma classe de tempo específica para os arquivos.
		FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
		Files.setLastModifiedTime(path, fileTime);
		
		System.out.println(Files.isWritable(path)); //Retorna se o arquivo/diretório permite ser escrito.
		System.out.println(Files.isReadable(path)); //Retorna se o arquivo/diretório permite leitura
		System.out.println(Files.isExecutable(path)); //Retorna se o arquivo/diretório permite ser executado, se a JVM tem as permissões para isso.
		
	}
}
