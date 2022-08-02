package br.com.fabio.jogodaforca;

/**
 * Exceção que indica que o caractere digitado é inválido por algum motivo
 */
@SuppressWarnings("serial")
public class CaractereInvalidoException extends JogoDaForcaException {

	/**
	 * @see JogoDaForcaException#JogoDaForcaException(String)
	 * @param message Mensagem de erro
	 */
	public CaractereInvalidoException(String message) {
		super(message);
	}
}
