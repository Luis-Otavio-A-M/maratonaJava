package maratona.exception.customException;

import java.util.Scanner;

public class LoginInvalidoTeste {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}
	
	private static void logar() throws LoginInvalidoException {
		String usernameDB = "username";
		String passwordDB = "password";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Usuário: ");
		String usernameInformado = scanner.nextLine();
		System.out.print("Senha: ");
		String passwordInformado = scanner.nextLine();
		
		if( !usernameDB.equals(usernameInformado) || !passwordDB.equals(passwordInformado)) {
			throw new LoginInvalidoException();
		}
		
		System.out.println("Usuário logado com sucesso!");
	}
}
