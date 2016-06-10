/**
 * 
 */
package guia111;

/**
 * @author José Navarro
 *
 */
public class ProgramaCuentaBancaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria bancoestado = new CuentaBancaria(1000000, 123456);
		
		RetirarDineroThread retirar = new RetirarDineroThread(bancoestado, 50000);
		RetirarDineroThread retirar2 = new RetirarDineroThread(bancoestado, 50000);
		RetirarDineroThread retirar3 = new RetirarDineroThread(bancoestado, 50000);
		
		DepositarDineroThread depositar = new DepositarDineroThread(bancoestado, 100000);
		DepositarDineroThread depositar2 = new DepositarDineroThread(bancoestado, 100000);
		DepositarDineroThread depositar3 = new DepositarDineroThread(bancoestado, 100000);
		
		
		System.out.println(bancoestado.getSaldo());
		
		retirar.start();
		retirar2.start();
		retirar3.start();
		
		depositar.start();
		depositar2.start();
		depositar3.start();
		
		

	}

}
