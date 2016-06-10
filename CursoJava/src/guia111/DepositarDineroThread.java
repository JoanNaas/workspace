/**
 * 
 */
package guia111;

/**
 * @author jose bueno pal mio 
 *
 */
public class DepositarDineroThread extends Thread {

	private CuentaBancaria cuentabancaria;
	private int dineroADepositar;
	
	
	
	/**
	 * @param cuentabancaria
	 * @param dineroADepositar
	 */
	public DepositarDineroThread(CuentaBancaria cuentabancaria, int dineroADepositar) {
		super();
		this.cuentabancaria = cuentabancaria;
		this.dineroADepositar = dineroADepositar;
	}



	/**
	 * @return the cuentabancaria
	 */
	public CuentaBancaria getCuentabancaria() {
		return cuentabancaria;
	}



	/**
	 * @param cuentabancaria the cuentabancaria to set
	 */
	public void setCuentabancaria(CuentaBancaria cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}



	/**
	 * @return the dineroADepositar
	 */
	public int getDineroADepositar() {
		return dineroADepositar;
	}



	/**
	 * @param dineroADepositar the dineroADepositar to set
	 */
	public void setDineroADepositar(int dineroADepositar) {
		this.dineroADepositar = dineroADepositar;
	}



	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		cuentabancaria.depositarDinero(this.getDineroADepositar());
	}
	
	
}
