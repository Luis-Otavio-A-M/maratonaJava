package maratona.exception.customException;

public class LoginInvalidoException extends Exception{

	public LoginInvalidoException() {
		super("Login inválido");
	}
	
	public LoginInvalidoException(String err) {
		super("Login inválido: " + err);
	}
}
