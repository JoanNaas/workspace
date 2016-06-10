package piedrapapelotijera;

public class Piedra extends Jugada {

	@Override
	public void jugar(Jugada movimiento) {
		// TODO Auto-generated method stub
		
		if (movimiento instanceof Tijera)
		{
			System.out.println("Gana Piedra");
		}
		else
		{
			if ( movimiento instanceof Papel)
			{
				System.out.println("Gana Papel");
			}
			else
			{
				if (movimiento instanceof Piedra)
				{
					System.out.println("Empata piedra");
				}
			}
		}
	}

}
