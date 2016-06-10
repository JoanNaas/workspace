/**
 * 
 */
package ejercicioCanciones;

import java.util.ArrayList;

/**
 * @author José Navarro
 *
 */
public class Usuario {

	private String nombre;
	private ArrayList<PlayList> playList;
	
	public Usuario()
	{
		this.nombre = "Joan";
		this.playList = new ArrayList<>();
	}
	
	
	/**
	 * @param nombre
	 * @param playList
	 */
	public Usuario(String nombre, ArrayList<PlayList> playList) {
		super();
		this.nombre = nombre;
		this.playList = playList;
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
	 * @return the playList
	 */
	public ArrayList<PlayList> getPlayList() {
		return playList;
	}
	/**
	 * @param playList the playList to set
	 */
	public void setPlayList(ArrayList<PlayList> playList) {
		this.playList = playList;
	}
	
	
	
}
