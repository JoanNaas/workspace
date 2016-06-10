package clase195;

public class Semaforo {
	
	private EstadoSemaforo estadoSemaforo;

	/**
	 * @param estadoSemaforo
	 */
	public Semaforo(EstadoSemaforo estadoSemaforo) {
		super();
		this.estadoSemaforo = estadoSemaforo;
	}

	/**
	 * @return the estadoSemaforo
	 */
	public EstadoSemaforo getEstadoSemaforo() {
		return estadoSemaforo;
	}

	/**
	 * @param estadoSemaforo the estadoSemaforo to set
	 */
	public void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}
	
	public void cambiarColor()
	{
		this.getEstadoSemaforo().siguienteColor(this);
		System.out.println(this.getEstadoSemaforo());
		
	}

}
