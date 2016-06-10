/**
 * 
 */
package dataRace;

/**
 * @author José Navarro
 *
 */
public class ApagarReloj extends Thread {
	
	private Reloj reloj;
	private long milisegundos;
	/**
	 * @param reloj
	 * @param milisegundos
	 */
	public ApagarReloj(Reloj reloj, long milisegundos) {
		super();
		this.reloj = reloj;
		this.milisegundos = milisegundos;
	}
	/**
	 * @return the reloj
	 */
	public Reloj getReloj() {
		return reloj;
	}
	/**
	 * @param reloj the reloj to set
	 */
	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}
	/**
	 * @return the milisegundos
	 */
	public long getMilisegundos() {
		return milisegundos;
	}
	/**
	 * @param milisegundos the milisegundos to set
	 */
	public void setMilisegundos(long milisegundos) {
		this.milisegundos = milisegundos;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			sleep(getMilisegundos());
		} catch (Exception e) {
			// TODO: handle exception
		}
		reloj.setEncendido(false);
		
		
	}

}
