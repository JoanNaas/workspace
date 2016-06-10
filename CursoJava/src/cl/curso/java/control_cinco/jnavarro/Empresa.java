/**
 * 
 */
package cl.curso.java.control_cinco.jnavarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


/**
 * @author José Navarro
 *
 */
public class Empresa {

	private String nombre;
	private List<Empleado> empleados;

	/**
	 * 
	 */
	public Empresa() {
		// TODO Auto-generated constructor stub
		this.nombre = "accenture";
		this.empleados = new ArrayList<>();
	}

	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados
	 *            the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void ordenarEmpleadosPorNombre() {
		Collections.sort(empleados, new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
	}

	public void ordenarEmpleadosPorDepartamento()
	{
		Collections.sort(empleados, new Comparator<Empleado>() {

			@Override
			public int compare(Empleado d1, Empleado d2) {
				// TODO Auto-generated method stub
				if (d1.getDepartamento().getNombre().equals(d2.getDepartamento().getNombre()) ) {
					return 1;
				}
				return -1;
			}
		}); 

			
	}

	public Empleado buscarEmpleado(String rut) {
		
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.contains(rut)) {
				return this.getEmpleados().get(i);
			}
		}
		return null;
	}

	public void imprimir() {
		
		Iterator<Empleado> iterator = this.getEmpleados().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
