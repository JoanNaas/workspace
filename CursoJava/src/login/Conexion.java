/**
 * 
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Jos� Navarro
 *
 */
public class Conexion {
	
	private static Conexion conexion;
	private Connection connection;
	
	/**
	 * 
	 */
	private Conexion() {
		// TODO Auto-generated constructor stub
	}
	
	public static Conexion getInstancia()
	{
		if (conexion == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
				
				Conexion conexion = new Conexion();
				conexion.setConnection(connection);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new ConexionException("Ocurrio un error" + " al conectar con la base de datos", e);
			}
			
			return conexion;
		}
		return null;
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	
	
}
