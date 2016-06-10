package guia12;

public class Usuario2 {
	
	private String nombre;
	private String password;
	private String email;
	/**
	 * @param nombre
	 * @param password
	 * @param email
	 */
	public Usuario2(String nombre, String password, String email) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.email = email;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
