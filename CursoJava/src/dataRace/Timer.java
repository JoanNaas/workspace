/**
 * 
 */
package dataRace;

/**
 * @author José Navarro
 *
 */
public class Timer extends Thread {
	
	private Reloj reloj;

	
	/**
	 * @param reloj
	 */
	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run( ) {
		// TODO Auto-generated method stub
		
		
		while (this.getReloj().isEncendido()) {
			this.getReloj().horaActual();
			this.getReloj().mostrar();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
			
			
			
			
		
		
		
		
		
	}

}
