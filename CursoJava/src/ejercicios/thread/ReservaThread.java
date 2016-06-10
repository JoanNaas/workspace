package ejercicios.thread;

public class ReservaThread extends Thread{
	
	private Bus bus;
	private String nombre;
	private int numeroAsientos;
	
	
	
	public ReservaThread(Bus bus, String nombre, int numeroAsientos) {
		super();
		this.bus = bus;
		this.nombre = nombre;
		this.numeroAsientos = numeroAsientos;
	}

	
	/**
	 * @return the bus
	 */
	public Bus getBus() {
		return bus;
	}




	/**
	 * @param bus the bus to set
	 */
	public void setBus(Bus bus) {
		this.bus = bus;
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
	 * @return the numeroAsientos
	 */
	public int getNumeroAsientos() {
		return numeroAsientos;
	}




	/**
	 * @param numeroAsientos the numeroAsientos to set
	 */
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	
	@Override
	public void run() {
		this.getBus().getAsientos()
	}

	}
	


