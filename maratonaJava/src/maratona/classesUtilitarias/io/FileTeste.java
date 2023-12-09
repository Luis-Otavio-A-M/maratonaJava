package maratona.classesUtilitarias.io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import javax.swing.text.DateFormatter;

public class FileTeste {
	public static void main(String[] args) {
		/*
		 * É necessário informar o caminho absoluto onde se deseja salvar o arquivo,
		 * onde a "pasta raiz" é o src
		 */
		File file = new File("maratona\\classesUtilitarias\\io\\folder\\arquivo.txt");
		File file2 = new File("maratona\\classesUtilitarias\\io\\folder\\arquivo2.txt");
		File directory = new File("maratona\\classesUtilitarias\\io\\folder");
		try {
			/*
			 * createNewFile cria um arquivo, caso o arquivo não exista, e retorna true.
			 * caso o arquivo já exista, ele retorna false.
			 */
			boolean isCreated = file.createNewFile();
			System.out.println("Criado: " + isCreated);

		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * delete, como o próprio nome sugeri, deleta o arquivo de referência, mas não
		 * lança exceção
		 */
		boolean isDeleted = file.delete();
		System.out.println("Deletado: " + isDeleted);

		/*
		 * Verificando se o arquivo existe com o exists (ele não precisa ter sido
		 * necessariamente criado pelo classe File para ser identificado)
		 */
		System.out.println("Arquivo existe: " + file2.exists());

		/*
		 * Pegando o path do arquivo: Pelo que entendi o getPath retorna o caminho
		 * relativo do arquivo, a parti da pasta src e o getAbsolutePath retorna o
		 * caminho absoluto, a parti da pasta raiz.
		 */
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());

		// Podemos verificar algumas propriedades do "arquivo"
		/*
		 * retorna se o objeto apontado é um arquivo (true), caso o 
		 * objeto não seja um arquivo ou não exista, retorna false.
		 */
		System.out.println("É um arquivo: " + file2.isFile());

		/*
		 * retorna se o objeto apontado é um diretório/pasta (true), 
		 * caso contrário retorna false
		 */
		System.out.println("É um diretório/pasta: " + directory.isDirectory());
		
		//Verifica se o arquivo é oculto
		System.out.println("É oculto: " + file.isHidden());
		
		//pegando a última modificação no arquivo em milisegundos, o restante é formnatação da data.	
		long ultimaModificacaoMiliSegundos = file2.lastModified();
		Instant ultimaModificacaoInstant = Instant.ofEpochMilli(ultimaModificacaoMiliSegundos);
		LocalDateTime ultimaModificacao = LocalDateTime.ofInstant(ultimaModificacaoInstant, ZoneId.systemDefault());
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/mm/yy HH:mm");
		

		System.out.println("Última modificação no \"arquivo2.txt\": " + ultimaModificacao.format(pattern));
		
	}
}
