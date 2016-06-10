/**
 * 
 */
package guia9;

/**
 * @author José Navarro
 *
 */
public class Libro {

	private String nombre;
	private String autor;
	private String editorial;
	private long isbn;
	/**
	 * @param nombre
	 * @param autor
	 * @param editorial
	 * @param isbn
	 */
	public Libro(String nombre, String autor, String editorial, long isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	/**
	 * @return the isbn
	 */
	public long getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public boolean verificarISBN()
	{
		return
	}
	
}
