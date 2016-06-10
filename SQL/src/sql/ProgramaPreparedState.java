/**
 * 
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Jos� Navarro
 *
 */
public class ProgramaPreparedState {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
		PreparedStatement pstatementInsert = (PreparedStatement) conexion.prepareStatement("INSERT INTO alumnos (idalumno, nombre ,apellido,apellidoMaterno)" + "VALUE (?,?,?,?);");
		pstatementInsert.setInt(1, 44);
		pstatementInsert.setString(2, "James");
		pstatementInsert.setString(3, "Gosling");
		pstatementInsert.setString(4, "lion");
		int resultpInsert = pstatementInsert.executeUpdate();
		System.out.println(resultpInsert);
	}

}
