/**
 * 
 */
package guia12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author José Navarro Astudillo
 *
 *
 */
public class Agenda {

	private String nombre;
	private List<Evento> eventos;
	/**
	 * @param nombre
	 * @param eventos
	 */
	public Agenda(String nombre, List<Evento> eventos) {
		super();
		this.nombre = nombre;
		this.eventos = eventos;
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
	 * @return the eventos
	 */
	public List<Evento> getEventos() {
		return eventos;
	}
	/**
	 * @param eventos the eventos to set
	 */
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void ordenarPorFecha()
	{
		Collections.sort(eventos, new Comparator<Evento>() {

			@Override
			public int compare(Evento o1, Evento o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
	
	public void agregarEvento(Evento evento)
	{
		if (!(this.eventos.contains(evento))) {
			this.eventos.add(evento);
			System.out.println("Se agrego evento");
		}
		else
		{
			System.out.println("El evento ya esta creado, elige otro dia");
		}
	}
	
	public void eliminarEvento(Evento evento)
	{
		if (this.eventos.contains(evento)) {
			this.eventos.remove(evento);
			System.out.println("Se elimino el evento");
		}
	}
	
	public void imprimir()
	{
		for (Evento evento : eventos) {
			System.out.println(""+evento);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
