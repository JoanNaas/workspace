/**
 * 
 */
package piedrapapelotijera;

/**
 * @author José Navarro
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Piedra piedra = new Piedra();
		Papel papel = new Papel();
		Tijera tijera = new Tijera();
		
		piedra.jugar(tijera);
		papel.jugar(piedra);
		tijera.jugar(papel);
		
	}

}
