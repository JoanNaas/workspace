/**
 * 
 */
package cl.curso.java.control_cuatro.jnavarro;

/**
 * @author José Navarro
 *
 */
public class ProgramaLibro {

	/**
	 * @param args
	 */
	
	
	/*
	 * Programa para gestionar la entrega y devolucion de libros
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Libro papelucho = new Libro();
		
		ReservaLibroThread hilo = new ReservaLibroThread(papelucho);
		ReservaLibroThread hilo2 = new ReservaLibroThread(papelucho);
		ReservaLibroThread hilo3 = new ReservaLibroThread(papelucho);
		
		hilo.start();
		hilo2.start();
		hilo3.start();
		
		DevolverLibroThread hilo4 = new DevolverLibroThread(papelucho);
		DevolverLibroThread hilo5 = new DevolverLibroThread(papelucho);
		DevolverLibroThread hilo6 = new DevolverLibroThread(papelucho);
		
		hilo4.start();
		hilo5.start();
		hilo6.start();
		
		
	}

}
