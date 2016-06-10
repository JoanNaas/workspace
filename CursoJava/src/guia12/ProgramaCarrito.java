/**
 * 
 */
package guia12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Navarro
 *
 */
public class ProgramaCarrito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto leche = new Producto(123456, "Leche", 1200);
		Producto galletas = new Producto(112233, "Galleta", 600);
		
		List<Producto> colacion = new ArrayList<>();
		
		colacion.add(leche);
		colacion.add(galletas);
		
		CarroCompra carrito = new CarroCompra(new Usuario("jose", "123456"), colacion);
		
		carrito.imprimir();
		carrito.ordenarPorPrecio();
		carrito.imprimir();
		
		
		

	}

}
