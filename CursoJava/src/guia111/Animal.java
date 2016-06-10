/**
 * 
 */
package guia111;

/**
 * @author José Navarro
 *
 */
public class Animal implements Runnable{
	
	private String nombre;
	private int velocidad;
	private long descanzo;
	private int posicion;
	private static boolean carreraFinallizada;
	
	
	/**
	 * @param nombre
	 * @param velocidad
	 * @param descanzo
	 * @param posicion
	 * @param carreraFinallizada
	 */
	public Animal(String nombre, int velocidad, long descanzo, int posicion, boolean carreraFinallizada) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.descanzo = descanzo;
		this.posicion = posicion;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the descanzo
	 */
	public long getDescanzo() {
		return descanzo;
	}

	/**
	 * @param descanzo the descanzo to set
	 */
	public void setDescanzo(long descanzo) {
		this.descanzo = descanzo;
	}


	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	/**
	 * @return the carreraFinallizada
	 */
	public boolean isCarreraFinallizada() {
		return carreraFinallizada;
	}


	/**
	 * @param carreraFinallizada the carreraFinallizada to set
	 */
	public void setCarreraFinallizada(boolean carreraFinallizada) {
		Animal.carreraFinallizada = carreraFinallizada;
	}

	public void seDesplaza() throws InterruptedException
	{
		this.setPosicion(getPosicion() + getVelocidad());
		Thread.sleep((long) (0 + (Math.random()  * this.descanzo))); 
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (getPosicion() <= 100 && carreraFinallizada == false) {
			try {
				seDesplaza();
				if (getPosicion() >= 100) {
					this.setCarreraFinallizada(true);
					imprimir();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void imprimir()
	{
		if(getPosicion() >= 100)
		{
			System.out.println("Nombre :" + getNombre() + "| velocidad : " + getVelocidad() + "| posicion : " + getPosicion() + "| Ganador");
		}
			
	}
	

}
