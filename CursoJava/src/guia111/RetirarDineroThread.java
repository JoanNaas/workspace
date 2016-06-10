/**
 * 
 */
package guia111;

/**
 * @author José Navarro
 *
 */
public class RetirarDineroThread extends Thread {
	
	
	private CuentaBancaria cuentaBancaria;
	private int dineroARetirar;
	
	
	
	
	/**
	 * @param cuentaBancaria
	 * @param dineroARetirar
	 */
	public RetirarDineroThread(CuentaBancaria cuentaBancaria, int dineroARetirar) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.dineroARetirar = dineroARetirar;
	}




	/**
	 * @return the cuentaBancaria
	 */
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}




	/**
	 * @param cuentaBancaria the cuentaBancaria to set
	 */
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}




	/**
	 * @return the dineroARetirar
	 */
	public int getDineroARetirar() {
		return dineroARetirar;
	}




	/**
	 * @param dineroARetirar the dineroARetirar to set
	 */
	public void setDineroARetirar(int dineroARetirar) {
		this.dineroARetirar = dineroARetirar;
	}




	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		cuentaBancaria.retirarDinero(getDineroARetirar());
		
	}

}
