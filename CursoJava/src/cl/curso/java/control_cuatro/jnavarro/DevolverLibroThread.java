/**
 * 
 */
package cl.curso.java.control_cuatro.jnavarro;

/**
 * @author José Navarro
 *
 */
public class DevolverLibroThread extends Thread {
	
	private Libro libro;
	
	
	public DevolverLibroThread() {
		super();
		this.libro = new Libro();
	}

	/**
	 * @param libro
	 */
	public DevolverLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		getLibro().devolverLibro();
	}

}
