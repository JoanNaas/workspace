/**
 * 
 */
package guia12;

/**
 * @author José Navarro
 *
 */
public class Producto implements Comparable<Producto>{/* (non-Javadoc)
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
@Override
public int compareTo(Producto o) {
	if (this.getPrecio() == o.getPrecio()) 
		return 0;
	else
		if (this.getPrecio() > o.getPrecio()) 
		return 1;
		else
		return -1;
}
	
	private int identificador;
	private String nombre;
	private int precio;
	/**
	 * @param identificador
	 * @param nombre
	 * @param precio
	 */
	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		
		Producto producto = (Producto) arg0;
		if (producto instanceof Object) {
			return (this.getIdentificador()==(producto.getIdentificador()));
		}
		return false;
	}
	
	

}
