/**
 * 
 */
package hilos;

/**
 * @author José Navarro
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EjemploHilo thread = new EjemploHilo();
		thread.run();
		System.out.println("Metodo main; El nombre del thread es : " +
		Thread.currentThread().getName());
	}

}
