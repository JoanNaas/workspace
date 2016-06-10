/**
 * 
 */
package cl.curso.java.control_cinco.jnavarro;

/**
 * @author Jos� Navarro
 *
 */
public class Departamento {
	
	private String nombre;
	private String descripcion;
	
	/**
	 * 
	 */
	public Departamento() {
		// TODO Auto-generated constructor stub
		this.nombre = "OTI";
		this.descripcion = "Area especializada en problemaas informaticos ";
	}
	
	
	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	};
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Departamento departamento = (Departamento) obj;
		if (this.getNombre() == departamento.getNombre()) {
			return true;
		}
		return false;
	}

}
