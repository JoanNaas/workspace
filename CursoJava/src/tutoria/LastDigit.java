/**
 * 
 */
package tutoria;

/**
 * @author José Navarro
 *
 */
public class LastDigit {
	
	private int n1;
	private int n2;
	
	

	/**
	 * @param n1
	 * @param n2
	 */
	public LastDigit(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}



	/**
	 * @return the n1
	 */
	public int getN1() {
		return n1;
	}



	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}



	/**
	 * @return the n2
	 */
	public int getN2() {
		return n2;
	}



	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(int n2) {
		this.n2 = n2;
	}



	public boolean comprobar(int n1, int n2)
	{
		return( n1 % 10 == n2 % 10);
	}
	
	public void imprimir()
	{
		System.out.println(comprobar(getN1(), getN2()));
	}
	
	
	
}
