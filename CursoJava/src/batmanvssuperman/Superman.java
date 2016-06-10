/**
 * 
 */
package batmanvssuperman;

/**
 * @author José Navarro
 *
 */
public class Superman extends SuperHeroe {

	
	private int hp;
	
	/**
	 * @param hp
	 */
	public Superman(int hp) {
		super();
		this.hp = hp;
	}

	/* (non-Javadoc)
	 * @see batmanvssuperman.SuperHeroe#recibirAtaque(batmanvssuperman.Arma)
	 */
	@Override
	public void recibirAtaque(Arma Criptonita) {
		// TODO Auto-generated method stub
		
		if ( armax instanceof Granada )
		{
			System.out.println("Superman es inmune a tu ataque");
			System.out.println("Vida " + hp);
		}
		else
		{
			hp = 0;
			System.out.println("Vida " + hp);
			System.out.println("Superman is dead");
		}
	}

	

	
}
