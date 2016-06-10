/**
 * 
 */
package guia10;

/**
 * @author José Navarro
 *
 */
public class EmpleadoContratado extends Empleado {
	
	
	
	
	
	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		// TODO Auto-generated constructor stub
		
		nombre = "Juan";
		horasTrabajadas= 2;
	}
	
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	
	
	/* (non-Javadoc)
	 * @see guia10.Empleado#calcularSalario()
	 */
	@Override
	public int calcularSalario() {
		// TODO Auto-generated method stub
		
		return this.getHorasTrabajadas() * 20000;
	}

}
