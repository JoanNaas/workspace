/**
 * 
 */
package hilos;

/**
 * @author José Navarro
 *
 */
public class Bomba extends Thread{

	private String[] numero = {"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};

	public void run()
	{
		for( int i = 9; i >= 0; i--){
			try {
				System.out.println(numero[i]);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				// TODO Auto-generated catch block
				ie.printStackTrace();
			}
		}
	}
	
	public static void main(String[] s) throws InterruptedException
	{
		Bomba bomba = new Bomba();
		System.out.println("Comienza la cuenta regresiva");
		bomba.start();
		bomba.join();
		System.out.println("Boom!!!");
	}
	
}
