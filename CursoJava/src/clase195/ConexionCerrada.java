/**
 * 
 */
package clase195;

/**
 * @author José Navarro
 *
 */
public class ConexionCerrada extends EstadoConexion {


	/* (non-Javadoc)
	 * @see clase195.EstadoConexion#abrir(clase195.Conexion)
	 */
	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		
		conexion.setEstadoConexion(new ConexionAbierta());
	}

	/* (non-Javadoc)
	 * @see clase195.EstadoConexion#cerrar(clase195.Conexion)
	 */
	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new ConexionCerradaEx("La conexion ya fue cerrada");
		
	}
	
	

}
