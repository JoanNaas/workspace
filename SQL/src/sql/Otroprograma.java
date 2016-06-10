/**
 * 
 */
package sql;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * @author José Navarro
 *
 */
public class Otroprograma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
		String password = JOptionPane.showInputDialog("Ingrese password");

		Statement st = conexion.createStatement();
		ResultSet rd = st.executeQuery("select * from usuarios where " + "nombre_usuario ='" + nombreUsuario + 
				"' AND"+"password = '" + password + "';");
		if (rd.next()) {
			JOptionPane.showMessageDialog(null, "Acceo correcto");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Acceso denegado");
		}
		
		
	}

}
