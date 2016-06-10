/**
 * 
 */
package dataRace;


/**
 * @author José Navarro
 *
 */
public class Reloj {
	
	private int segundos;
	private int minutos;
	private int hora;
	private boolean encendido;
	
	
	
	public Reloj()
	{
		this.segundos = 0;
		this.minutos = 0;
		this.hora = 0;
		this.encendido = true;
	}
	
	
	/**
	 * @param segundos
	 * @param minutos
	 * @param hora
	 */
	public Reloj(int segundos, int minutos, int hora, boolean encendido) {
		super();
		this.segundos = segundos;
		this.minutos = minutos;
		this.hora = hora;
		this.encendido = encendido;
		
	}


	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}


	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}


	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}


	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}


	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	public void horaActual()
	{
		this.segundos++;
		if (this.segundos >= 60) {
			this.setSegundos(0);
			this.setMinutos(this.getMinutos() + 1);
			if (this.minutos >= 60) {
				this.setMinutos(0);
				this.setHora(this.getHora() + 1);
				if (this.hora >= 24) {
					this.setHora(0);
				}
				
			}
		}
	}
	
	public void mostrar() {
		
		System.out.println("Hora : " + this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos() );
		
	}


	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}


	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	

}
