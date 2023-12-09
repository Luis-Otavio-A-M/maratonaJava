package maratona.exception.exceptionTeste.regrasDeSobrescrita;

import java.io.FileNotFoundException;
import java.io.IOException;

import maratona.exception.customException.LoginInvalidoException;

public class Pessoa {
	
	public void salvar() throws LoginInvalidoException, FileNotFoundException{
		System.out.println("Salvando pessoa");
	}
}
