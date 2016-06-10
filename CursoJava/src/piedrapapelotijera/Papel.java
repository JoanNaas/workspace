/**
 * 
 */
package piedrapapelotijera;

/**
 * @author José Navarro
 *
 */
public class Papel extends Jugada {

	/* (non-Javadoc)
	 * @see piedrapapelotijera.Jugada#Jugar(piedrapapelotijera.Jugada)
	 */
	@Override
	public void jugar(Jugada movimiento) {
		// TODO Auto-generated method stub
		if (movimiento instanceof Tijera)
		{
			System.out.println("Gana Tijera");
		}
		else
		{
			if ( movimiento instanceof Papel)
			{
				System.out.println("Empata Papel");
			}
			else
			{
				if (movimiento instanceof Piedra)
				{
					System.out.println("Gana Papel");
				}
			}
		}

	}

}
