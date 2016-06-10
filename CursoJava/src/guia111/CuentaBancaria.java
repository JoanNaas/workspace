/**
 * 
 */
package guia111;


/**
 * @author José Navarro
 *
 */
public class CuentaBancaria {
	
	private int saldo;
	private int numeroCuenta;
	/**
	 * @param saldo
	 * @param numeroCuenta
	 */
	public CuentaBancaria(int saldo, int numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public synchronized void depositarDinero(int dineroADepositar)
	{
		this.setSaldo(this.getSaldo() + dineroADepositar);
		System.out.println(this.getSaldo());
	}

	public synchronized void retirarDinero(int dineroARetirar)
	{
		this.setSaldo(getSaldo() - dineroARetirar);
		System.out.println(this.getSaldo());
	}
	
}
