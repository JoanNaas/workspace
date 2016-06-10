/**
 * 
 */
package dataRace;

/**
 * @author José Navarro
 *
 */
public class ProgramaReloj {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Reloj reloj = new Reloj(50, 59, 23, true);
		
		
		Timer ahora = new Timer(reloj);
		
		ApagarReloj shutdown = new ApagarReloj(reloj, 5000);
		
		ahora.start();
		
		shutdown.run();
		
	
			  
		
		
		

	}

}
