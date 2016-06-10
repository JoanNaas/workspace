/**
 * 
 */
package clase195;

/**
 * @author José Navarro
 *
 */
public class ProgramaConexion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			ConexionAbierta open = new ConexionAbierta();
			Conexion conexion = new Conexion(open);
			conexion.cerrar();
			
		} catch (ConexionAbiertaEx e) {
			// TODO: handle exception
			
			System.out.println( e.getMessage());
		}

		
		ConexionCerrada close = new ConexionCerrada();
		Conexion conexionclose = new Conexion(close);
		conexionclose.cerrar();
		
	}

}
