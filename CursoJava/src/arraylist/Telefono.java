/**
 * 
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author José Navarro
 *
 */
public class Telefono {
	
	private ArrayList<Contacto> contactos;
	
	
	
	
	/**
	 * @param contactos
	 */
	public Telefono(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}
	
	

	/**
	 * @return the contactos
	 */
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}



	/**
	 * @param contactos the contactos to set
	 */
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}



	public void imprimirFor()
	{
		for (int i = 0; i < this.contactos.size(); i++) {
			System.out.println(this.getContactos().get(i));
		}
			
		
	}
	
	public void imprimirForeach()
	{
		for (Contacto contacto : this.getContactos()) {
			System.out.println(contacto);
		}
	}
	
	public void imprimirIterador()
	{
		Iterator<Contacto> iterator = this.getContactos().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for (Iterator<Contacto> iterator2 = contactos.iterator(); iterator2.hasNext();) {
			System.out.println(  iterator2.next() );
			
		}
	}
	
	

}
