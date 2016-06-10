/**
 * 
 */
package dataRace;

/**
 * @author José Navarro
 *
 */
public class Contador {
	
	private int cuenta;
	
	public Contador()
	{
		this.cuenta = 1;
	}
	
	/**
	 * @param cuenta
	 */
	public Contador(int cuenta) {
		super();
		this.cuenta = cuenta;
	}



	/**
	 * @return the cuenta
	 */
	public int getCuenta() {
		return cuenta;
	}



	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}



	public synchronized void aumentaCuenta()
	{
//		synchronized (this) {
//			Para solo ocupar una parte del metodo.
//		}
			this.cuenta++;
			System.out.println(cuenta);
		
		
	}

}
