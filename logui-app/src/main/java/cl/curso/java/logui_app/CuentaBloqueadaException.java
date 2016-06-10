/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.curso.java.logui_app;
/**
 * @author Juan Maldonado León
 *
 */
public class CuentaBloqueadaException extends Exception {

	private static final long serialVersionUID = 4944876324427607785L;

	/**
	 * @param message
	 */
	public CuentaBloqueadaException(String message) {
		super(message);
	}
}
