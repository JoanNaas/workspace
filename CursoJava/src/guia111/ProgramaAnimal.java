/**
 * 
 */
package guia111;

/**
 * @author José Navarro
 *
 */
public class ProgramaAnimal {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread leopardo = new Thread(new Animal("Leopardo", 10, 30, 1, false));
		Thread tigre = new Thread(new Animal("Tigre", 5, 20, 2, false));
		Thread leon = new Thread(new Animal("Leon", 3, 30, 3, false));
		
		
		leopardo.start();
		leon.start();
		tigre.start();
		
		leon.join();
		leopardo.join();
		tigre.join();

	}

}
