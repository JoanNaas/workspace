/**
 * 
 */
package guia12;

import java.util.Calendar;


/**
 * @author José Navarro Astudillo
 *
 *
 */
public class Evento {

	private String nombre;
	private Calendar fecha;
	/**
	 * @param nombre
	 * @param fecha
	 */
	public Evento(String nombre, Calendar fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
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
	 * @return the fecha
	 */
	public Calendar getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	public boolean equals(Object obj)
	{
		Evento evento = (Evento) obj;
		if (evento instanceof Object) {
			return this.getFecha()== evento.getFecha();
		}
		return false;
		
	}
	
	
	
}
