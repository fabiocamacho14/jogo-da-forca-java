package br.com.fabio.jogodaforca;

/**
 * Exce��o que indica que o caractere digitado � inv�lido por algum motivo
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
