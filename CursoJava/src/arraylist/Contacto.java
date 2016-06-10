/**
 * 
 */
package arraylist;

/**
 * @author Jos� Navarro
 *
 */
public class Contacto {

	private String nombre;
	private int telefono;
	private String email;
	
	public Contacto()
	{
		this.nombre = "Jose";
		this.telefono = 49004592;
		this.email = "lalalaa@gmail.com";
	}
	
	
	
	
	
	/**
	 * @param nombre
	 * @param telefono
	 * @param email
	 */
	public Contacto(String nombre, int telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
