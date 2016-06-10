package ejercicios.thread;

public class Asiento {

	private boolean reservado;

	public Asiento() {
		super();
		this.reservado = false;
	}

	/**
	 * @return the asiento
	 */
	public boolean isAsiento() {
		return reservado;
	}

	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(boolean reservado) {
		this.reservado = reservado;
	}
	
}
