/**
 * 
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author José Navarro
 *
 */
public class ProgramaInsert {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
		String password = JOptionPane.showInputDialog("Ingrese password");
		
		PreparedStatement st = (PreparedStatement) conexion.prepareStatement("select * from usuarios where " + "nombre_usuario = ? AND " + "password = ?;");
		st.setString(1, nombreUsuario);
		st.setString(2, password);
		
		ResultSet rs = st.executeQuery();
		if (rs.next()) {
			JOptionPane.showMessageDialog(null, "Acceso Correcto");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Acceso denegado");
		}
	}

}
