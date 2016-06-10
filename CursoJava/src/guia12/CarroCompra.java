/**
 * 
 */
package guia12;

import java.util.Collections;
import java.util.List;

/**
 * @author José Navarro
 *
 */
public class CarroCompra {
	
	private Usuario usuario;
	private List<Producto> producto;
	/**
	 * @param usuario
	 * @param producto
	 */
	public CarroCompra(Usuario usuario, List<Producto> producto) {
		super();
		this.usuario = usuario;
		this.producto = producto;
	}
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the producto
	 */
	public List<Producto> getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	public void agregarProducto( Producto p)
	{
			this.producto.add(p);
		
	}
	public void eliminarProducto( Producto p)
	{
		if (this.producto.contains(p)) {
			this.producto.remove(p);
		}
		else
		{
			System.out.println("No existe ese producto, no se puede eliminar");
		}
	}
	
	public void ordenarPorPrecio()
	{
		Collections.sort(this.getProducto() ); 
	}
	
	public void imprimir()
	{
		for (int i = 0; i < this.getProducto().size(); i++) {
			System.out.println(this.getProducto().get(i).getPrecio());
		}
	
	}
	

}
