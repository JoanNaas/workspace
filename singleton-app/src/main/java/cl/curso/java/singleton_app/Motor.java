/**
 * 
 */
package cl.curso.java.singleton_app;

/**
 * @author José Navarro
 *
 */
public class Motor {
	
	private static Motor _motor;

	
	/**
	 * @param motor2
	 */
	private Motor() {
		// TODO Auto-generated constructor stub
	}


	public static Motor getInstance()
	{
		if (null  == _motor ) {
			Motor motor = new Motor();
			_motor = motor;
			return _motor;
		}
		return _motor;
		
	}




}
