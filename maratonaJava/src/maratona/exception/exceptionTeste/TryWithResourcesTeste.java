package maratona.exception.exceptionTeste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import maratona.exception.exceptionTeste.leitores.Leitor1;
import maratona.exception.exceptionTeste.leitores.Leitor2;

public class TryWithResourcesTeste {
	public static void main(String[] args) {
		lerArquivo2();
	}
	
	private static void lerArquivo() {
		//abrindo um arquivo e tratando os possíveis erros sem o uso do try with resources 
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(reader != null) {
					reader.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void lerArquivo2() {
		//O Java executa automaticamente o close dentro dos objetos, mas para isso, eles devem implementar a interface closable ou autoclosable.
		//A execuão do close, caso seja instanciado mais de um objeto ocorre na ordem inversa da declaração.
		try (Leitor1 leitor1 = new Leitor1(); 
			 Leitor2 leitor2 = new Leitor2()) {
			
		}  catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
