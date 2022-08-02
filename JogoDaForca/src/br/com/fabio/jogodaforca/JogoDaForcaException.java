package br.com.fabio.jogodaforca;

/**
 * Representa uma exceção genérica ocorrida no jogo
 */
@SuppressWarnings("serial")
public class JogoDaForcaException extends Exception {

	/**
	 * @see Exception#Exception(String, Throwable)
	 * @param message Mensagem
	 * @param cause Exceção causa
	 */
	public JogoDaForcaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @see Exception#Exception(String)
	 * @param message Mensagem
	 */
	public JogoDaForcaException(String message) {
		super(message);
	}
}
