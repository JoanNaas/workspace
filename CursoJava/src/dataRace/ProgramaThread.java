/**
 * 
 */
package dataRace;

/**
 * @author José Navarro
 *
 */
public class ProgramaThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contador contador = new Contador(0);
		
		AumentaThread uno = new AumentaThread(contador);
		AumentaThread dos = new AumentaThread(contador);
		
		uno.start();
		dos.start();

	}

}
