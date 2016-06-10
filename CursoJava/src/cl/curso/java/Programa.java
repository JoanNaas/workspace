/**
 * 
 */
package cl.curso.java;

/**
 * @author usuario
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha();
		Fecha fecha2 = new Fecha(11, 5, 2016);
		
		fecha1.imprimirFechaFormato();
		
		fecha2.imprimirFechaFormato();
		
		System.out.println( fecha1.validarMes());
		System.out.println( fecha2.validarMes());
		
		System.out.println( fecha1.validarDia());
		System.out.println( fecha2.validarDia());
		
		System.out.println(fecha1.toString());
	
	}

}
