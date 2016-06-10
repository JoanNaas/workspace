/**
 * 
 */
package clase195;

/**
 * @author José Navarro
 *
 */
public class ConexionAbierta extends EstadoConexion {

	
	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new ConexionAbiertaEx("El estado de la conexion es abierta");
	}

	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.setEstadoConexion(new ConexionCerrada());
		
	}

}
