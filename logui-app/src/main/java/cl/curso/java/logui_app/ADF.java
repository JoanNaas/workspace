/**
 * 
 */
package cl.curso.java.logui_app;

import java.sql.SQLException;

/**
 * @author José Navarro
 *
 */
public class ADF {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(UsuarioDAO.validar(new Usuario("1234567", "123456789", 0)));
	}

}
