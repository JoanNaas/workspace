/**
 * 
 */
package clase195;

/**
 * @author José Navarro
 *
 */
public class Conexion {
	
	private EstadoConexion estadoConexion;
	
	
	
	
	/**
	 * @param estadoConexion
	 */
	public Conexion(EstadoConexion estadoConexion) {
		super();
		this.estadoConexion = estadoConexion;
	}
	/**
	 * @return the estadoConexion
	 */
	public EstadoConexion getEstadoConexion() {
		return estadoConexion;
	}
	/**
	 * @param estadoConexion the estadoConexion to set
	 */
	public void setEstadoConexion(EstadoConexion estadoConexion) {
		this.estadoConexion = estadoConexion;
	}
	
	public void abrir()
	{
		this.getEstadoConexion().abrir(this);
	}
	
	public void cerrar()
	{
		this.getEstadoConexion().cerrar(this);
	}
	

}
