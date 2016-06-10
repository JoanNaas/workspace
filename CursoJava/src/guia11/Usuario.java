/**
 * 
 */
package guia11;


/**
 * @author José Navarro
 *
 */
public class Usuario extends Throwable{

	
	private String nombreUsuario;
	private String password ;
	private int intentoFallidos;
	
	
	public Usuario()
	{
		this.nombreUsuario = "jose";
		this.password = "123456";
		this.intentoFallidos = 0;
	}
	
	
	
	/**
	 * @param nombreUsuario
	 * @param password
	 * @param intentoFallidos
	 */
	public Usuario(String nombreUsuario, String password, int intentoFallidos) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.intentoFallidos = intentoFallidos;
	}
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the intentoFallidos
	 */
	public int getIntentoFallidos() {
		return intentoFallidos;
	}
	/**
	 * @param intentoFallidos the intentoFallidos to set
	 */
	public void setIntentoFallidos(int intentoFallidos) {
		this.intentoFallidos = intentoFallidos;
	}
	
	public void login()
	{
		if(this.getIntentoFallidos() >= 3)
		{
			throw new 
		}
		
		
	}
	
}
