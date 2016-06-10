package cl.curso.java;

public class CuentaVista extends CuentaBancaria {

	public void girar( int monto)
	{
		if ((monto + 300) <= this.getSaldo())
		{
			this.setSaldo(this .getSaldo() - 300);
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
	
}
