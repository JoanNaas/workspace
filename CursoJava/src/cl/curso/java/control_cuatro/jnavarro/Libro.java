/**
 * 
 */
package cl.curso.java.control_cuatro.jnavarro;

/**
 * @author José Navarro
 *
 */



/*
 * Esta clase es la plantilla para generar libros con stock
 */
public class Libro {
	
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;
	
	
	public Libro()
	{
		this.nombre = "papelucho";
		this.editorial = "Ercilla";
		this.cantidadLibros = 2;
		this.cantidadLibrosPrestados = 1;
	}
	
	
	
	/**
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
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
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}
	/**
	 * @param cantidadLibros the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}
	/**
	 * @param cantidadLibrosPrestados the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}
	
	/*
	 * Metodo para reservar un libro del stock
	 */
	public synchronized void reservarLibro()
	{
		if (getCantidadLibros() > 0) {
			this.setCantidadLibros(getCantidadLibros() - 1);
			this.setCantidadLibrosPrestados(getCantidadLibrosPrestados() + 1);
			System.out.println("Libros prestados : " + getCantidadLibrosPrestados());
			System.out.println("Libros en stock : " + getCantidadLibros());
		}
		else
		{
			System.out.println("No hay stock");
		}
		
	}
	
	/*
	 * Metodo para devolver un libro
	 */
	
	public synchronized void devolverLibro()
	{
		if (getCantidadLibrosPrestados() > 0) {
			this.setCantidadLibros(getCantidadLibros() + 1);
			this.setCantidadLibrosPrestados(getCantidadLibrosPrestados() - 1);
			System.out.println("Libros prestados : " + getCantidadLibrosPrestados());
			System.out.println("Libros en stock : " + getCantidadLibros());
			
			
		}
		else
		{
			System.out.println("Ese libro no lo hemos prestado, ¿ Lo desea donar ?");
		}
		
		
	}

}
