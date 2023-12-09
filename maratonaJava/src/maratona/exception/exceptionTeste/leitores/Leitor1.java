package maratona.exception.exceptionTeste.leitores;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

public class Leitor1 implements Closeable {
	private static final Random RANDOM = new Random();
	
	@Override
	public void close() throws IOException {
		if(RANDOM.nextInt(3) == 1) {
			throw new IOException("BOOOOOOOOOOOOOOM, explodiu foi tudo mesmo!");			
		}
		System.out.println("Fechando o leitor 1");
	}

}
