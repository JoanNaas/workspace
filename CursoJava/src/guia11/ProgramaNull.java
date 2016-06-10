/**
 * 
 */
package guia11;

import javax.swing.JOptionPane;

/**
 * @author José Navarro
 *
 */
public class ProgramaNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String mensaje = JOptionPane.showInputDialog("ingrese un numero").trim();
			System.out.println("Largo del numero ingresado es " + mensaje.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		

	}

}
