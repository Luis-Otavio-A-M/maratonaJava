package maratona.classesUtilitarias.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste {
	public static void main(String[] args) {
		/*
		 * Criamos o file, para passar como parâmetro para o FileWriter, e neste caso, a
		 * criaçao da classe sempre lançará uma IOException, pois está sendo alocado um
		 * recurso (o arquivo) e este já pode está sendo alocado por outro processo. E
		 * por está sendo alocado um recurso pelo sistema operacional, é necessário
		 * desalocalo, para isso, usamos ou o método close ou usamos um try with
		 * resources
		 */
		File file = new File("maratona\\classesUtilitarias\\io\\folder\\fileWriter.txt");
		try (FileWriter fw = new FileWriter(file)) {
			/* o método write, como o nome sugeri, é utilizado para escrever no arquivo, mas
			 * ele sobrescreve o conteúdo que já existe. para que isso não ocorre é necessário 
			 * habilitar o modo append ao criar o fileWriter, veremos logo abaixo
			 */
			fw.write("Testando a escrita em arquivos, estou escrevendo muito para ver se será escrito "
					+ "menos caracteres por causa do método ter sido encerrado antes de todos os "
					+ "dados serem enviados ao buffer de escrita\n");

			/*
			 * Pelo o que eu entendi, o método flush é utilizado para força que os dados
			 * escritos no buffer, já sejam escritos no arquivo sem esperar que o buffer
			 * seja cheio para que isso ocorra. Isso é feito quando os dados salvos são
			 * críticos, pois existe a possibilidade do recurso ser fechado ou o programa
			 * finalizado antes de todos os dados serem armazenados pelo buffer, e o flush
			 * acelera esse processo, mas ele possui um custo elevado, que na maioria dos
			 * casos, não vale o custo benefício, assim, deixando a gestão do buffer para a
			 * JVM.
			 */
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Criando um FileWriter com o modo apêndece habilitado.
		File file2 = new File("maratona\\classesUtilitarias\\io\\folder\\fileWriter2.txt");
		try (FileWriter fw2 = new FileWriter(file2, true)){ //habilitando modo apêndice no segundo parâmetro
			fw2.write("Testando o modo apêndice...\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
