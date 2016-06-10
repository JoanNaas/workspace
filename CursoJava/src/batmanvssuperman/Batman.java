package batmanvssuperman;

public class Batman extends SuperHeroe{

	/* (non-Javadoc)
	 * @see batmanvssuperman.SuperHeroe#recibirAtaque(batmanvssuperman.Arma)
	 */
	
	private int hp;
	
	
	/**
	 * @param hp
	 */
	public Batman(int hp) {
		super();
		this.hp = hp;
	}




	public void recibirAtaque(Arma armax) {
		// TODO Auto-generated method stub
		
		if ( armax instanceof Granada )
		{
			hp = 0;
			System.out.println("Vida " + hp);
			System.out.println("Batman is dead");
		}
		else
		{
			System.out.println("Batman es inmune a tu ataque");
			System.out.println("Vida " + hp);
		}
		
	}

	

	

	
}
