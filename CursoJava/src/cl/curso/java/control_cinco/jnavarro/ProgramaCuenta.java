/**
 * 
 */
package cl.curso.java.control_cinco.jnavarro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Jos� Navarro
 *
 */
public class ProgramaCuenta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar hoy = Calendar.getInstance();
		Calendar manana =new GregorianCalendar(2016, 7, 7);
		
		Date manana1 = manana.getTime();
		Date hoy1 = hoy.getTime();
		
		Transaccion deposito = new Transaccion("1234", "deposito", hoy1, 10000);
		Transaccion deposito2 = new Transaccion("12345", "retiro", manana1, 5000);
		Transaccion deposito3 = new Transaccion("1234", "deposito", hoy1, 10000);
		
		
		ArrayList<Transaccion> Transacciones = new ArrayList<>();
		
		CuentaBancaria jose = new CuentaBancaria(123456, Transacciones);
		
		Transacciones.add(deposito);
		Transacciones.add(deposito2);
		Transacciones.add(deposito3);
		
		jose.imprimir();
		
		System.out.println("-------------------------------------------");
		
		jose.ordenarTransaccionesPorFecha();
		
		jose.imprimir();
		
		System.out.println("-------------------------------------------");
		
		jose.ordenarTransaccionesPorTipo();
		
		jose.imprimir();
		
		System.out.println("-------------------------------------------");

	}

	

}
