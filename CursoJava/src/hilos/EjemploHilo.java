/**
 * 
 */
package hilos;

/**
 * @author Jos� Navarro
 *
 */
public class EjemploHilo extends Thread {


	public void run()
	{
		try {//intento
			sleep(1000);
		} catch (InterruptedException e) {//capturar error
			// TODO: handle exception
		}
		System.out.println("El nombre del thread es : " + getName());
	}

}
