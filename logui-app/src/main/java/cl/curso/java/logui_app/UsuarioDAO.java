/**
 * 
 */
package cl.curso.java.logui_app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Jos� Navarro
 *
 */
public class UsuarioDAO {

	public static boolean validar( Usuario usuario) throws SQLException
	{
		Conexion con = Conexion.getInstancia();
		PreparedStatement st = con.getConnection().prepareStatement("select * from usuarios where nombre_usuario = ? AND password = ?;");
		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());
		
		ResultSet rs = st.executeQuery();
		return rs.next();
	}
	
}
