/**
 * 
 */
package ejercicioCanciones;

/**
 * @author Jos� Navarro
 *
 */
public class Cancion {
	
	private String nombre;
	private String artista;
	private double duracionMinutos;
	
	public Cancion()
	{
		this.nombre = "Fuma";
		this.artista = "Inkognito";
		this.duracionMinutos = 3.20;
	}
	
	
	/**
	 * @param nombre
	 * @param artista
	 * @param duracionMinutos
	 */
	public Cancion(String nombre, String artista, double duracionMinutos) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMinutos = duracionMinutos;
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
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}
	/**
	 * @param artista the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}
	/**
	 * @return the duracionMinutos
	 */
	public double getDuracionMinutos() {
		return duracionMinutos;
	}
	/**
	 * @param duracionMinutos the duracionMinutos to set
	 */
	public void setDuracionMinutos(double duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof PlayList) {
			PlayList lista = (PlayList) obj;
			return (this.getNombre().equals(lista.getNombre()) && this.getArtista().equals(lista.getNombre()));
		}
		return false;
	}
	
	
	

}
