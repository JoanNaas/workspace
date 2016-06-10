/**
 * 
 */
package clase185;

/**
 * @author José Navarro
 *
 */
public class Division {

	private int dividendo;
	private int divisor;
	private double resultado;

	/**
	 * @param dividendo
	 * @param divisor
	 */
	public Division(int dividendo, int divisor) {
		super();
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	/**
	 * @return the dividendo
	 */
	public int getDividendo() {
		return dividendo;
	}

	/**
	 * @param dividendo
	 *            the dividendo to set
	 */
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	/**
	 * @return the divisor
	 */
	public int getDivisor() {
		return divisor;
	}

	/**
	 * @param divisor
	 *            the divisor to set
	 */
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	/**
	 * @return the resultado
	 */
	public double getResultado() {
		return resultado;
	}

	/**
	 * @param resultado
	 *            the resultado to set
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double hacerDivision( )
	{
		return this.getDividendo() / this.getDivisor();
	}

}
