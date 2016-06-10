/**
 * 
 */
package piedrapapelotijera;

/**
 * @author José Navarro
 *
 */
public class Tijera extends Jugada {

	/* (non-Javadoc)
	 * @see piedrapapelotijera.Jugada#Jugar(piedrapapelotijera.Jugada)
	 */
	public void jugar(Jugada movimiento) {
		// TODO Auto-generated method stub

		if (movimiento instanceof Tijera)
		{
			System.out.println("Empate");
		}
		else
		{
			if ( movimiento instanceof Papel)
			{
				System.out.println("Gana tijera");
			}
			else
			{
				if (movimiento instanceof Piedra)
				{
					System.out.println("Gana piedra");
				}
			}
		}
		
	}

}
