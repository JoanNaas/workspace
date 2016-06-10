/**
 * 
 */
package cl.curso.java.control_cinco.jnavarro;

import java.util.ArrayList;

/**
 * @author José Navarro
 *
 */
public class ProgramaEmpleados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Departamento OTI = new Departamento();
		
		Departamento RRHH = new Departamento("Recursos Humanos", "Area destinada al manejo de personas");
		
		Empleado jose = new Empleado("18.608.588-4", "Jose", "Navarro", 22, OTI, 250000);
		
		Empleado bastian = new Empleado("1-9", "Bastian", "Perez", 18, RRHH, 150000);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		Empresa accenture = new Empresa("Accenture", empleados);
		
		empleados.add(jose);
		empleados.add(bastian);
	
		accenture.buscarEmpleado("18.608.588-4");
		
		
		
		
		
		
		
	}

}
